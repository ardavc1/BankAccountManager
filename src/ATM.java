import java.util.Scanner;

public class ATM {


    public void calis() {
        Login atmgiris = new Login();
        Scanner scan = new Scanner(System.in);
        while (true) {
                if (atmgiris.giris()) {
                    System.out.println("Giriş başarılı!");
                } else {
                    System.out.println("Kullanıcı adı ve/veya şifre hatalı girildi.");
                    break;
                }

            String islemler = """
                *************************
                (1) Bakiye Görüntüle
                (2) Para Yatır
                (3) Para Çek
                (4) Para Gönder
                (5) Şifre Değiştir
                (6) Ana Menü
                Çıkış için q'ya basınız.""";

            System.out.println(islemler);
            System.out.println("*************************");

            while (true) {
            System.out.print("Lütfen yapmak istediğiniz işlemi girin: ");
            String islem = scan.next();

                if(islem.equalsIgnoreCase("q")) {
                 System.exit(0);
                }
                else if (islem.equals("1")) {
                    System.out.println("Bakiyeniz: " + atmgiris.nullaccount.getBakiye());
                }
                else if (islem.equals("2")) {
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    int miktar = scan.nextInt();
                    atmgiris.nullaccount.paraYatir(miktar);
                }
                else if (islem.equals("3")) {
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    int miktar = scan.nextInt();
                    atmgiris.nullaccount.paraCek(miktar);
                }
                else if (islem.equals("4")) {
                    System.out.print("Para göndermek istediğiniz hesabın IBAN numamrasını giriniz: ");
                    String hesapNo = scan.next();
                    System.out.print("Göndermek istediğiniz miktarı girin: ");
                    int miktar = scan.nextInt();
                    if(hesapNo.equals(atmgiris.account2.gethesapNo())) {
                        atmgiris.account2.setBakiye(atmgiris.account2.getBakiye() + miktar);
                        atmgiris.nullaccount.paraGonder(miktar, hesapNo);
                    }
                    else if(hesapNo.equals(atmgiris.account.gethesapNo())) {
                        atmgiris.account.setBakiye(atmgiris.account.getBakiye() + miktar);
                        atmgiris.nullaccount.paraGonder(miktar, hesapNo);
                    }
                    else if(hesapNo.equals(atmgiris.account3.gethesapNo())) {
                        atmgiris.account3.setBakiye(atmgiris.account3.getBakiye() + miktar);
                        atmgiris.nullaccount.paraGonder(miktar, hesapNo);
                    }
                    else if(hesapNo.equals(atmgiris.account4.gethesapNo())) {
                        atmgiris.account4.setBakiye(atmgiris.account4.getBakiye() + miktar);
                        atmgiris.nullaccount.paraGonder(miktar, hesapNo);
                    }
                    else if(hesapNo.equals(atmgiris.account5.gethesapNo())) {
                        atmgiris.account5.setBakiye(atmgiris.account5.getBakiye() + miktar);
                        atmgiris.nullaccount.paraGonder(miktar, hesapNo);
                    }
                    else {
                        System.out.println("Lütfen geçerli bir hesap numarası giriniz.");
                    }
                }
                else if (islem.equals("5")) {
                    System.out.print("Yeni şifre: ");
                    String sifre = scan.next();
                    if (sifre.length() < 4) {
                        do {
                            System.out.println("Şifre minimum 4 haneli olabilir. Lütfen tekrar deneyiniz.");
                            System.out.print("Yeni şifre: ");
                            sifre = scan.next();
                        } while (sifre.length() < 4);
                    }
                    else if (sifre.equals(atmgiris.nullaccount.getSifre())) {
                        do {
                            System.out.println("Yeni şifreniz eskisiyle aynı olamaz. Lütfen farklı bir şifre girin.");
                            System.out.print("Yeni şifre: ");
                            sifre = scan.next();
                        }while (sifre.equals(atmgiris.nullaccount.getSifre()));
                    }
                    atmgiris.nullaccount.setSifre(sifre);
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                    System.out.println("Lütfen tekrar giriş yapınız.");
                    break;

                }

                else if (islem.equals("6")) {
                    System.out.println("Ana menüye dönülüyor...");
                    break;
                }
                else {
                    System.out.println("Lütfen geçerli bir işlem giriniz.");
                }
            }
        }
    }

}
