/*
 * Ad Soyad: [ENES ZUKRA]
 * Ogrenci No: [250541616]
 * Tarih: [02.12.2025] 
 * Aciklama: Exercise 4.3
 */

public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}


/*
Exercise 4.3 – Stack Diagram + Program Output

SORU 1: STACK DIAGRAM (ping ilk kez cagrilinca)
-----------------------------------------------
| ping()                      |  <-- Active
|-----------------------------|
| baffle()                    |
|-----------------------------|
| zoop()                      |
|-----------------------------|
| main(String[] args)          |
|-----------------------------|

SORU 2: CIKTI (OUTPUT)
-----------------------------------------------
No, I wug.
You wugga wug.
I wug.
*/

