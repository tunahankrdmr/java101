package donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1, sayi2;
        int ebob=1;

        Scanner input=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        sayi1=input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        sayi2=input.nextInt();

        //ebob
        if(sayi1>=sayi2){
            int i=sayi1;
            while (i>=1){
                if(sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                    System.out.println(ebob);
                    break;
                }
                i--;
            }
        }else{
            int i=sayi2;
            while (i>=1){
                if(sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                    System.out.println(ebob);
                    break;
                }
                i--;
            }
        }

        //ekok
        int i=1;
        while (i<=(sayi1*sayi2)){
            if(i%sayi1==0 && i%sayi2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
