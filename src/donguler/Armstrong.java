package donguler;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int basNumber=0;
        int tempNumber;
        int basValue;
        int result=0;
        int basPow;

        tempNumber=sayi;
        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=sayi;

        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int j=1; j<=basNumber; j++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }
        System.out.println("sayınız armstrong sayıdır:"+result);
    }
}
