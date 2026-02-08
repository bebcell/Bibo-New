package kingkong;

public class arraytut1 {
	static void Displaymatrix(int[][]a , int[][]b) {
		int [][]dismatr = Addmatrix(a,b);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.print(dismatr[i][j]+" : ");
		}
	}
	
	
	static int [][] Addmatrix(int[][]a, int[][]b){
		int [][] result=new int[a.length][a[1].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				result[i][j]=a[i][j]+b[i][j];
		}	
		return result;
	}
	
	public static void main(String[]args) {
		int [][] matrix1=new int[2][2];
		matrix1[0][0]=2;
		matrix1[0][1]=3;
		matrix1[1][0]=4;
		matrix1[1][1]=10;
		
		
		int [][] matrix2=new int[2][2];
		matrix2[0][0]=5;
		matrix2[0][1]=7;
		matrix2[1][0]=1;
		matrix2[1][1]=8;
		
		Addmatrix(matrix1,matrix2);
		Displaymatrix(matrix1,matrix2);
	}
}
