package com.journaldev.spring.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class ImageURL implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	/**
"copyright": "Rogelio Bernal\nAndreo",
  "date": "2017-06-04",
  "explanation": "What surrounds the famous belt stars of Orion? A deep exposure shows everything from dark nebula to star clusters, all embedded in an extended patch of gaseous wisps in the greater Orion Molecular Cloud Complex.  The brightest three stars, appearing diagonally on the left of the featured image are indeed the famous three stars that make up the belt of Orion.  Just below Alnitak, the lowest of the three belt stars, is the Flame Nebula, glowing with excited hydrogen gas and immersed in filaments of dark brown dust.  Just to the right of Alnitak lies the Horsehead Nebula, a  dark indentation of dense dust that has perhaps the most recognized nebular shapes on the sky. The dark molecular cloud, roughly 1,500 light years distant, is cataloged as Barnard 33 and is seen primarily because it is backlit by the nearby massive star Sigma Orionis. The Horsehead Nebula will slowly shift its apparent shape over the next few million years and will eventually be destroyed by the high-energy starlight.",
  "hdurl": "https://apod.nasa.gov/apod/image/1706/orionbfh_andreo_1089.jpg",
  "media_type": "image",
  "service_version": "v1",
  "title": "Orion: Belt, Flame, and Horsehead",
  "url": "https://apod.nasa.gov/apod/image/1706/orionbfh_andreo_960.jpg"
	 */
	
	
	private String copyright;
	private String explanation;
	private String hdurl;
	private String media_type;
	private String service_version;
	private String title;
	private String url;
	private Date createdDate;
	
	
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getHdurl() {
		return hdurl;
	}
	public void setHdurl(String hdurl) {
		this.hdurl = hdurl;
	}
	public String getMedia_type() {
		return media_type;
	}
	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}
	public String getService_version() {
		return service_version;
	}
	public void setService_version(String service_version) {
		this.service_version = service_version;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@JsonSerialize(using=DateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
