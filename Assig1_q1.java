import java.util.*;
class Numerical{
    public static void main(String avg[]){
        Scanner num= new Scanner(System.in);
        int grade=num.nextInt();
        if (grade >= 90){
            System.out.println("You got A grade");
        }
        else if (grade >= 70 &&  grade < 90){
            System.out.println("You got B grade");
        }
        else if (grade < 70 && grade >= 60 ){
            System.out.println("You got C grade");
        }
        else if (grade < 60 && grade >=45){
            System.out.println("You got D grade");
        }
        else
            System.out.println("You got F grade");
        num.close();
    }
}