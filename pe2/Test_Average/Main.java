package pe2.Test_Average;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Test Average");

        double a,b,c;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Number 1 : ");
        a = Sc.nextDouble();
        
        System.out.println("Number 2 : ");
        b = Sc.nextDouble();

        System.out.println("Number 3 : ");
        c = Sc.nextDouble();

        System.out.println("Number 1 : " + a + "\nNumber 2 : " + b + "\nNumber 3 : " + c);
        
        double sum = a+b+c;
        double avg = sum/3;

        System.out.println("Avg of the tree numbers : "+ avg);
        Sc.close();
    }
}