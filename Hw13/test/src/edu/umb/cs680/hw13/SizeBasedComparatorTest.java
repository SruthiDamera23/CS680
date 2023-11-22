package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class SizeBasedComparatorTest extends TestFixtureComparator {
	
	
	public LinkedList<String> getElementNames(LinkedList<FSElement> c) {
		LinkedList<String> carNames = new LinkedList<>();

        for (FSElement car : c) {
            carNames.add( car.getName());
        }

        return carNames;
	}

	@Test
    void GetChildrenTest() {
		SizeBasedComparator comparator = new SizeBasedComparator();
        LinkedList<FSElement> expected = new LinkedList<>(Arrays.asList(SrcTest,rm, src, A,test,B, Atest,Btest,readme));
        LinkedList<FSElement> actual = repo.getChildren(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetSubDirectoriesTest() {
    	SizeBasedComparator comparator = new SizeBasedComparator();
        LinkedList<Directory> expected = new LinkedList<>(Arrays.asList(SrcTest,src,test));
        LinkedList<Directory> actual = repo.getSubDirectories(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetFilesTest() {
    	SizeBasedComparator comparator = new SizeBasedComparator();
        LinkedList<File> expected = new LinkedList<>(Arrays.asList(A, B,Atest, Btest, readme));
        LinkedList<File> actual = repo.getFiles(comparator);
        assertEquals(expected, actual);
    }  

}
