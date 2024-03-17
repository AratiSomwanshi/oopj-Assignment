package orgin;

public class Empolyee {
	public static void displayinfo(String name, int empid, double salary) {
		System.out.println("name: "+name);
		System.out.println("Empid: "+empid);
		System.out.println("salary: "+salary);
		
	}
	public static void  displayinfo(String name, double salary) {
		System.out.println("name: "+name);
		//System.out.println("Empid"+empid);
		System.out.println("salary: "+salary);
		
		
	}
	public static void printRecord(String name, double salary,int empid) {
		System.out.println("name: "+name);
		System.out.println("Empid: "+empid);
		System.out.println("salary: "+salary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee.displayinfo("Arati",1235, 250000.2);
		Empolyee.printRecord("Radha", 25000.2,4568);
	}

}
