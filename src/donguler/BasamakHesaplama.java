package donguler;

import java.util.Scanner;

public class BasamakHesaplama {
    public static void main(String[] args) {
        int x;
        int basValue;
        int result=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        x=sc.nextInt();

        while(x!=0){
            basValue=x%10;
            result+=basValue;
            x/=10;
        }
        System.out.println(result);
    }
}
