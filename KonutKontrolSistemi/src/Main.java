public class Main {
    public static void main(String[] args) {
        // Binaların oluşturuldu
        Bina bina1 = new Bina("Gülçiçek Apartmanı", 4);
        Bina bina2 = new Bina("Çınar Apartmanı", 7);

        // Daireler oluşturuldu.
        Daire daire1 = new Daire("A Blok", 4, 7);
        Daire daire2 = new Daire("A Blok", 6, 5);
        Daire daire3 = new Daire("A blok", 4, 8);
        Daire daire4 = new Daire("A Blok", 1, 2);

        // Ev sahipleri oluştuldu.
        EvSahibi evSahibi1 = new EvSahibi("Mehmet", "Kaya", bina1);
        EvSahibi evSahibi2 = new EvSahibi("Derya", "Yılmaz", bina2);

        // İlk oluşturulan ev sahibinin bilgileri görüntülendi.
        evSahibi1.bilgiGoruntule();
        System.out.println("----------------------------");

        // Daireler ev sahiplerine eklendi.
        evSahibi1.daireEkle(daire1);
        evSahibi1.daireEkle(daire2); /* daire2'nin kat numarası ilk oluşturulan ev sahibine ait olan binanın
                                     kat sayısından büyük olduğundan hata alındı.*/
        evSahibi1.daireEkle(daire3);
        evSahibi1.daireEkle(daire4);
        evSahibi1.daireSirala(); // İlk oluşturulan ev sahibine ait daireler sıralandı.
        System.out.println("----------------------------");
        evSahibi2.daireEkle(daire1); // daire1 zaten ilk oluşturulan ev sahibine ait olduğu için hata alındı.
        evSahibi2.daireEkle(daire2);
        evSahibi2.daireSirala(); // İkinci oluşturulan ev sahibine ait daireler sıralandı.
        System.out.println("----------------------------");

        // Kiracılar oluşturuldu.
        Kiraci kiraci1 = new Kiraci("Ali", "Çetin", evSahibi1);
        Kiraci kiraci2 = new Kiraci("Ayşe", "Güneş", evSahibi2);
        Kiraci kiraci3 = new Kiraci("Burak", "Meydan", evSahibi1);

        // Kiracılar tarafından daire kiralandı.
        kiraci1.daireKirala(daire1);
        kiraci2.daireKirala(daire3); // daire3 kiracının ev sahibine ait olmadığından hata alındı.
        kiraci3.daireKirala(daire1); // daire1 öncesinde kiraci1 tarafından kiralandığı için hata alındı.
    }
}