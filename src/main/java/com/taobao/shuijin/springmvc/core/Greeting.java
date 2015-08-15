package com.taobao.shuijin.springmvc.core;

public class Greeting {
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}
