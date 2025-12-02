/*
 * Ad Soyad: [ENES ZUKRA]
 * Ogrenci No: [250541616]
 * Tarih: [02.12.2025] 
 * Aciklama: Exercise 4.5
 */


public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}


/*
Exercise 4.5 – Stack Diagram + Program Output

SORU 1: STACK DIAGRAM (zoop ikinci kez cagrilinca)
-----------------------------------------------
| zoop(fred="breakfast ", bob=4) |
|-------------------------------|
| clink(fork=4)                  |
|-------------------------------|
| main(bizz=5, buzz=2)           |
|-------------------------------|

SORU 2: CIKTI (OUTPUT)
-----------------------------------------------
just for
any not more 
It's breakfast !
*/
