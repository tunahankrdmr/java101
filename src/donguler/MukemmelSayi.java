package donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi= input.nextInt();

        for(int i=1; i<sayi; i++){
                if(sayi%i==0){
                    toplam+=i;
                }
        }
        if(toplam==sayi && sayi!=1){
            System.out.println(toplam+" Mükemmel sayıdır.");
        }else {
            System.out.println(sayi+" Mükemmel sayı değildir.");
        }
    }
}
