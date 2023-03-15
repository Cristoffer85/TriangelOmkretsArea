//Pseudokod

//Termer för övningen:
        // System.out.println(); skriver ut till konsolen
        // Scanner, en klass som används för att läsa in data från användaren
        // System.in, en inmatningsström som används för att läsa in data från användaren
        // nextLine(), en metod som läser in en rad från användaren
        // math.sqrt(), en metod som beräknar kvadratroten av ett tal
        // math.sin(), en metod som beräknar sinus av ett tal
        // Math, en klass som innehåller matematiska metoder (kolla in dokumentationen för mer information)

//Instruktioner
        // Fråga användaren om triangelns två kortsidor
        // Beräkna triangelns hypotenusan med Pythagoras sats (c^2 = a^2 + b^2)
        // Beräkna triangelns vinkel med trigonometri (c = a / sin(A))
        // Beräkna triangelns area med trigonometri (A = (a * b) / 2)
        // Beräkna triangelns omkrets med Pythagoras sats (c + a + b)
        // Skriv ut resultatet

//End

/* System.out.println(); skriver ut till konsolen
        * Scanner, en klass som används för att läsa in data från användaren
        * System.in, en inmatningsström som används för att läsa in data från användaren
        * nextLine(), en metod som läser in en rad från användaren
        * math.sqrt(), en metod som beräknar kvadratroten av ett tal
        * math.sin(), en metod som beräknar sinus av ett tal
        * Math, en klass som innehåller matematiska metoder (kolla in dokumentationen för mer information)

        Instruktioner

        - Fråga användaren om triangelns två kortsidor *v, a b
        - Beräkna triangelns hypotenusan med Pythagoras sats (c^2 = a^2 + b^2)
        - Beräkna triangelns vinkel med trigonometri (c = a / sin(A))
        - Beräkna triangelns area med trigonometri (A = (a * b) / 2)
        - Beräkna triangelns omkrets med Pythagoras sats (c + a + b)
        - Skriv ut resultatet */


import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {
        // Deklarera
        float a; // kortsida a
        float b; // kortsida b
        float c; // hypotenusan c
        float A; // vinkeln A
        float area; // area
        float circumference; // omkrets

        // Fråga användaren om kortsidorna
        // Jag hjälper dig med koden den här gången
        Scanner scanner = new Scanner(System.in); // Deklarera en scanner
        System.out.println("Ange kortsida a: "); // Fråga användaren om kortsida a
        a = scanner.nextFloat(); // Läs in kortsida a
        System.out.println("Ange kortsida b: "); // Fråga användaren om kortsida b
        b = scanner.nextFloat(); // Läs in kortsida b

        c = (float) (Math.pow(a, 2) + Math.pow(b, 2))); // c^2 = (a^2 + b^2); //Hypotenusa
        float Hypotenusa2 = (float) Math.sqrt(c);

        area = a * b / 2; //Area
        circumference = (Hypotenusa2 + a + b); //Omkrets

        A = (float) (Math.sin(area) / a); //Vinkel     (c = a / sin(A))
        // Funkar inte riktigt än, fråga Marcus om hjälp/rådgivning

        // Skriv ut
        System.out.println("Triangelns hypotenusa är " + Hypotenusa2);
        System.out.println("Triangelns vinkel är " + A);
        System.out.println("Triangelns Area är " + area);
        System.out.println("Triangelns Omkrets är " + circumference);
    }
}
