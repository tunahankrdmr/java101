package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Dizi {
    public static void main(String[] args) {
        int n;

        Scanner scan=new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        n= scan.nextInt();

        int[] list=new int[n];

        for (int i=0; i<list.length; i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i]= scan.nextInt();
        }
        Arrays.sort(list);
        for (int sayi:list) {
            System.out.print(sayi+" ");
        }
    }
}
