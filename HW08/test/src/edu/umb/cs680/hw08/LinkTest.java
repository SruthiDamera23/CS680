package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinkTest extends TestFixture{

	
	
	
	File expectedTarget=readme;
	

	
	

	
	@Test
	public void isDirectoryTest() {
		assertEquals(expectedTarget.isDirectory(),rm.isDirectory());
	}
	
	
	@Test
	public void isLinkTest() {
		assertEquals(true,rm.isLink());
	}
	
	@Test
	public void getSizeTest() {
		assertEquals(expectedTarget.getSize(),rm.getSize());
	}
	
	@Test
	public void getParentTest() {
		assertEquals(expectedTarget.getParent(),rm.getParent());
	}
	
	

	

	

}
