public class Daire extends Konut implements Comparable<Daire> {
    private int katNumarasi;
    private int daireNumarasi;
    private boolean daireDoluMu;

    // Daire sınıfının yapıcı metodu
    public Daire(String adres, int katNumarasi, int daireNumarasi) {
        super(adres);
        this.katNumarasi = katNumarasi;
        this.daireNumarasi = daireNumarasi;
        setActive(false);
        setDaireDoluMu(false);
    }

    // // Daire ile ilgili bilgiler gösterilir.
    @Override
    void bilgiGoruntule() {
        System.out.println(getAdres() + ", " + getKatNumarasi() + ". Kat, " + getDaireNumarasi() + ". Daire");
    }

    // Daireler daire numarasına göre karşılaştırılır.
    @Override
    public int compareTo(Daire o) {
        return this.getDaireNumarasi() - o.getDaireNumarasi();
    }

    // getter-setter metodları
    public int getKatNumarasi() {
        return katNumarasi;
    }

    public int getDaireNumarasi() {
        return daireNumarasi;
    }

    public boolean isDaireDoluMu() {
        return daireDoluMu;
    }

    public void setDaireDoluMu(boolean daireDoluMu) {
        this.daireDoluMu = daireDoluMu;
    }
}