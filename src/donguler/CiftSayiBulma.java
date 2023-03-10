package donguler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int x, i=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x= input.nextInt();

        while(i<=x){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
