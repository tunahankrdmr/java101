package javaders;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int kenar1, kenar2;
        Scanner input=new Scanner(System.in);
        System.out.println("1. kenarın değerini giriniz:");
        kenar1=input.nextInt();
        System.out.println("2. kenarın değerini giriniz:");
        kenar2=input.nextInt();
        double hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("hipotenüs uzunlu:"+ hipotenus);
    }
}
