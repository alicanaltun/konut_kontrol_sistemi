public abstract class Konut {
    private String adres;
    private boolean isActive;

    // Konut abstract sınıfının yapıcı metodu
    public Konut(String adres) {
        this.adres = adres;
    }

    // Bina ve Kiraci sınıfın implemente ettiği metod
    abstract void bilgiGoruntule();

    // getter-setter metodları
    public String getAdres() {
        return adres;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
