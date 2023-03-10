package javaders;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km, yas,yolculukTipi;
        double normalUcret, yasIndirimi, indirimliTutar, geriDonus, toplamTutar;

        Scanner input=new Scanner(System.in);

        System.out.println("Gideceğiniz kilometreyi yazınız:");
        km= input.nextInt();

        System.out.println("Yaşınızı giriniz:");
        yas= input.nextInt();

        while(yas<0 || km<0){
            System.out.println("Hatalı veri girdiniz!!!");
            System.out.println("Gideceğiniz kilometreyi yazınız:");
            km= input.nextInt();
            System.out.println("Yaşınızı giriniz:");
            yas= input.nextInt();
        }
        System.out.println("Tek Yön için 1 Gidiş-Dönüş için 2 yi seçiniz :");
        yolculukTipi= input.nextInt();

        switch (yolculukTipi){
            case 1:
                if(yas<12){
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.50;
                    indirimliTutar=normalUcret-yasIndirimi;
                    System.out.println("Toplam tutar: "+indirimliTutar);
                }else if(yas>=12 && yas<24){
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.10;
                    indirimliTutar=normalUcret-yasIndirimi;
                    System.out.println("Toplam tutar: "+indirimliTutar);
                }else if(yas>=24 && yas<65){
                    normalUcret=km*0.10;
                    System.out.println("Toplam tutar: "+normalUcret);
                }else{
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.30;
                    indirimliTutar=normalUcret-yasIndirimi;
                    System.out.println("Toplam tutar: "+indirimliTutar);
                }
                break;
            case 2:
                if (yas<12){
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.50;
                    indirimliTutar=normalUcret-yasIndirimi;
                    geriDonus=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-geriDonus)*2;
                    System.out.println("Toplam tutar: "+toplamTutar);
                }else if (yas>=12 && yas<24){
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.10;
                    indirimliTutar=normalUcret-yasIndirimi;
                    geriDonus=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-geriDonus)*2;
                    System.out.println("Toplam tutar: "+toplamTutar);
                }else if(yas>=24 && yas<65){
                    normalUcret=km*0.10;
                    geriDonus=normalUcret*0.20;
                    toplamTutar=(normalUcret-geriDonus)*2;
                    System.out.println("Toplam tutar: "+toplamTutar);
                }else{
                    normalUcret=km*0.10;
                    yasIndirimi=normalUcret*0.30;
                    indirimliTutar=normalUcret-yasIndirimi;
                    geriDonus=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-geriDonus)*2;
                    System.out.println("Toplam tutar: "+toplamTutar);
                }
                break;
        }
    }
}
