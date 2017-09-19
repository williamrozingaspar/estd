package matrix;

public class MatrixUtils {

	public double[][] multiply(double[][] m) {
		double[][] result = m.clone();

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}

		return result;
	}

}
