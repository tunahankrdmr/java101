package javaders;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName="Patika", password="Java123", kullanıcıAdi, sifre, password2;
        int secim;

        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        kullanıcıAdi= input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre= input.nextLine();

        if(kullanıcıAdi.equals(userName) && password.equals(sifre)){
            System.out.println("Giriş doğrulandı.");
        }else if(kullanıcıAdi.equals(userName) && !password.equals(sifre)){
            System.out.println("Şifreniz hatalı\nŞifreyi değiştirmek için 1 istemiyorsanız 2 giriniz.");
            secim=input.nextInt();
            switch (secim){
                case 1:
                    System.out.println("yeni şifrenizi giriniz: ");
                    password2= input.next();
                    while(password2.equals(password)){
                        System.out.println("Yeni şifreniz eski şifreyle aynı olamaz.\nYeni şifrenizi giriniz:");
                        password2= input.next();
                    }
                    password=password2;
                    System.out.println("yeni şifreniz oluşturuldu.");
                    break;
                case 2:
                    System.out.println("Şifre değişikliği başarısız.");
                    break;
            }
        }else{
            System.out.println("Kullanıcı girişi başarısız.");
        }
    }
}
