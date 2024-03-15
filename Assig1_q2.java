import java.util.*;
public class Assig1_q2 {
    public static void main(String avg[]){
        Scanner sc= new Scanner(System.in);
        int year =sc.nextInt();
        if (year %4==0 && year%100!=0 || year % 400==0 ){
            System.out.println(("Leap year"));
        }
        else 
            System.out.println("Non leap year");
            

        switch (year %4 ) {
          
            case 0 :
            if (year%100==0 ){
                if (year%400 ==0)
                System.out.println("Leap year");
            }
                  break;
        
            default:
            System.out.println("Non leap year");
                break;}
           sc.close();
    }
    
}
