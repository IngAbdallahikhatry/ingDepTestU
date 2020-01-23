package Entity;

import org.springframework.stereotype.Component;

@Component
public class AMD implements Processor {
    private int vitesse;
    private String name;
    public AMD() {

    }

    public AMD(int vitesse, String name) {
        this.vitesse = vitesse;
        this.name = name;
    }

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

    public int getSpeed() {
        return 70;
    }

    public String Afficher() {
        return "name"+name+"vitesse"+vitesse;
    }
}
