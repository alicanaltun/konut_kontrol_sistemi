public class Kiraci {
    private String ad;
    private String soyAd;
    private EvSahibi evSahibi;
    private boolean dairesiVarMi;

    // Kiraci sınıfının yapıcı metodu
    public Kiraci(String ad, String soyAd, EvSahibi evSahibi) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.evSahibi = evSahibi;
        setDairesiVarMi(false);
    }

    // Kiracının ev sahibine ait olan binadan daire kiralayabilmesi için gereken metod
    public void daireKirala(Daire daire) {
        if (evSahibi.daireler.contains(daire)) {
            if ((isDairesiVarMi() == false) && (daire.isDaireDoluMu() == false)) {
                setDairesiVarMi(true);
                daire.setDaireDoluMu(true);
                System.out.println(daire.getDaireNumarasi() + ". daire " + ad + " " + soyAd + " tarafından kiralandı.");
            } else {
                System.out.println("Hata: " + daire.getDaireNumarasi() + ". daire kiralanmış olduğundan tekrar kiralanamaz!");
            }
        } else {
            System.out.println("Hata: " + daire.getDaireNumarasi() + ". daire, kiracının ev sahibine ait olmadığından kiralanamaz!");
        }
    }

    // getter-setter metodları
    public String getAd() {
        return ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public EvSahibi getEvSahibi() {
        return evSahibi;
    }

    public boolean isDairesiVarMi() {
        return dairesiVarMi;
    }

    public void setDairesiVarMi(boolean dairesiVarMi) {
        this.dairesiVarMi = dairesiVarMi;
    }
}