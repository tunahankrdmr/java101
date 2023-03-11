package donguler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int x, faktoriyel=1;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x= input.nextInt();

        for(int i=0; i<=x; i++){
            if(i==0){
                faktoriyel+=i;
                i=1;
            }
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);
    }
}
