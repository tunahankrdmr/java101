package diziler;

import java.util.Arrays;

public class TekrarSayi {

    static boolean isFind(int[] arr, int value){
        for (int a:arr){
            if (a==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={1,8,98,23,5,4,8,2,4,9,1,2,8,23};
        int[] list2=new int[list.length];
        int count=0;

        for (int i=0; i< list.length; i++){
            for (int j=0; j< list.length; j++){
                if ((list[i]==list[j]) && (i!=j) && (list[i]%2==0)){
                    if (!isFind(list2, list[i])){
                        list2[count++]=list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("[ ");
        for (int a:list2){
            if (a!=0){
                System.out.print(a+ " ");
            }
        }
        System.out.print("]");
    }
}
