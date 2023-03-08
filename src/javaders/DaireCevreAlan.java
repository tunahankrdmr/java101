package javaders;

import java.util.Scanner;

public class DaireCevreAlan {
    public static void main(String[] args) {
        int yarıcap;
        double alan, cevre, pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçap giriniz:");
        yarıcap=input.nextInt();

        alan=pi*(yarıcap*yarıcap);
        cevre=2*pi*yarıcap;

        System.out.println(alan);
        System.out.println(cevre);
    }
}
