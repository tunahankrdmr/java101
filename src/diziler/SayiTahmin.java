package diziler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        Random random=new Random();
        int number= random.nextInt(100);
        Scanner input=new Scanner(System.in);
        System.out.println(number);

        int count=0;
        boolean isWrong=false;
        boolean isWin=false;
        int[] wrong=new int[5];

        while (count<5){
            System.out.println("Tahmininizi giriniz : ");
            int sayi=input.nextInt();

            if(sayi<0 || sayi>100){
                if (isWrong){
                    count++;
                    System.out.println("Hatalı değer girdiniz...\n Kalan hakkınız : "+(5-count));

                }else {
                    isWrong=true;
                    System.out.println("Değer aralıklarını aştınız!!!\n Bir sonraki hatalı girişinizde haklarınız azaltılacak.");
                }
                continue;
            }else {
                if (sayi<number){
                    System.out.println("Tahmininizi yükseltin.");
                }else if(number==sayi){
                    System.out.println("Tebrikler doğru tahmin ettiniz.");
                    isWin=true;
                    break;
                }else {
                    System.out.println("Tahmininizi düşürün.");
                }
                wrong[count]=sayi;
                count++;
                System.out.println("Kalan hakkınız : "+(5-count));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
