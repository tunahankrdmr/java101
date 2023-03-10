package javaders;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a, b, select;

        Scanner input=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        a=input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        b= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam:"+(a+b));
                break;
            case 2:
                if(a<b)
                    System.out.println("Çıkarma:"+(b-a));
                else
                    System.out.println("Çıkarma:"+(a-b));
                break;
            case 3:
                System.out.println("Çarpma:"+(a*b));
                break;
            case 4:
                if(a<b)
                    if(a!=0)
                        System.out.println("Bölme:"+(b/a));
                else if(b!=0)
                        System.out.println("Bölme"+(a/b));
                break;
        }
    }
}
