package PK1;

public class Mammifere extends Animal{

    public Mammifere(String nom, int age, int poids) {
        super(nom, age, poids);
    }

    @Override
    public String faireDuBruit() {
        return "Le Mammifere fait d bruit ";
    }

    public String allaiter(){
        return "Le Mammifere allaite ses petits ";
    }

}
