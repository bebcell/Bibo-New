package StudentGPA;
import java.util.Scanner;

/*
 * Albara Mohamed Osman Abdalla
 * Computer System and Networking
 * Semester 4
 */

public class StudentGPAMain {
	
	public static class Student {
		int studentId;
		String studentName;
		int lastIndex=0;
		
		private float[]SubjectGrade=new float[7];
		
		public Student(int studentId,String studentName) {
			this.studentId=studentId;
			this.studentName=studentName;
			
		}	
		public int getStudentId() {
			return studentId;
		}
		public String getName() {
			return studentName;
		}
		
		
		
		public void setGrade(int Grade) {
			SubjectGrade[lastIndex]=Grade;
			lastIndex++;
		}
		
		public float getGrade(int index) {
			return SubjectGrade[index];
		}
		
		public void setAverageandGPA() {
			float sum=0;
			for(int i=0;i<5;i++) {
				sum=sum+getGrade(i);	
			}
			float average=sum/5;
			/*Average*/
			SubjectGrade[5]=average;
			/*GPA out of 5*/
			SubjectGrade[6]=average/20;
		}
		
		public float getGPA() {
			return SubjectGrade[6];
		}
		
		
	}
	
	
	
	public static void main(String[]args){
		//these are the subjects names. i made them so they are easier to access.
		String [] subjectlist= new String[5];
		subjectlist[0]="Math";
		subjectlist[1]="Scince";
		subjectlist[2]="English";
		subjectlist[3]="Physics";
		subjectlist[4]="Engineering";
		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Number of students: ");
		int studentnum=input.nextInt();
		
		Student[] Students=new Student[studentnum+1];//plus one for extra segment to sort or do other funtions
		//Students[studentnum]=new Student(-1);
		for(int i=0 ;i<studentnum;i++) {
			int studentid;
			String studentname;
			do {
			System.out.print("IDs MUST BE GREATER THAN AND LESS THAN 20000. For Student "+(i+1)+" Enter Student ID: ");
			studentid=input.nextInt();
			System.out.print("Enter Student Name: ");
			studentname=input.next();
			
			}while(studentid>20000 | studentid<=0);
			Students[i]=new Student(studentid,studentname);

			
			//Comment from line 96 to 104 to avoid entering subjects numbers and student name.
			//this is only to make it faster for you Dr.
			for(int j=0;j<5;j++) {//5 is the number of subjects
				int grade;
				do {
				System.out.print("GRADES BETWEEN 0-100. Enter grade for "+subjectlist[j]+": ");
				grade=input.nextInt();
				}while(grade>100 | grade<0);
				Students[i].setGrade(grade);
			}
			Students[i].setAverageandGPA();//setting average and gpa
			
		}
		
		System.out.println("now that all students info have been add, will count the sorting and searches count");
		System.out.println("______first we will the array using sort the student Id no.______ ----line 81");
		
		for(int i=0;i<Students.length-2;i++) {
			int largestnumtemp=0;
			
			for(int j=1;j<=Students.length-i-2;j++) {
				if (Students[largestnumtemp].getStudentId()<Students[j].getStudentId()) {
					largestnumtemp=j;
				}
			}
			Students[Students.length-1]=Students[Students.length-i-2];
			Students[Students.length-i-2]=Students[largestnumtemp];
			Students[largestnumtemp]=Students[Students.length-1];
		}
		
		//Searching after sorting using Binary and Linear
		//USE COMMENTS TO STOP ANY SEARCH.
		while(true) {
			
			System.out.print("Enter the Id that you want to search: ");
			int searchId=input.nextInt();
			//Binary Search. ITS CODE IS ON line 166
			if (binarysearch(searchId,Students)[0]!=-1){
				System.out.println("_____ the ID found using Binary Search and its list no. is: "+(binarysearch(searchId,Students)[0]+1)+". Number of searches made: "+binarysearch(searchId,Students)[1]+"  ______");
				
				System.out.println("Name: "+Students[binarysearch(searchId,Students)[0]].getName());
				System.out.println("GPA: "+Students[binarysearch(searchId,Students)[0]].getGPA());
				
			}
			
			
			//Linear Search. its code is on 149
			if (linearsearch(searchId,Students)[0]!=-1) {
				System.out.println("_____ the ID found using Linear Search and its list no. is: "+(linearsearch(searchId,Students)[0])+". Number of searches made: "+linearsearch(searchId,Students)[1]+"  ______");
				
				System.out.println("Name: "+Students[linearsearch(searchId,Students)[0]].getName());
				System.out.println("GPA: "+Students[linearsearch(searchId,Students)[0]].getGPA());			
			}
			
		}
		
	}
	public static int[] linearsearch(int Id,Student[] students) {
		int length=0;
		int count=0;
		while(length<=students.length-2) {
			count+=1;
			if(students[length].getStudentId()==Id) {
				return new int [] {length,count};
			}
			length+=1;
			
		}
		
		
		System.out.println("____ID not found___ Number of linear searches made: "+count+"  ____");
		return new int[] {-1};
	}
		
	public static int[] binarysearch(int Id,Student[] students) {
		int count=0;
		int high=students.length-2;
		int low=0;
		//these high and low are used to divide the array.
		while(low<=high) {
			int i=(high+low)/2;//divided here to get the middle to compare if the id is higher or lower
			count+=1;
			if(students[i].getStudentId()==Id) {
				return new int[] {i,count};
			}
			else if(Id>students[i].getStudentId()) {//go high, id is greater than mid
				low=i+1;
			}
			else//(Id<students[i].getStudentId()) {//go lower
				high=i-1;		
		}
		
		System.out.println("____ID not found____  Number of binary searches made: "+count+"  ____");
		return new int[] {-1};
	}
	
}
