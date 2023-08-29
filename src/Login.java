import java.util.Scanner;
public class Login {



    public boolean giris() {

        Scanner scan = new Scanner(System.in);
        System.out.println("AVCI BANK'A HOŞ GELDİNİZ!");
        System.out.print("Hesap Numarası: ");
        String hesapNo = scan.next();
        System.out.print("Sifre: ");
        String sifre = scan.next();
            if (hesapNo.equals(account.gethesapNo()) && sifre.equals(account.getSifre())) {
                nullaccount = account;
                return true;
            } else if (hesapNo.equals(account2.gethesapNo()) && sifre.equals(account2.getSifre())) {
                nullaccount = account2;
                return true;
            }
            else if (hesapNo.equals(account3.gethesapNo()) && sifre.equals(account3.getSifre())) {
                nullaccount = account3;
                return true;
            }
            else if (hesapNo.equals(account4.gethesapNo()) && sifre.equals(account4.getSifre())) {
                nullaccount = account4;
                return true;
            }
            else if (hesapNo.equals(account5.gethesapNo()) && sifre.equals(account5.getSifre())) {
                nullaccount = account5;
                return true;
            }

            else {
                return false;
            }
        }




    //HESAPLAR
    Hesap nullaccount = new Hesap("0000", "0000", 0);
    Hesap account = new Hesap("0001", "1234", 10000);
    Hesap account2 = new Hesap("0002", "12345", 25000);
    Hesap account3 = new Hesap("0003", "123456", 43829);
    Hesap account4 = new Hesap("0004", "1234567", 5439);
    Hesap account5 = new Hesap("0005", "12345678", 94743);



}
