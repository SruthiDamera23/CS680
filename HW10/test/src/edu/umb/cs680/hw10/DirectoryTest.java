package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw10.Directory;
import edu.umb.cs680.hw10.File;
import edu.umb.cs680.hw10.FileSystem;

class DirectoryTest extends TestFixture {
	
	

	private String[] dirToStringArray(Directory d) {
		
		if(d.getParent()==null) {
			String[] dirInfo= {d.getName(),d.getSize()+"","null",d.getCreationTime()+""};
			return dirInfo;
		}
		else {
			String[] dirInfo= {d.getName(),d.getSize()+"",d.getParent().getName(),d.getCreationTime()+""};
			return dirInfo;
		}
		
	}
	
	@Test
	public void verifyDirectoryEqualityRoot() {
		String[] expected= {"repo","0","null",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(repo));
	}
	
	@Test
	public void verifyDirectoryEqualitySrc() {
		
		String[] expected= {"src","0","repo",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(src));
	}
	@Test
	public void verifyDirectoryEqualityTest() {
		
		String[] expected= {"test","0","repo",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(test));
	}
	
	@Test
	public void verifyDirectoryEqualitySrcTest() {
		
		String[] expected= {"test-src","0","test",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(SrcTest));
	}
	
	
	@Test
    void GetTotalSizeTest() {
        assertEquals(5,repo.getTotalSize());
    }
	
	@Test 
	void GetChildrenTest() {
		assertEquals(3,repo.getChildren().size());
	}
	@Test 
	void CountChildrenTest() {
		assertEquals(3,repo.countChildren());
	}
	
	
	@Test 
	void GetSubDirectoriesTest() {
		assertEquals(2,repo.getSubDirectories().size());
	}
	
	@Test 
	void GetFilesTest() {
		assertEquals(1,repo.getFiles().size());
	}
	
	@Test 
	void IsDirectoryTest() {
		assertTrue(repo.isDirectory());
	}
	
	

   

}
