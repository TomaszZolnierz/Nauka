
public class Tutorial12 {
	public static void main(String[] args) {
		// pomocnicze do pętli for
		int i, j;

		// wprowadzanie tablicy dwuwymiarowej z intami
		int[] values = { 1, 65, 489, 4569 };
		System.out.println(values[2]);
		System.out.println();
		int[][] grid = { { 1, 5, 4, 7 }, { 4, 6 }, { 48, 65, 874 }, };
		System.out.println(grid[0][1]);
		System.out.println(grid[2][0]);
		System.out.println();

		// Wprowadzanie tablicy dwywymiarowej z tekstem
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);

		// Pętla do wyświetlania tablicy intów
		for (i = 0; i < grid.length; i++) {
			for (j = 0; j < grid[i].length; j++) {
				System.out.printf("X[" + i + "][" + j + "]=" + grid[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		String[][] words = new String[2][];

		System.out.println(words[0]);
		words[0] = new String[3];

		words[0][1] = "Hi there";
		System.out.println();
		System.out.println(words[0][1]);

	}
}
