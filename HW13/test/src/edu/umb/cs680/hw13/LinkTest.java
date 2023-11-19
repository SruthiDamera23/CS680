package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw13.File;

class LinkTest extends TestFixture{

	
	
	
	File expectedTarget=readme;
	

	
	

	
	@Test
	public void isDirectoryTest() {
		assertEquals(false,rm.isDirectory());
	}
	
	
	@Test
	public void isLinkTest() {
		assertEquals(true,rm.isLink());
	}
	
	
	
	
	

	

	

}
