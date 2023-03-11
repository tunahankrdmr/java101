package donguler;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int x, usluSayi, carpma=1;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x= input.nextInt();
        System.out.println("Üslü sayıyı giriniz:");
        usluSayi= input.nextInt();

        int i=1;
        do {
            carpma *=x;
            i++;
        }while (i<=usluSayi);
        System.out.println(carpma);
    }
}
