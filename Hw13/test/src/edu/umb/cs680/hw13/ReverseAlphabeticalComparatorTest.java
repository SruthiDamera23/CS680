package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;



class ReverseAlphabeticalComparatorTest extends TestFixtureComparator{

	public LinkedList<String> getElementNames(LinkedList<FSElement> c) {
		LinkedList<String> carNames = new LinkedList<>();

        for (FSElement car : c) {
            carNames.add( car.getName());
        }

        return carNames;
	}
	@Test
    void GetChildrenTest() {
		ReverseAlphabeticalComparator comparator = new ReverseAlphabeticalComparator();
        LinkedList<FSElement> expected = new LinkedList<>(Arrays.asList(SrcTest, test, src, rm, readme,Btest,B,Atest,A));
        LinkedList<FSElement> actual = repo.getChildren(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetSubDirectoriesTest() {
    	ReverseAlphabeticalComparator comparator = new ReverseAlphabeticalComparator();
        LinkedList<Directory> expected = new LinkedList<>(Arrays.asList(SrcTest,test,src));
        LinkedList<Directory> actual = repo.getSubDirectories(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetFilesTest() {
    	ReverseAlphabeticalComparator comparator = new ReverseAlphabeticalComparator();
        LinkedList<File> expected = new LinkedList<>(Arrays.asList(readme,Btest,B,Atest, A));
        LinkedList<File> actual = repo.getFiles(comparator);
        assertEquals(expected, actual);
    }  

}
