public class Hesap {
    private String hesapNo;
    private String sifre;
    private int bakiye;

    public Hesap(String hesapNo, String sifre, int bakiye) {
        this.hesapNo = hesapNo;
        this.sifre = sifre;
        this.bakiye = bakiye;

    }

    public String gethesapNo() {
        return hesapNo;
    }

    public void sethesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int miktar) {
        bakiye += miktar;
        System.out.println("Para başarıyla yatırıldı! Güncel bakiye: " + bakiye + "TL");
    }

    public void paraCek(int miktar) {
        if(miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Güncel bakiye: " +bakiye + "TL");
        }
        if (miktar > 10000) {
            System.out.println("Bir gün içinde maksimum 10000 TL para çekişi yapabilirsiniz.");
        }
        else {
            bakiye -= miktar;
            System.out.println("Açılan bölmeden paranızı alabilirsiniz. Günecel bakiye: " + bakiye + "TL");
        }
    }
    public void paraGonder(int miktar, String hesapNo) {
        if(miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Güncel bakiye: " +bakiye + "TL");
        }
        else {
            bakiye -= miktar;
            System.out.println("Para başarıyla " + hesapNo + " numaralı hesaba aktarılmıştır! " + "Günecel bakiye: " + bakiye + "TL");
        }
    }

}
