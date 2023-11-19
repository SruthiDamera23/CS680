package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class AlphabeticalComparatorTest extends TestFixtureComparator {

	@Test
    void GetChildrenTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<FSElement> expected = new LinkedList<>(Arrays.asList(A,Atest,B,Btest,readme,rm,src, test,SrcTest));
        LinkedList<FSElement> actual = repo.getChildren(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetSubDirectoriesTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<Directory> expected = new LinkedList<>(Arrays.asList(src, test,SrcTest));
        LinkedList<Directory> actual = repo.getSubDirectories(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetFilesTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<File> expected = new LinkedList<>(Arrays.asList(A,Atest,B,Btest,readme));
        LinkedList<File> actual = repo.getFiles(comparator);
        assertEquals(expected, actual);
    }

}
