package estd;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

	@Test
	public void sortTest() {
		Sorter sorter = new Sorter();
		int[] n = { 3, 2, 5, 1 };
		sorter.sort(n);
		int[] expected = { 1, 2, 3, 5 };
		Assert.assertArrayEquals(expected, n);
	}
	
	@Test
	public void sortCharTest() {
		Sorter sorter = new Sorter();
		char[] n = { 'D','C','B','A'};
		sorter.sort(n);
		char[] expected = { 'A', 'B', 'C', 'D' };
		Assert.assertArrayEquals(expected, n);
	}	
	
	@Test
	public void sortStringTest() {
		Sorter sorter = new Sorter();
		String[] n = { "Fabio", "Ana"};
		sorter.sort(n);
		String[] expected = { "Ana", "Fabio"};
		Assert.assertArrayEquals(expected, n);
	}	
	

}
