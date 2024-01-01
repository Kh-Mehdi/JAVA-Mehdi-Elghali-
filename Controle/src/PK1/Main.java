package PK1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animaux = {
                new Mammifere("Chien", 15, 3),
                new Mammifere("Chat", 10, 2),
                new Oiseau("Canari", 1, 1),
                new Oiseau("Aigle", 5, 5)
        };

        // a.
        for (Animal animal : animaux) {
            System.out.println(animal.toString());
            animal.afficherType();
            System.out.println();
        }

        // b.
        for (Animal animal : animaux) {
            animal.faireDuBruit();
        }

        // c.
        for (Animal animal : animaux) {
            if (animal instanceof Mammifere) {
                ((Mammifere) animal).allaiter();
            }
        }

        // d.
        for (Animal animal : animaux) {
            if (animal instanceof Oiseau) {
                ((Oiseau) animal).voler();
            }
        }

        // 3.
        Arrays.sort(animaux);
        System.out.println("\nTrié par nom:");
        for (Animal animal : animaux) {
            System.out.println(animal.toString());
        }

        // 4.
        Oiseau nouvelOiseau = new Oiseau("Pigeon", 2, 2);
        animaux = Arrays.copyOf(animaux, animaux.length + 1);
        animaux[animaux.length - 1] = nouvelOiseau;

        // 5.
        animaux = Arrays.copyOfRange(animaux, 1, animaux.length);

        // 6.
        Animal[] nouveauTableau = Arrays.copyOf(animaux, animaux.length);

        // 7.
        Collections.reverse(Arrays.asList(nouveauTableau));


    }
}