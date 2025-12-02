/*
 * Ad Soyad: [ENES ZUKRA]
 * Ogrenci No: [250541616]
 * Tarih: [02.12.2025] 
 * Aciklama: Exercise 4.4
 */

public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); 
        // Cevap: Metodun return ettiği değer kullanılmıyor.
        // Derleyici uyarı verir "value of getNumber() is not used"
        // Ama program çalışır, hata vermez.
        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap: Derleyici hata verir.
        // Hata nedeni: sayHello() void döndüğü için, + 7 işlemi yapılamaz.
        // Hata mesajı tipik olarak:
        // "void type not allowed here"
    }
}

