public class Sudoku{
	public static void main(String[] args) {
		int[][] n=new int[9][9];
		Scanner s=new Scanner(System.in);
		for (int i=0;i<9;i++) {
			for(int j=0;j<9;j++){
				n[i][j]=s.nextInt();
			}	
		}
	}
}