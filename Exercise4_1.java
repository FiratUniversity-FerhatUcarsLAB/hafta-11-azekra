/*
 * Ad Soyad: [ENES ZUKRA]
 * Ogrenci No: [250541616]
 * Tarih: [02.12.2025] 
 * Aciklama: Exercise 4.1
 */

import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = input.nextLine();

        System.out.print("Enter month: ");
        String month = input.nextLine();

        System.out.print("Enter date: ");
        int date = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.println("\nAmerican Format:");
        printAmerican(day, date, month, year);

        System.out.println("\nEuropean Format:");
        printEuropean(day, date, month, year);

        input.close();
    }
}
