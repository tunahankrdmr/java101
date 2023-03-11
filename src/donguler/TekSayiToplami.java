package donguler;

import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        int x, total=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz:");
            x= input.nextInt();
            if(x%2==1){
                total +=x;
            }
        }while (x>0);

        System.out.println("Tek sayıların toplamı:"+total);
    }
}
