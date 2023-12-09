package edu.umb.cs680.hw15;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;


public class Link extends FSElement{

	protected String name;
	protected int size;
	protected LocalDateTime creationTime;
	protected Directory parent;
	protected FSElement target=null;
	
	Link(Directory parent, String name,int size, LocalDateTime creationTime, FSElement target ){
		super(parent, name, size, creationTime);
		this.name=name;
		this.parent=parent;
		this.size=size;
		this.creationTime=creationTime;
		this.target=target;
		
		
	}

	public FSElement getTarget() {
		return target;
	}

	public boolean isDirectory() {
	    return false;
	}
	
	public boolean isLink() {
	    return true;
	}


	@Override
	public boolean isFile() {
		return false;
	}
	
	
	
	
	
	
	
	
}
