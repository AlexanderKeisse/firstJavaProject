package be.intecbrussel;

import java.util.Scanner;

public class ExampleMinNumber {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please fill in a number");

        int n1 = kbd.nextInt();
        minFunction(n1);

        System.out.println(n1);
    }

    public static int minFunction(int n1) {
        if (n1 < 25) {
            return n1;
        }else {
            return n1;
        }
    }

    public static double minFunction(double n1, double n2) {
        return (n1 < n2) ? n1:n2;
    }

}
