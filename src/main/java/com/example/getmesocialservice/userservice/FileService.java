package com.example.getmesocialservice.userservice;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.mongodb.AwsCredential;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Service
public class FileService {

	public boolean uploadfile(MultipartFile thefile)  {
		
		BasicAWSCredentials thecredentials= new BasicAWSCredentials("AKIA4SN3FFDWCW7VOWBO","99yUht+iN/W6eS5Q6SSiNaUIILIbtm+FyswK1C4q");
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard().
				withCredentials(new AWSStaticCredentialsProvider(thecredentials)).withRegion(Regions.US_EAST_2).build();
		try {
		    ObjectMetadata metadata = new ObjectMetadata();
			metadata.setContentLength(thefile.getSize());
			metadata.setContentType(thefile.getContentType());
			s3.putObject("mybackendassignments", thefile.getOriginalFilename(),thefile.getInputStream(),metadata);
		    return true;
		} catch (SdkClientException | IOException e) {
	     e.printStackTrace();
		    
	
		return false;
	}
    
}
	public S3Object getfile(String key) {
		BasicAWSCredentials thecredentials= new BasicAWSCredentials("AKIA4SN3FFDWCW7VOWBO","99yUht+iN/W6eS5Q6SSiNaUIILIbtm+FyswK1C4q");
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard().
				withCredentials(new AWSStaticCredentialsProvider(thecredentials)).withRegion(Regions.US_EAST_2).build();
		return s3.getObject("mybackendassignments", key);
	}
	public void deletefile(String key) {
		BasicAWSCredentials thecredentials= new BasicAWSCredentials("AKIA4SN3FFDWCW7VOWBO","99yUht+iN/W6eS5Q6SSiNaUIILIbtm+FyswK1C4q");
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard().
				withCredentials(new AWSStaticCredentialsProvider(thecredentials)).withRegion(Regions.US_EAST_2).build();
		 s3.deleteObject("mybackendassignments", key);
	}
}
