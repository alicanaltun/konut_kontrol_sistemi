import java.util.ArrayList;
import java.util.Collections;

public class EvSahibi {
    private String ad;
    private String soyAd;
    private Bina bina;
    protected ArrayList<Daire> daireler;

    // EvSahibi sınıfının yapıcı metodu
    public EvSahibi(String ad, String soyAd, Bina bina) {
        if (bina.isActive() == false) {
            this.ad = ad;
            this.soyAd = soyAd;
            this.bina = bina;
            this.daireler = new ArrayList<>();
            bina.setActive(true);
        } else {
            System.out.println("Hata: " + bina.getAdres() + "'nın bir ev sahibi olduğundan ev sahibi ataması yapılamadı!");
        }
    }

    // Oluşturlan dairelerin ev sahibine ait olanları eklenir
    public void daireEkle(Daire daire) {
        if (daire.isActive() == false) {
            if (daire.getKatNumarasi() <= this.bina.getKatSayisi()) {
                this.daireler.add(daire);
                daire.setActive(true);
            } else {
                System.out.println("Hata: " + daire.getDaireNumarasi() + ". dairenin kat sayısı binanın kat sayısından büyük olduğu için daire eklenmedi!");
            }
        } else {
            System.out.println("Hata : " + daire.getDaireNumarasi() + ". dairenin zaten bir ev sahibi olduğundan daire eklenmedi!");
        }
    }

    // Ev sahibi ile ilgili bilgiler gösterilir.
    public void bilgiGoruntule() {
        System.out.println(ad + " " + soyAd + ": " + bina.getAdres() + "'nın sahibi");
    }

    // Daire numarasına göre karşılaştırılmış daireleri sıralar ve ekrana yazdırır.
    public void daireSirala() {
        Collections.sort(daireler);
        System.out.println("Bina Adı: " + bina.getAdres() + ", Ev Sahibi: " + this.ad + " " + this.soyAd);
        for (Daire daire : daireler) {
            daire.bilgiGoruntule();
        }
    }
}