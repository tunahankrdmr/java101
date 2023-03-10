package javaders;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat= input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik= input.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce= input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya= input.nextInt();

        System.out.println("Muzik notunuzu giriniz:");
        muzik= input.nextInt();

        double ort=(mat+fizik+turkce+kimya+muzik)/5;

        if(ort>=55){
            System.out.println("Sınıfı geçtiniz.");
        }else
            System.out.println("Sınıfta kaldınız.");

        System.out.println("Not ortalamanız: "+ort);
    }
}
