package edu.umb.cs680.hw13;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;

public class TestFixtureComparator {
	static Directory repo;
	static Directory src ;
	static Directory test;
	static File readme;
	static File A;
	static File B;
	static Directory SrcTest;
	static File Atest;
	static File Btest;
	static Link rm;
	
	@BeforeAll
	public static void setUp() {
	LocalDateTime currentTime = LocalDateTime.of(2023, 11, 2, 14, 30, 0);
	
	
	repo =new Directory(null,"repo",0,LocalDateTime.of(2023, 11, 2, 14, 30, 0));
	src=new Directory(repo,"src",1,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	A=new File(repo,"A.java",2,LocalDateTime.of(2023, 11, 2, 14, 30, 2));
	B=new File(repo,"B.java",5,LocalDateTime.of(2023, 11, 2, 14, 30, 3));
	test=new Directory(repo,"test",4,LocalDateTime.of(2023, 11, 2, 14, 30, 4));
	SrcTest=new Directory(repo,"test-src",0,LocalDateTime.of(2023, 11, 2, 14, 30, 5));
	Atest= new File(repo,"Atest.java",6,LocalDateTime.of(2023, 11, 2, 14, 30, 6));
	Btest= new File(repo,"Btest.java",7,LocalDateTime.of(2023, 11, 2, 14, 30, 7));
	readme=new File(repo,"readme.md",8,LocalDateTime.of(2023, 11, 2, 14, 30, 8));
	rm=new Link(repo,"rm.md",0, LocalDateTime.of(2023, 11, 2, 14, 30, 9),readme);

	
	}
}
