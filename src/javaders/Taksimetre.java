package javaders;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmUcreti=2.20, minTutar=20, aUcreti=10 ;
        int uzaklık;

        Scanner input=new Scanner(System.in);
        System.out.println("Gidilecek km giriniz:");
        uzaklık= input.nextInt();

        aUcreti+=(uzaklık*kmUcreti);

        double a=(aUcreti < minTutar) ? aUcreti=minTutar : aUcreti;

        System.out.println(a);
    }
}
