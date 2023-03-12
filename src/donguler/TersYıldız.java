package donguler;

import java.util.Scanner;

public class TersYıldız {
    public static void main(String[] args) {
        int x;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x= input.nextInt();

        for(int i=0; i<x; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=(2*(x-i))-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
