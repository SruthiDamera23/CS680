package edu.umb.cs680.hw13;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Directory extends FSElement{
	
	private LinkedList<FSElement> Children;

	Directory(Directory parent,String name, int size, LocalDateTime creationTime) {
		super(parent,name, size, creationTime);
		Children=new LinkedList<>();
		
	}
	
	public void appendChild(FSElement element) {
		Children.add(element);
	}
	
	public LinkedList<FSElement> getChildren(){
		return getChildren(new AlphabeticalComparator());
	}
	
	public LinkedList<FSElement> getChildren(Comparator<FSElement> comparator){
		Collections.sort(Children,comparator);
		return Children;
	}
	
	public int countChildren() {
		return Children.size();
	}

	public LinkedList<Directory> getSubDirectories(){
		return getSubDirectories(new AlphabeticalComparator());
	}
	
	public LinkedList<Directory> getSubDirectories(Comparator<FSElement> comparator) {
	    LinkedList<Directory> subDirectories = new LinkedList<>();

	    for (FSElement child : Children) {
	        if (child.isDirectory()) {
	            subDirectories.add((Directory) child);
	        }
	    }
	    Collections.sort(subDirectories,comparator);

	    return subDirectories;
	}
	
	public LinkedList<File> getFiles(){
		return getFiles(new AlphabeticalComparator());
	}
	
	public LinkedList<File> getFiles(Comparator<FSElement> comparator) {
	    LinkedList<File> Files = new LinkedList<>();

	    for (FSElement child : Children) {
	        if (child.isFile()) {
	        	Files.add((File) child);
	        }
	    }
	    Collections.sort(Files,comparator);

	    return Files;
	}
	
	
	
	@Override
	public boolean isDirectory() {
		return true;
	}
	
	public int getTotalSize() {
        int totalSize = getSize(); 
        for (FSElement child : Children) {
        	if(child.isDirectory()) {
            totalSize += ((Directory) child).getTotalSize();
        	}else {
        		 totalSize += child.getSize();
        	}
        }
        return totalSize;
    }
	
	@Override
	public boolean isLink() {
		
		return false;
	}
	

	@Override
	public boolean isFile() {
		return false;
	}

	

}
