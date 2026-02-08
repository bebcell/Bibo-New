package prj_2;
import java.util.Scanner;


public class Insertion_Selection_Bubble_sorts {
	
	public static void main(String []args) {
		
		Scanner input=new Scanner(System.in);
		float [][]array=new float[4][6];//adjust these numbers to tests quicker
		
		System.out.println("4 semesters 5 subjects each.\nYou must enter the grades for subjects in each semester.");
		System.out.print("Enter your name: ");
		String name=input.next();
		
		
		//filling grades
		for(int i=0;i<4;i++) {
			System.out.println("Semester: "+(i+1));
			for(int j=0;j<5;j++) {
				System.out.print("Grade subject no."+(j+1)+": ");
				array[i][j]=input.nextInt();
			}
		}
		

		int [][]crh=new int[4][6];
		//creadit hours for semester 1
		crh[0][0]=4;		
		crh[0][1]=3;
		crh[0][2]=3;
		crh[0][3]=2;
		crh[0][4]=3;
		//crh[0][5]=crh[0][0]+crh[0][1]+crh[0][2]+crh[0][3]+crh[0][4];
		//creadit hours for semester 2
		crh[1][0]=1;
		crh[1][1]=5;
		crh[1][2]=3;
		crh[1][3]=3;
		crh[1][4]=3;
		//crh[1][5]=crh[1][0]+crh[1][1]+crh[1][2]+crh[1][3]+crh[1][4];
		//creadit hours for semester 3
		crh[2][0]=4;
		crh[2][1]=3;
		crh[2][2]=5;
		crh[2][3]=3;
		crh[2][4]=4;
		//crh[2][5]=crh[2][0]+crh[2][1]+crh[2][2]+crh[2][3]+crh[2][4];
		//creadit hours for semester 4
		crh[3][0]=4;
		crh[3][1]=4;
		crh[3][2]=4;
		crh[3][3]=4;
		crh[3][4]=4;
		//crh[3][5]=crh[3][0]+crh[3][1]+crh[3][2]+crh[3][3]+crh[3][4];
		
		
		//calculation of GPAs
		
		float cmmGpa = 0;
		float gpa=0;
		
		for(int i=0;i<array.length;i++) { 			
			float sum = 0;//sum is reset
			int total_creadit_hour=0;//reseted for each sems
			
			for(int j=0;j<array[i].length-2;j++) {	
				sum+=((array[i][j]/25)*crh[i][j]);//sum sbj then divid 25 to get out of 4, and then multiply by creadit hours 
				total_creadit_hour+=crh[i][j];
			}
			gpa=sum/total_creadit_hour;//GPA for one sems
			array[i][5]=(gpa);
			cmmGpa+=gpa;//summing it here so i can divde by 4 on the following line
		}
		cmmGpa=cmmGpa/4;//final cumulative GPA
			
		//SORTS	
		BubbleSort(array);
		SelectionSort(array);
		InsertionSort(array);
		
		
		System.out.println("Last column is for semester's GPA");
		
		//printing the grades
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length-1;j++)
			System.out.printf("%.0f  ",array[i][j]);
			System.out.printf(" %.2f%n",array[i][5]);
		}
		
		System.out.printf("Cummalative GPA: %.2f%n",cmmGpa);
	}//end of main
	

	private static void InsertionSort(float[][] array) {
		long starttime=System.nanoTime();
		int swapcounter=0;
		float temp;	
		int j;
		for(int Sem3_4=2;Sem3_4<4;Sem3_4++) {//For Semester 3 and 4
			for(int i=1;i<array[Sem3_4].length-1;i++) {
				temp=array[Sem3_4][i];//123458 9
				j=i-1;
				while(j>=0 && array[Sem3_4][j]>temp) {//comaparison happing in the while. 
					array[Sem3_4][j+1]=array[Sem3_4][j];
					swapcounter++;
					j--;
				}
				array[Sem3_4][j+1]=temp;
			}
		}
		long endtime=System.nanoTime();
		long executiontime=endtime-starttime;
		System.out.println("Insertion Execution Time: "+executiontime);
		System.out.println("Insertion number of swaps: "+swapcounter);
		System.out.println("_________________________________________");
	}

	private static void SelectionSort(float[][] array) {
		long starttime=System.nanoTime();
		int swapcounter=0;
		float temp;
		for(int i=array[1].length-2;i>0;i--) {
			float max=array[1][0];//the max number is reset everytime.
			int index=0;
			for(int j=0;j<=i;j++) {
				if(array[1][j]>max) {
					index=j;
					max=array[1][j];
				}
			}
			temp=array[1][i];
			array[1][i]=array[1][index];
			array[1][index]=temp;
			swapcounter++;
		}
		long endtime=System.nanoTime();
		long executiontime=endtime-starttime;
		System.out.println("Selection Execution Time: "+executiontime);
		System.out.println("Selection number of swaps: "+swapcounter);
		System.out.println("_________________________________________");

	}

	private static void BubbleSort(float[][] array) {
		long starttime=System.nanoTime();
		int swapcounter=0;
		for(int i=0;i<array[0].length-1;i++) {
			
			for(int j=0;j<array[0].length-i-2;j++) {
				if(array[0][j]>array[0][j+1]) {	
					float temp=array[0][j];
					array[0][j]=array[0][j+1];
					array[0][j+1]=temp;
					swapcounter++;
				}
			}
		}
		long endtime=System.nanoTime();
		long executiontime=endtime-starttime;
		System.out.println("Bubble Execution Time: "+executiontime);
		System.out.println("Bubble number of swaps: "+swapcounter);
		System.out.println("_________________________________________");
	}
	
}
