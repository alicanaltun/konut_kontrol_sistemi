public class Bina extends Konut {
    private int katSayisi;

    // Bina sınıfının yapıcı metodu
    public Bina(String adres, int katSayisi) {
        super(adres);
        this.katSayisi = katSayisi;
        setActive(false);
    }

    // Bina ile ilgili bilgiler gösterilir.
    @Override
    void bilgiGoruntule() {
        System.out.println(getKatSayisi() + "katlı " + getAdres());
    }

    //getter metodu
    public int getKatSayisi() {
        return katSayisi;
    }
}