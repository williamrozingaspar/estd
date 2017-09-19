package matrix;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilsTest {

	@Test
	public void multiplyTest() {
		MatrixUtils matrixUtils = new MatrixUtils();
		double[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] expected = { { 2, 4, 6 }, { 8, 10, 12 } };
		double[][] result = matrixUtils.multiply(matrix);

		Assert.assertArrayEquals(expected, result);
		
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(Arrays.deepToString(result));
		

	}

}
