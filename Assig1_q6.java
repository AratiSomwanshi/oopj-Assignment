import java.util.*;
class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight=sc.nextDouble();
        double height=sc.nextDouble();
        double bmi;
        double h=height/100;
        bmi = weight/(h*h);
        if ( bmi > 18.5 && bmi < 24.9 )
        {
            System.out.println("Normal weight");
        }
        else if ( bmi > 24.9 && bmi < 29.9){
            System.out.println("Overweight");
        }
        else if (bmi >30 && bmi < 35)
        {
            System.out.println("Obese");
                }
        else if (bmi < 18.5){
            System.out.println("UnderWeight");
        }        
        else 
        System.out.println("morbid obesti");
        sc.close();
    }
}
