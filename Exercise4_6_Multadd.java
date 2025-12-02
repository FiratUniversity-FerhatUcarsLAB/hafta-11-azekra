/*
 * Ad Soyad: [ENES ZUKRA]
 * Ogrenci No: [250541616]
 * Tarih: [02.12.2025] 
 * Aciklama: Exercise 4.6
 */

public class Exercise4_6_Multadd {

    // Method to perform a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Method to calculate: x*e^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        // Test multadd with simple example
        double result1 = multadd(2, 3, 4); // 2*3 + 4 = 10
        System.out.println("multadd(2, 3, 4) = " + result1);

        // Using multadd to compute sin(pi/4) + cos(pi/4)/2
        double piOver4 = Math.PI / 4;
        double trigResult = multadd(Math.cos(piOver4), 0.5, Math.sin(piOver4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + trigResult);

        // Using multadd to compute log10 + log20
        double logResult = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log10 + log20 = " + logResult);

        // Test expSum method
        double x = 2.0;
        double expSumResult = expSum(x);
        System.out.println("expSum(" + x + ") = " + expSumResult);
    }
}
