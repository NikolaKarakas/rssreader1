package com.rssreader1;

import java.util.Date;


public class Item {
	
	private String title;
	private String description;
	private Date date;
	private String image;

	
	public Item(String title,String description,Date date,String image) {
		super();
		this.title = title;
		this.setDate(date);
		this.description = description;

		this.image=image;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
