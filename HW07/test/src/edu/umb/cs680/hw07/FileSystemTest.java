package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class FileSystemTest {
	
	


    @Test
    public void SingletonTestWhetherReturnsSameObject() {
    	FileSystem fs1=FileSystem.getFileSystem();
    	FileSystem fs2=FileSystem.getFileSystem();
    	assertSame(fs1,fs2);
    }
    
    @Test
    public void AppendAndGetRootDirsTest() {
    	Directory r=new Directory(null,"abc",1,LocalDateTime.now());
    	FileSystem fs=FileSystem.getFileSystem();
    	fs.appendRootDir(r);
    	assertEquals(r,fs.getRootDirs().get(1));
    }
    
    

}
