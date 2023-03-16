package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Matris {

    public static void main(String[] args) {

        int a,b;

        Scanner scan=new Scanner(System.in);
        System.out.println("Matrisin satır ve sütun sayılarını girin");
        a= scan.nextInt();
        b= scan.nextInt();

        int[][] matris=new int[a][b];

        System.out.println("Matrisin elemanlarını girin");
        for (int i=0; i< a; i++){
            for (int j=0; j< b; j++){
                matris[i][j]= scan.nextInt();
            }
        }
        System.out.println("Matris");
        Arrays.toString(matris);
        int[][] transpoze=new int[b][a];

        for (int i=0; i< a; i++){
            for (int j=0; j< b; j++){
                transpoze[j][i]= matris[i][j];
            }
        }
        System.out.println("Matrisin tersi:");
        for (int[] row:transpoze){
            for (int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }
}
