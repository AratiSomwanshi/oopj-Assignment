import java.util.*;
class Calculater{
public static void main(String avg[]){
Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();
int num2= sc.nextInt();
System.out.println("1]Addtion" + " " + "2] Subtraction" + " "+ "3] Multiplication"+ " " +"4] Division");
int choice = sc.nextInt();
int num;

switch (choice) {
    case 1:
    num =num1+num2;
    System.out.println(num);
         break;
    case 2:
    num =num1-num2;
    System.out.println(num);
        break;
    case 3:
    num =num1*num2;
    System.out.println(num);
        break;  
    case 4:
    num =num1/num2;
    System.out.println(num);
        break;      
    default:
    System.out.println("Default number");
        break;
}
sc.close();
}

}