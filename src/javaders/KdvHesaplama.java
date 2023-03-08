package javaders;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdvTutarı=0.18;
        Scanner sn=new Scanner(System.in);
        System.out.println("Lütfen para değeri girin:");
        int urunFiyat=sn.nextInt();
        double kdvFiyat=kdvTutarı*urunFiyat;
        double kdvliTutar=kdvFiyat+urunFiyat;
        System.out.println("KDV oranı:"+ kdvTutarı);
        System.out.println("KDV siz tutar:"+ urunFiyat);
        System.out.println("KDV tutarı:"+ kdvFiyat);
        System.out.println("KDV li tutar:"+ kdvliTutar);
    }
}
