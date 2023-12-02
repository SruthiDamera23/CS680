package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw09.Directory;
import edu.umb.cs680.hw09.File;
import edu.umb.cs680.hw09.FileSystem;
import edu.umb.cs680.hw09.Link;
import edu.umb.cs680.hw09.TestFixtureInitializer;

class LinkTest {

	static FileSystem fs;
	static Directory root;
	static Link rm;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
		rm=(Link) ((Directory) ((Directory) root.getChildren().get(1)).getChildren().get(0)).getChildren().get(2);
	}
	
	
	
	@Test
	public void isDirectoryTest() {
		assertFalse(rm.isDirectory());
	}
	
	
	@Test
	public void isLinkTest() {
		assertTrue(rm.isLink());
	}
	
	@Test
	public void getSizeTest() {
		assertEquals(0,rm.getSize());
	}
	
	@Test
	public void getNameTest() {
		assertEquals("rm.md",rm.getName());
	}
	
	@Test
	public void getParentTest() {
		Directory SrcTest=(Directory) ((Directory) root.getChildren().get(1)).getChildren().get(0);
		assertEquals(SrcTest,rm.getParent());
		
	}
	
	@Test
	public void getTargetTest() {
		File readme=(File) root.getChildren().get(2);
		assertEquals(readme,rm.getTarget());
		
	}
	
	@Test 
	void IsFileTest() {
		assertFalse(rm.isFile());
	}
	
	

	
	

	

	

}
