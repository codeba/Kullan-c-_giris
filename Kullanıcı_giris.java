package patika;

import java.util.Scanner;

public class Kullanıcı_giris {
    public static void main(String[] args) {
        String userName, pasword, pasword2;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = sc.nextLine();
        System.out.println("Şifre giriniz:");
        pasword = sc.nextLine();
        if (userName.equals("patika") && pasword.equals("java123")) {
            System.out.println("giriş yaptınız");
        } else {
            System.out.println("hatalı giriş");
            for ( count = 0; count < 3; count++) {

                System.out.println("kurtarma şifresini girin:");
                pasword2 = sc.nextLine();

                if (pasword2.equals("12345")) {
                    System.out.println("giriş başarılı");
                } else {

                    System.out.println("hatalı giriş tekrar deneyin");


                }
            }
            if (count > 3) {
                System.out.println("sistem kilitlendi");
            }
        }
    }
}

