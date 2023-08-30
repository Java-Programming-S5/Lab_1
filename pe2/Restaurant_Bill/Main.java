package pe2.Restaurant_Bill;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurant Bill");
        
        double charge, tax, tip;

        Scanner Sc = new Scanner(System.in);
        System.out.print("Charge : ");
        charge = Sc.nextDouble();

        tax = charge * 0.0675;
        tip = (charge + tax) * 0.2;
        System.out.println("====== Restaurant Bill ======");
        System.out.println("Charge : "+ charge);
        System.out.println("Tax : "+ tax);
        System.out.println("Tip : "+ tip);

        System.out.println("====== Thanks for comming ======");
    }
}
