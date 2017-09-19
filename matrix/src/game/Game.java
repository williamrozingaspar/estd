package game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Character[][] matrix = new Character[3][3];
		char gameOver = 'F';

		while (gameOver == 'F') {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Jogada (X/0): ");
			String s = scanner.nextLine();
			Character ch = s.charAt(0);
			System.out.println("Linha: ");
			int line = scanner.nextInt();
			System.out.println("Coluna: ");
			int column = scanner.nextInt();

			input(matrix, line, column, ch);
			print(matrix);
			gameOver = gameOver(matrix);
			
			if (gameOver != 'F') {
				System.out.println("GANHOU!!! : " + gameOver);
			}
		}

	}

	public static void input(Character[][] matrix, int line, int column, Character ch) {
		matrix[line - 1][column - 1] = ch;
	}

	public static char gameOver(Character[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] != null && matrix[i][1] != null && matrix[i][2] != null) {
				if (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2]) {
					return matrix[i][0];
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0][i] != null && matrix[1][i] != null && matrix[2][i] != null) {
				if (matrix[0][i] == matrix[1][i] && matrix[0][i] == matrix[2][i]) {
					return matrix[0][i];
				}
			}
		}
		
		if (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2]) {
			return matrix[0][0] ;
		}
		
		if (matrix[0][2] == matrix[1][1] && matrix[0][0] == matrix[2][0]) {
			return matrix[0][2];
		}		
		
		return 'F';
	}

	public static void print(Character[][] matrix) {
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] == null ? " " : matrix[i][j]);
				if (j < matrix[i].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			System.out.println("-+-+-");
		}
	}

}
