package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileTest {
	

	static FileSystem fsObj;
	static Directory root;


	@BeforeAll
	public static void setUp(){
		fsObj=TestFileStructure.createFileSystem();
		root=fsObj.getRootDirs().get(0);
	}
	

	private String[] FileToStringArray(File f) {
		
		if(f.getParent()==null) {
			String[] dirInfo= {f.getName(),f.getSize()+"","null",f.getCreationTime()+""};
			return dirInfo;
		}
		else {
			String[] dirInfo= {f.getName(),f.getSize()+"",f.getParent().getName(),f.getCreationTime()+""};
			return dirInfo;
		}
		
	}
	
	
	@Test
	public void verifyFileEqualityA() {
		
		File A=(File) ((Directory) root.getChildren().get(0)).getChildren().get(0);
		String[] expected= {"A.java","1","src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(A));
	}
	
	@Test
	public void verifyFileEqualityB() {
		
		File B=(File) ((Directory) root.getChildren().get(0)).getChildren().get(1);
		String[] expected= {"B.java","1","src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(B));
	}
	
	@Test
	public void verifyFileEqualityATest() {
		
		File ATest=(File) ((Directory) ((Directory) root.getChildren().get(1)).getChildren().get(0)).getChildren().get(0);
		String[] expected= {"ATest.java","1","test-src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(ATest));
	}
	
	@Test
	public void verifyFileEqualityBTest() {
		
		File BTest=(File) ((Directory) ((Directory) root.getChildren().get(1)).getChildren().get(0)).getChildren().get(1);
		String[] expected= {"BTest.java","1","test-src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(BTest));
	}
	
	@Test
	public void verifyFileEqualityReadMe() {
		
		File readMe=(File) root.getChildren().get(2);
		String[] expected= {"readme.md","1","root",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(readMe));
	}
	
	@Test 
	void IsDirectoryTest() {
		assertFalse(root.getChildren().get(2).isDirectory());
	}
	
	@Test
    void GetTotalSizeTest() {
        assertEquals(1,root.getChildren().get(2).getTotalSize());
    }
	
}
