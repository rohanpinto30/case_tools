import java.util.Scanner;
	
public class Marksheet {
	private int totalmarks;
	private int marks1, marks2,marks3,marks4,marks5;
	private int percentage;
	private char grade; 
	private Scanner  sc;
	
	public Marksheet() {
		totalmarks=0;
		marks1=0;
		marks2=0;
		marks3=0;
		marks4=0;
		marks5=0;
		percentage=0;
		sc=new Scanner(System.in);
	}
	
	public void ReadMarks() {
		System.out.println("marks1=");
		marks1=sc.nextInt();
		System.out.println("marks2=");
		marks2=sc.nextInt();
		System.out.println("marks3=");
		marks3=sc.nextInt();
		System.out.println("marks4=");
		marks4=sc.nextInt();
		System.out.println("marks5=");
		marks5=sc.nextInt();	
	}
	
	public void FindtotalMarks() {
		totalmarks= marks1+marks2+marks3+marks4+marks5;
		System.out.println("totalmarks="+totalmarks);
		
	}
	
	public void FindPercentage() {
		percentage= (totalmarks*100)/500;
		System.out.println("percentage="+percentage);
	}
	
	public int getTotalmarks() {
		return totalmarks;
	}
	public int getMarks1() {
		return marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public int getMarks4() {
		return marks4;
	}
	public int getMarks5() {
		return marks5;
	}
	public int getPercentage() {
		return percentage;
	}
	
	public char FindGrade() {
		if(percentage>80&&percentage<=100)
		{
			grade='A';
		}
		else if(percentage>60&&percentage<=80)
		{
			grade='B';
			
		}
		else if(percentage>50&&percentage<=60)
		{
			grade='C';
			
		}
		else if(percentage>40&&percentage<=50)
		{
			grade='D';
			
		}
		else {
			grade='F';
			
		}
		return grade;		
	}

}