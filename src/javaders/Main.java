package javaders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunuz:");
        int mat=input.nextInt();

        System.out.println("fizik notunuz:");
        int fizik=input.nextInt();

        System.out.println("kimya notunuz:");
        int kimya=input.nextInt();

        System.out.println("türkçe notunuz:");
        int turkce=input.nextInt();

        System.out.println("tarih notunuz:");
        int tarih=input.nextInt();

        System.out.println("müzik notunuz:");
        int muzik=input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double dersOrt=toplam/6;
        String pass=dersOrt >=60 ? "derslerden geçtiniz" : "derslerden kaldınız";

        System.out.println("ders ortalamanız:" + dersOrt );
        System.out.println(pass);
    }
}
