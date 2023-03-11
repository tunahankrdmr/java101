package donguler;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        int x;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x= input.nextInt();

        int i=1;
        while (i<=x){
            System.out.println(i);
            i*=2;
        }
    }
}
