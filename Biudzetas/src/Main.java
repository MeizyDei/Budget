import Irasai.Irasas;
import Irasai.Irasass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biudzetas b1 = new Biudzetas();

        ArrayList<Irasass> irasas = new ArrayList<>();


        System.out.println("-------------Biudžetas----------------");
        meniu();
        //Naujas irasas

//        - nuskaitytų vartotojo input'ą
//                - suparsinti vartotojo inputa i objekta
//        - objektus issaugoti failu sistemoje
//                - nuskaityti faila
//                - informacija is nuskaityto failo suparsintu i objektus
//        - pateikti vartotojui turimą informaciją tekstiniu formatu (isprintinti per konsole)
        int meniupasirinkimas = scanner.nextInt();
        switch (meniupasirinkimas) {
            case 1:
                System.out.println("Pasirinkite kategorija: ");
                System.out.println("[1] - Atlyginimas ");
                System.out.println("[2] - Islaidos");
                int inputkat = scanner.nextInt();
                switch(inputkat){
                    case 1:

                }
        }

    }

    public static int meniu() {
        System.out.println("[1] - naujas irasas\n" +
                "[2] - gauti irasus\n" +
                "[3] - trinti irasa\n" +
                "[4] - redaguoti irasa\n" +
                "[5] - balansas\n" +
                "[6] - gauti is failo\n" +
                "[7] - saugoti i faila\n" +
                "[8] - uzdaryti programa");
        return 0;
    }

    public static double pridetiPajamas(Scanner scanner) {
        int id;
        double suma;
        String papildomainfo;
        LocalDateTime dataIrLaikas;

        return 0;
    }
    public static double pajamuIrasas(Scanner scanner){
        return 0;
    }



}
