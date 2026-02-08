package kingkong;

public class employeearray {
	static int []ReArrangearray(int [][]a){
		int []result=new int[a.length];
		for(int i=0; i==0 ; i++) {
			int min=a[0][0];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[i][j])
					min=a[i][j];
			}
			result[i]=min;
		}
		return result;
	}
	
	public static void main(String[]args) {
		int [][] matrix1=new int[2][4];
		matrix1[0][0]=2;
		matrix1[0][1]=1;
		matrix1[0][2]=4;
		matrix1[0][3]=10;
		 
		
		int [][] matrix2=new int[2][2];
		matrix2[0][0]=5;
		matrix2[0][1]=7;
		matrix2[1][0]=1;
		matrix2[1][1]=8;
		
		
		System.out.print(ReArrangearray(matrix1)[0]);
		
}
}
