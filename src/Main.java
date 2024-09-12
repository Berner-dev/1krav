import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indlæs input fra brugeren

        System.out.print("Indtast tid på dagen (dag/aften/nat): ");
        String tidpaadagen = scanner.nextLine().toLowerCase();

        System.out.print("Indtast trafikmængden (høj eller lav?) ");
         String trafikmaengde = scanner.nextLine().toLowerCase();

        System.out.print("Indtast områdets type (bolig/erhverv/blandet)");
        String omraadetstype = scanner.nextLine().toLowerCase();

        System.out.print("Er der en nødsituation (ja/nej)? ");
         String noedsituation = scanner.nextLine().toLowerCase();

        // Trafiklysfarve baseret på brugerens input
        String trafiklysfarve;

        if (noedsituation.equals("ja")) {
            trafiklysfarve = "grøn";

        } else if (tidpaadagen.equals("dag") && trafikmaengde.equals("lav")) {
            trafiklysfarve = "grøn";

        } else if (tidpaadagen.equals("aften")) {
            trafiklysfarve = "gul";

        } else if (tidpaadagen.equals("nat") && trafikmaengde.equals("lav")) {
            trafiklysfarve = "gul";

        } else if (tidpaadagen.equals("nat") && trafikmaengde.equals("høj")) {
            trafiklysfarve = "rød";

        } else if (omraadetstype.equals("bolig") && trafikmaengde.equals("høj")) {
            trafiklysfarve = "rød";
        } else {

            trafiklysfarve = "rød";
        }

        // Udskrivning af trafiklysfarve
        System.out.println("Trafiklysfarve: " + trafiklysfarve);

        // Adgang til området eller ej
        boolean adgang;

        if (noedsituation.equals("ja")) {
            adgang = true; // Nødsituation har altid prioritet
        } else if (omraadetstype.equals("erhverv") || omraadetstype.equals("blandet")) {
            if (trafikmaengde.equals("lav")) {
                adgang = true;
            } else {
                adgang = false;
            }
        } else if (omraadetstype.equals("bolig") && tidpaadagen.equals("nat")) {
            adgang = false;
        } else {
            adgang = true; // Adgang tilladt som standard i alle andre tilfælde
        }

        // Udskriv adgangstilladelse
        System.out.println("Tillad biler at køre: " + (adgang ? "Ja" : "Nej"));

        // Luk Scanner
        scanner.close();


        }
    }




























