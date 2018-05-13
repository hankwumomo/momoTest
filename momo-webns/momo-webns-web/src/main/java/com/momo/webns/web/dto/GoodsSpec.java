package com.momo.webns.web.dto;

import java.io.Serializable;

public class GoodsSpec implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2760595678528530152L;
	
	
	private String no;
	private String id;
	private String title;
	private String content;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
