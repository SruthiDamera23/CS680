package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class FSCommandTest extends TestFixture{
	@Test
	public void CountingTest() {
		
		Counting c=new Counting();
		c.execute(repo);
		assertEquals(4,c.getCountDirResult());
		assertEquals(5,c.getCountFileResult());
		assertEquals(1,c.getCountLinkResult());
		
	}
	
	@Test
	public void FileCrawlingTest() {
		FileCrawling fc=new FileCrawling();
		fc.execute(repo);
		assertEquals(5,fc.getCrawlResult().size());
		
	}
	
	@Test
	public void FileSearchTest() {
		FileSearch fc=new FileSearch();
		fc.setFileName("readme.md");
		fc.execute(repo);
		assertEquals(1,fc.getSearchResult().size());
		assertEquals("readme.md",fc.getSearchResult().get(0).getName());
		
	}
}
