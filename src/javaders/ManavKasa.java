package javaders;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplamTutar;
        int aKilo, eKilo, dKilo, mKilo, pKilo;

        Scanner input=new Scanner(System.in);

        System.out.println("Armut kaç kilo ? :");
        aKilo=input.nextInt();

        System.out.println("Elma kaç kilo ? :");
        eKilo=input.nextInt();

        System.out.println("Domates kaç kilo ? :");
        dKilo=input.nextInt();

        System.out.println("Muz kaç kilo ? :");
        mKilo=input.nextInt();

        System.out.println("Patlıcan kaç kilo ? :");
        pKilo=input.nextInt();

        toplamTutar=(armut*aKilo)+(elma*eKilo)+(domates*dKilo)+(muz*mKilo)+(patlican*pKilo);

        System.out.println("Toplam tutar:"+ toplamTutar);
    }
}
