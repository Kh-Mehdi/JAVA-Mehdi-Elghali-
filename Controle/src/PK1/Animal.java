package PK1;

public abstract class Animal implements Comparable<Animal> {
    private String nom;
    private int poids,age;
    private static int cpt=0;

    public Animal(String nom,int age, int poids){
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        cpt++;
    }

    public abstract String faireDuBruit();

    public String afficherType(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString(){
        return afficherType()+" : "
                + "Nom : " + nom
                +" poids : "+poids
                +" age : "+age ;
    }

    @Override
    public int compareTo(Animal a){
        return this.nom.compareTo(a.nom);
    }



}
