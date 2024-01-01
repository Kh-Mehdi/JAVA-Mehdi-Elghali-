package PK1;

public class Oiseau extends Animal {

    public Oiseau(String nom, int poids, int age) {
        super(nom, poids, age);
    }

    public String faireDuBruit() {
        return "L'oiseau chante mélodieusement.";
    }

    public String voler() {
        return"L'oiseau déploie ses ailes et s'envole.";
    }

}
