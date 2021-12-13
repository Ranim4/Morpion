package fr.formation.TestMorpion;

import java.util.Scanner;

public class tessssstmorpion {
	public static void main(String[] args) {
		char[] grid = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
		char p1 = 'O', p2 = 'X';
		char currentPlayer = p1;
		Integer input;
		boolean win = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// Affichage de la grille
			System.out.println("[" + grid[0] + "|" + grid[1] + "|" + grid[2] + "]");
			System.out.println("[" + grid[3] + "|" + grid[4] + "|" + grid[5] + "]");
			System.out.println("[" + grid[6] + "|" + grid[7] + "|" + grid[8] + "]");
			// Choisir le numéro de grille
			System.out.print("Joueur " + currentPlayer + ",veuillez choisir le numéro de grille entre 0 et 8 :");
			input = scanner.nextInt();
			// pour n'est pas écraser le grille existants
			if (grid[input] != p1 && grid[input] != (p2)) {
				grid[input] = currentPlayer;
			}
			// Verifier si le joueur a gagne
			for (int i = 0; i < 3; i++) {
				if (grid[i * 3] == currentPlayer && grid[i * 3 + 1] == currentPlayer
						&& grid[i * 3 + 2] == currentPlayer)
					win = true;
			}
			if (win) {
				System.out.print("Félicitation! le joueur " + currentPlayer + " a gagner");
				break;
			}

			for (int i = 0; i < 3; i++) {
				if (grid[i] == currentPlayer && grid[i + 3] == currentPlayer && grid[i + 6] == currentPlayer)
					win = true;
			}
			if (win) {
				System.out.print("Félicitation! le joueur " + currentPlayer + " a gagner");
				break;
			}

			if (grid[0] == currentPlayer && grid[4] == currentPlayer && grid[8] == currentPlayer)
				win = true;
			if (win) {
				System.out.print("Félicitation! le joueur " + currentPlayer + " a gagner");
				break;
			}
			if (grid[2] == currentPlayer && grid[4] == currentPlayer && grid[6] == currentPlayer)
				win = true;
			if (win) {
				System.out.print("Félicitation! le joueur " + currentPlayer + " a gagner");
				break;
			}
			// Changer le joueur
			if (currentPlayer == p1) {
				currentPlayer = p2;
			} else
				currentPlayer = p1;
		}
	}
}
