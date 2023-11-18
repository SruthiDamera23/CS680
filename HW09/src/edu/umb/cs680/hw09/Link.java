package edu.umb.cs680.hw09;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

import edu.umb.cs680.hw09.fs.util.FSVisitor;

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



	
	public void appendChild(FSElement element) {
		if(target!=null) {
			((Directory) target).appendChild(element);
		}
	}
	
	public LinkedList<FSElement> getChildren(){
		if(target!=null) {
			return ((Directory) target).getChildren();
		}
			return new LinkedList<FSElement>();
		
		
	}
	
	public int countChildren() {
		if(target!=null) {
			return ((Directory) target).countChildren();
		}
		
			return 0;
	}

	public LinkedList<Directory> getSubDirectories() {
		if(target!=null) {
			return ((Directory) target).getSubDirectories();
		}
	    return new LinkedList<Directory>();
	}
	
	public LinkedList<File> getFiles() {
		if(target!=null) {
			return ((Directory) target).getFiles();
		}

	    return new LinkedList<File>();
	}
	
	
	
	@Override
	public boolean isDirectory() {
		if(target!=null) {
			return target.isDirectory();
		}

	    return false;
	}
	
	public int getTotalSize() {
		if(target!=null) {
			return ((Directory) target).getTotalSize();
		}
        return 0;
    }
	
	
	public boolean isLink() {
		

	    return true;
	}
	
	public Directory getParent() {
		if(target!=null) {
			return target.getParent();
		}

	    return parent;
	}
	
	public int getSize() {
		if(target!=null) {
			return target.getSize();
		}

	    return size;
	}
	
	public String getName() {
		if(target!=null) {
			return target.getName();
		}

	    return name;
	}
	
	@Override
	public void accept(FSVisitor v) {
		v.visit(this);
		
	}
	
	
	
	
	
}
