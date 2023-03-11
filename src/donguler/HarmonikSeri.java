package donguler;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int sayi;
        double result=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi=sc.nextInt();

        for (int i=1; i<=sayi; i++){
            result+= 1.0/i;
        }
        System.out.println(result);
    }
}
