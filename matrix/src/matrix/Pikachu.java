package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pikachu {

	public static void main(String[] args) throws Exception {
		int i = 0;
		char[][] matrix = new char[40][80];
		File file = new File("C:/eclipseneon2/p.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNext()) {
			char[] chars = scanner.nextLine().toCharArray();
			for (int j = 0; j < chars.length; j++) {
				matrix[i][j] = chars[j];
			}
			i++;
		}
		
		print(matrix);
		flip(matrix);
		print(matrix);
	}

	public static void flip(char[][] matrix) {
		for (char[] line : matrix) {
			for (int i = 0; i < line.length / 2; i++) {
				char temp = line[i];
				line[i] = line[line.length - i - 1];
				line[line.length - i - 1] = temp;
			}
		}
	}

	public static void print(char[][] matrix) {
		for (char[] line : matrix) {
			for (char cell : line) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}

}
