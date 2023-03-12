package donguler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc=new Scanner(System.in);
        int count=3;
        int balance=1500;
        int secim, price;
        boolean isTrue=true;

        while (count>0){
            System.out.println("Kullanıcı isminizi giriniz:");
            userName=sc.nextLine();
            System.out.println("Şifrenizi giriniz:");
            password= sc.nextLine();
            if(userName.equals("patika") && password.equals("java123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                while (isTrue){
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim= sc.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Para miktarı:");
                            price=sc.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.println("Para miktarı:");
                            price=sc.nextInt();
                            if(balance>=price){
                                balance-=price;
                            }else {
                                System.out.println("Bakiyeniz yetersiz!!!");
                            }
                            break;
                        case 3:
                            System.out.println("Hesabınızdaki kalan bakiyeniz:"+balance);
                            break;
                        case 4:
                            System.out.println("hesabınızdan çıkış yaptınız.");
                            isTrue=false;
                            break;
                    }
                }
                break;
            }else{
                count--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(count==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız : " + count);
                }
            }
        }
    }
}
