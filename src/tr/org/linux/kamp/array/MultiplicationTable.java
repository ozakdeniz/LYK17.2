package tr.org.linux.kamp.array;

/*public class MultiplicationTable {

	public static void main(String[] args) {
		arrayToPrint(initialize(9));

}
	
	public static int[][] initialize(int n){
		int[][] multi = new int[n][n];
		for(int i = 0; i < multi.length ; i++) {
			for(int j = 0; j < multi[i].length ; j++) {
				multi[i][j] = (i+1)*(j+1);
			}
		}
		
		return multi;
	}
	
	public static void arrayToPrint(int[][] multi) {
		for(int j = 0; j < multi.length ; j++) {
			for(int i = 0; i < multi[j].length  ; i++) {
				System.out.print(multi[j][i] + "\t");
			}
			System.out.println();
		}

	}
}*/


public class MultiplicationTable {
	
	public static int[][] initialize(int n, int m){
		int[][] matrices = new int[n][m];
		
		for(int j=0; j<matrices.length; j++) {
			for(int k = 0; k<matrices[j].length; k++) {
				matrices[j][k] = (j+1)*(k+1);
				System.out.print(matrices[j][k] + "\t");

			}
			System.out.println();

		}
		
		return matrices;
	}
	
	public static void arrayToPrint(int[][] matrices) {
		for(int j=0; j<matrices.length; j++) {
			for(int k=0; k<matrices[j].length; k++) {
			}
		}
	}
	
	public static void main(String[] args) {
		arrayToPrint(initialize(9,9));
	}
	

}
