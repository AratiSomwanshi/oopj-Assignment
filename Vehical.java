package overload;

public class Vehical {
	public static void displayinfo(String model,String colour,int prise,int speed) {
		System.out.println("Name of model:"+ model);
		System.out.println("Colour:"+colour);
		System.out.println("Prise:"+prise);
		System.out.println("speed:"+ speed);
	}
	public static  void displayinfo(String colour,int prise,String model) {
		System.out.println("Name of model:"+ model);
		System.out.println("Colour:"+colour);
		System.out.println("Prise:"+prise);
		//System.out.println("speed:"+ speed);
	}
	public static void car1(String model,String colour,int prise,int speed) {
		System.out.println("Name of model:"+ model);
		System.out.println("Colour:"+colour);
		System.out.println("Prise:"+prise);
		System.out.println("speed:"+ speed);
		
	}
	public  static void displayinfo(){
		System.out.println("Name od model:");
		System.out.println("Colour:");
		System.out.println("Prise:");
		System.out.println("speed:");
	
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	Vehical.displayinfo("Thar", "Black", 110000,1500);
	Vehical.car1("swift dzire", "Blue",90000,150);
	Vehical.displayinfo("Scorpio", "Black", 190000,1200);
	
	
	}

}
