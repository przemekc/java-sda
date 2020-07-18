package szachy;

import java.util.Scanner;

public class SzachyMain {

    public static void main(String[] args) {
//        List<Figura> figury = new ArrayList<>(32);
//
//        Pion pion1 = new Pion(Kolor.BIALE, new Punkt('C', (byte) 2));
//        Pion pion2 = new Pion(Kolor.CZARNE, new Punkt('D', (byte) 8));
//
//        Hetman hetman1 = new Hetman(Kolor.BIALE, new Punkt('D', (byte) 4));
//        Hetman hetman2 = new Hetman(Kolor.CZARNE, new Punkt('H', (byte) 4));
//
//        figury.add(pion1);
//        figury.add(pion2);
//        figury.add(hetman1);
//        figury.add(hetman2);

        Pion pion3 = new Pion(Kolor.BIALE, new Punkt('C', (byte) 2));
        Scanner scanner = new Scanner(System.in);
        Punkt punkDoPrzesuniecia;
        do {
            System.out.println("Podaj dane punktu");
            String kolumne = scanner.next();
            Byte wiersz = scanner.nextByte();
            punkDoPrzesuniecia = new Punkt(kolumne.charAt(0), wiersz);
        } while (pion3.czyJuzNaTymPunkcie(punkDoPrzesuniecia));
//        } while (pion3.getPunkt().equals(punkDoPrzesuniecia));

        try {
            pion3.przesun(punkDoPrzesuniecia);
        } catch (TenSamPunktException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println("przesuwanie");

//        for (Figura figura : figury) {
//            figura.przesun(new Punkt('D', (byte) 5));
//        }

//        System.out.println("zbijanie");
//        for (Figura figura : figury) {
//            figura.zbij(new Punkt('D', (byte) 5));
//        }
//        System.out.println(hetman1);
    }
}
