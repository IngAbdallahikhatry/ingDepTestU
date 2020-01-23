package Entity;

public class Intel implements Processor {
    private int vitesse;
    private String name;

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Intel(int vitesse, String name) {
        this.vitesse = vitesse;
        this.name = name;
    }

    public int getSpeed() {
        return 40;
    }
}
