package class_20_21_22;

public class Othello {

	public static boolean move(int[][] board, int player, int x, int y) {
		if (board[x][y] != 0)
			return false;
		int i  = x + 1, j = y + 1;
		int count = 0;
		boolean patternFound = false;
		int xinc[] = {0,0,1,1,1,-1,-1,-1};
		int yinc[] = {1,-1,1,-1,0,1,-1,0};

		for (int k = 0; k < 8; k++) {
			int xi = xinc[k];
			int yi = yinc[k];
			
			for (;i < 8 && j < 8 && i >= 0 && j >=0;
					i = i + xi, j = j + yi) {
				if (board[i][j] == player) {
					if (count > 0) {
						patternFound = true;
						for (i = i - xi, j = j -yi; i != x && j != y; i= i - xi,j = j - yi) {
							board[i][j] = player;
						}
						board[x][y] = player;
					}
					break;
				} 
				if (board[i][j] == 0) {
					break;
				}
				count++;
			}
		}
		return patternFound;
	}

	public static void main(String[] args) {

	}

}
