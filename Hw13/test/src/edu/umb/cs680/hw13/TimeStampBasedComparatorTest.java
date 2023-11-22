package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class TimeStampBasedComparatorTest extends TestFixtureComparator{

	public LinkedList<String> getElementNames(LinkedList<FSElement> c) {
		LinkedList<String> carNames = new LinkedList<>();

        for (FSElement car : c) {
            carNames.add( car.getName());
        }

        return carNames;
	}

	@Test
    void GetChildrenTest() {
		TimestampBasedComparator comparator = new TimestampBasedComparator();
        LinkedList<FSElement> expected = new LinkedList<>(Arrays.asList(src, A, B, test, SrcTest, Atest, Btest, readme, rm));
        LinkedList<FSElement> actual = repo.getChildren(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetSubDirectoriesTest() {
    	TimestampBasedComparator comparator = new TimestampBasedComparator();
        LinkedList<Directory> expected = new LinkedList<>(Arrays.asList(src,test,SrcTest));
        LinkedList<Directory> actual = repo.getSubDirectories(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetFilesTest() {
    	TimestampBasedComparator comparator = new TimestampBasedComparator();
        LinkedList<File> expected = new LinkedList<>(Arrays.asList(A, B,Atest, Btest, readme));
        LinkedList<File> actual = repo.getFiles(comparator);
        assertEquals(expected, actual);
    }  

}


