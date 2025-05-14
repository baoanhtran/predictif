package ifa.predictif.metier.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("astrologue")
public class Astrologue extends Medium {
    private String formation;
    private String promotion;

    public Astrologue() {
    }

    public Astrologue(String denomination, String genre, String presentation, String formation, String promotion) {
        super(denomination, genre, presentation);
        this.formation = formation;
        this.promotion = promotion;
    }

    public Astrologue(long id, String denomination, String genre, String presentation, String formation, String promotion) {
        super(id, denomination, genre, presentation);
        this.formation = formation;
        this.promotion = promotion;
    }
}
