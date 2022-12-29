package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

import com.example.getmesocialservice.validation.Validcreatedby;

public class Photo {
	
	@Id
	private String id;
	
	private int albid;
	
	private String photourl;
	
	@Validcreatedby
	private String createdby;
	
	private String dateCreated;

	public Photo( int albid, String photourl, String createdby, String dateCreated) {
		this.albid = albid;
		this.photourl = photourl;
		this.createdby = createdby;
		this.dateCreated = dateCreated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getalbid() {
		return albid;
	}

	public void setalbid(int albid) {
		this.albid = albid;
	}

	public String getphotourl() {
		return photourl;
	}

	public void setphotourl(String photourl) {
		this.photourl = photourl;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	

}
