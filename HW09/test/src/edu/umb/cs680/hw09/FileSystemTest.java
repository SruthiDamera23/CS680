package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw09.TestFixtureInitializer;
import edu.umb.cs680.hw09.Directory;
import edu.umb.cs680.hw09.FileSystem;

class FileSystemTest {
	static FileSystem fs;
	static Directory root;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
	}
    @Test
    public void SingletonTestWhetherReturnsSameObject() {
    	FileSystem fs1=FileSystem.getFileSystem();
    	FileSystem fs2=FileSystem.getFileSystem();
    	assertSame(fs1,fs2);
    }
    
    @Test
    public void GetRootDirsTest() {
    	assertEquals("repo",fs.getRootDirs().get(0).getName());
    }
    
    

}
