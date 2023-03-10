package javaders;

import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bugünkü sıcaklığı giriniz: ");
        sıcaklık=sc.nextInt();

        if(sıcaklık<5)
            System.out.println("bugün kayak yapabilirsin.");
        else  if(sıcaklık>5 && sıcaklık<15){
            if(sıcaklık>10 && sıcaklık<15)
                System.out.println("Bugün sinema veya piknik yapmaya gidebilirsin.");
        }else if(sıcaklık>15 && sıcaklık<25)
            System.out.println("Bugün piknik yapmaya gidebilirsin.");
        else if(sıcaklık>25)
            System.out.println("Bugün yüzmeye gidebilirsin.");
    }
}
