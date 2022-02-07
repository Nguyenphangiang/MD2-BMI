import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Enter your weight(in kilogram) : ");
        weight= scanner.nextDouble();
        System.out.print("Enter your height(in meter): ");
        height= scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        if (bmi < 18){
            System.out.printf("Your BMI : %s,Underweight",bmi );
        } else if (bmi < 25.0){
            System.out.printf("Your BMI : %s,Normal",bmi);
        } else if (bmi < 30.0){
            System.out.printf("Your BMI : %s,Overweight",bmi);
        } else {
            System.out.printf("Your BMI : %s,Obese",bmi);
        }
    }
}
