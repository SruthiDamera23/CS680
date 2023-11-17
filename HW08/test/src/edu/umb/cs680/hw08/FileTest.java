package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.File;
import edu.umb.cs680.hw08.FileSystem;

class FileTest extends TestFixture {
	

	


	
	

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
		
		
		String[] expected= {"A.java","1","src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(A));
	}
	
	@Test
	public void verifyFileEqualityB() {
		
		
		String[] expected= {"B.java","1","src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(B));
	}
	
	@Test
	public void verifyFileEqualityATest() {
		
		
		String[] expected= {"Atest.java","1","test-src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(Atest));
	}
	
	@Test
	public void verifyFileEqualityBTest() {
		
		
		String[] expected= {"Btest.java","1","test-src",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(Btest));
	}
	
	@Test
	public void verifyFileEqualityReadMe() {
		
		
		String[] expected= {"readme.md","1","repo",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,FileToStringArray(readme));
	}
	
	@Test 
	void IsDirectoryTest() {
		assertFalse(readme.isDirectory());
	}
	
	
}
