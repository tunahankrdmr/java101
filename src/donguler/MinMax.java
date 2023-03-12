package donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int x, enKucuk=0, enBuyuk=0, sayi;

        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        x= input.nextInt();

        for (int i=1; i<=x; i++){
            System.out.println(i+". Sayıyı giriniz:");
            sayi=input.nextInt();
            if(sayi>enBuyuk){
                enBuyuk=sayi;
            }else if (sayi<enKucuk){
                enKucuk=sayi;
            }
        }
        System.out.println("En büyük sayı:"+ enBuyuk);
        System.out.println("En küçük sayı:"+enKucuk);
    }
}
