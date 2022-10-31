import Irasai.Irasas;
import Irasai.Irasass;
import Irasai.PajamuIrasas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biudzetas b1 = new Biudzetas();

        ArrayList<Irasass> irasuSarasas = new ArrayList<>();


        System.out.println("-------------Biudžetas----------------");
        meniu();
        //Naujas irasuSarasas

//        - nuskaitytų vartotojo input'ą
//                - suparsinti vartotojo inputa i objekta
//        - objektus issaugoti failu sistemoje
//                - nuskaityti faila
//                - informacija is nuskaityto failo suparsintu i objektus
//        - pateikti vartotojui turimą informaciją tekstiniu formatu (isprintinti per konsole)

        Irasass pridetiIrasa = new Irasass();
        irasuSarasas.add(pridetiIrasa);

        int meniupasirinkimas = scanner.nextInt();



        switch (meniupasirinkimas) {
            case 1:
                System.out.println("Pasirinkite kategorija: ");
                System.out.println("[1] - Atlyginimas ");
                System.out.println("[2] - Islaidos");
                int inputkat = scanner.nextInt();
                switch(inputkat){
                    case 1:
                        irasuSarasas.add(naujasPajamuIrasas(scanner));
                        break;
                }
        }
        ArrayList<Irasass> pajamuIrasuIrasas = new ArrayList<>();
        for(Irasass x : irasuSarasas){
            if(x instanceof PajamuIrasas){
                pajamuIrasuIrasas.add(x);
            }
        }
        System.out.println(pajamuIrasuIrasas);
    }
    public static Irasass naujasPajamuIrasas(Scanner scanner){
        PajamuIrasas pajamuIrasas = new PajamuIrasas();

        System.out.println("Suma: ");
        pajamuIrasas.setSum(scanner.nextDouble());
        System.out.println("Papildoma informacija:");
        pajamuIrasas.setPapildomaInfo(scanner.nextLine());
        pajamuIrasas.setLocalDateTime(LocalDateTime.now());
        return pajamuIrasas;
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
