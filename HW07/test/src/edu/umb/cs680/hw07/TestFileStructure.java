package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public class TestFileStructure {
	
	public static FileSystem createFileSystem() {
	LocalDateTime currentTime = LocalDateTime.of(2023, 11, 2, 14, 30, 0);
	
	
	Directory root =new Directory(null,"root",0,currentTime);
	FileSystem fsobj=FileSystem.getFileSystem();
	fsobj.appendRootDir(root);
	
	Directory src =new Directory(root,"src",0,currentTime);
	File A = new File(src,"A.java",1,currentTime);
	File B = new File(src,"B.java",1,currentTime);
	
	Directory test =new Directory(root,"test",0,currentTime);
	Directory srcTest =new Directory(test,"test-src",0,currentTime);
	File ATest = new File(srcTest,"ATest.java",1,currentTime);
	File BTest = new File(srcTest,"BTest.java",1,currentTime);
	
	File readme=new File(root,"readme.md",1,currentTime);
	return fsobj;
	}
}
