package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DirectoryTest {
	static FileSystem fsObj;
	static Directory root;

	@BeforeAll
	public static void setUp(){
		fsObj=TestFileStructure.createFileSystem();
		root=fsObj.getRootDirs().get(0);
	}
	

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
		String[] expected= {"root","0","null",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(root));
	}
	
	@Test
	public void verifyDirectoryEqualitySrc() {
		Directory Src=(Directory) root.getChildren().get(0);
		String[] expected= {"src","0","root",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(Src));
	}
	@Test
	public void verifyDirectoryEqualityTest() {
		Directory Test=(Directory) root.getChildren().get(1);
		String[] expected= {"test","0","root",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(Test));
	}
	
	@Test
	public void verifyDirectoryEqualitySrcTest() {
		Directory Src=(Directory) root.getChildren().get(1);
		Directory SrcTest=(Directory) Src.getChildren().get(0);
		assertEquals(Src.getChildren().size(),1);
		String[] expected= {"test-src","0","test",LocalDateTime.of(2023, 11, 2, 14, 30, 0)+""};
		assertArrayEquals(expected,dirToStringArray(SrcTest));
	}
	
	
	@Test
    void GetTotalSizeTest() {
        assertEquals(5,root.getTotalSize());
    }
	
	@Test 
	void GetChildrenTest() {
		assertEquals(3,root.getChildren().size());
	}
	@Test 
	void CountChildrenTest() {
		assertEquals(3,root.countChildren());
	}
	
	
	@Test 
	void GetSubDirectoriesTest() {
		assertEquals(2,root.getSubDirectories().size());
	}
	
	@Test 
	void GetFilesTest() {
		assertEquals(1,root.getFiles().size());
	}
	
	@Test 
	void IsDirectoryTest() {
		assertTrue(root.isDirectory());
	}
	
	@Test
	void appendChildTest() {
		Directory r=new Directory(null,"abc",1,LocalDateTime.now());
		File f=new File(null,"abc",1,LocalDateTime.now());
		r.appendChild(f);
		assertEquals(1,r.getChildren().size());
	}

   

}
