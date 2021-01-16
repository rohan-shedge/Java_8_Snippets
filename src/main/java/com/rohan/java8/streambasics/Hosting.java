package com.rohan.java8.streambasics;

public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }
    
    public int getId() {
		return Id;
	}

    public String getName() {
		return name;
	}
    
    public long getWebsites() {
		return websites;
	}
    
    public void setId(int id) {
		Id = id;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void setWebsites(long websites) {
		this.websites = websites;
	}
    
    
    //getters, setters and toString()
}