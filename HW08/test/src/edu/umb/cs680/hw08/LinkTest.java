package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinkTest extends TestFixture{

	
	
	
	File expectedTarget=readme;
	
	
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
		assertEquals(SrcTest,rm.getParent());
		
	}
	
	@Test
	public void getTargetTest() {
		assertEquals(readme,rm.getTarget());
		
	}
	
	

	

	

}
