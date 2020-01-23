package Entity;

public class Caracteristic {

    private int vitesse;
    private int capacity;

    public Caracteristic(int vitesse, int capacity) {
        this.vitesse = vitesse;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVitesse() {
        return vitesse;
    }
}
