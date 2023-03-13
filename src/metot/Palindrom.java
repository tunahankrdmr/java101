package metot;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int x){
        int temp=x, lastNumber, reverseNumber=0;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(x==reverseNumber){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int sayi;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi= input.nextInt();

        boolean result=isPalindrom(101);

        if (result)
            System.out.println(sayi+" Palindrom bir sayıdır:"+result);
        else
            System.out.println(sayi+" Palindrom bir sayı değildir:"+result);
    }
}
