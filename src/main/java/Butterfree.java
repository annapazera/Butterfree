import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anna Kacprzak on 2016-08-08.
 */
final class Butterfree {
    public static void main(String[] args) {
        start();
        Butterfree butterfree = new Butterfree();
    }
//Metoda
//    1.Parametry
//    2.Modyfikator dostępu
//    3.Ciało
//    4.Nazwa
//    5.Czy jest staic czy nie
//    6. Typ zwracany
//    7.Jakie wyjątki zgłasza(opcjonalnie)
//    8.Final(opcjonalnie)
    private static void start() {
        System.out.println("Ile pokemonów utworzyć?");
        int liczbaPokemonowDoUtworzenia;
        Scanner odczyt = new Scanner(System.in);
        liczbaPokemonowDoUtworzenia = odczyt.nextInt();

        ArrayList<Integer> pokemony = utworzPokemony(liczbaPokemonowDoUtworzenia);

        for (Integer butterfree : pokemony) {
            System.out.println(butterfree);
        }

    }

    private static ArrayList<Integer> utworzPokemony(int liczbaPokemonowDoUtworzenia) {
        ArrayList<Integer> listaPokemonow = new ArrayList();

        for (int i = 0; i < liczbaPokemonowDoUtworzenia; i++) {
            listaPokemonow.add(liczbaPokemonowDoUtworzenia);
        }
        return listaPokemonow;
    }


}
