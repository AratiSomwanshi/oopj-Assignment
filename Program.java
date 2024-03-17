package assignment.org.in;

import java.util.Scanner;

class Student{
	private String name;
	private int rollNo;
	private float persentage;
	private int rank;
	public void aceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student name: ");
		this.name=sc.nextLine();
		System.out.println("Roll no: ");
		this.rollNo= sc.nextInt();
		System.out.println("Persentage:");
		this.persentage=sc.nextFloat();
		System.out.println("Rank: ");
		this.rank=sc.nextInt();
		
	}
	public void printRecord() {
		System.out.println(this.name+" "+this.rollNo+" "+this.persentage+" "+this.rank);
		
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
		student.aceptRecord();
		student.printRecord();

	}

}
