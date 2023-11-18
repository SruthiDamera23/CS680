package edu.umb.cs680.hw09;

import edu.umb.cs680.hw09.fs.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FSVisitorTest extends TestFixture{

	@Test
	public void CountingVisitorTest() {
		CountingVisitor cv=new CountingVisitor();
		repo.accept(cv);
		assertEquals(4,cv.getDirNum());
		assertEquals(5,cv.getFileNum());
		assertEquals(1,cv.getLinkNum());
	}
	
	@Test
	public void FileCrawlingVisitorTest() {
		FileCrawlingVisitor fcv=new FileCrawlingVisitor();
		repo.accept(fcv);
		assertEquals(5,fcv.getFiles().size());
		
	}
	
	@Test
	public void FileSearchVisitorTest() {
		FileSearchVisitor fcv=new FileSearchVisitor("readme.md");
		repo.accept(fcv);
		assertEquals(1,fcv.getFoundFiles().size());
		assertEquals("readme.md",fcv.getFoundFiles().get(0).getName());
		
	}

}
