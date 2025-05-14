package ifa.predictif.metier.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cartomancien")
public class Cartomancien extends Medium {
    public Cartomancien() {
    }

    public Cartomancien(String denomination, String genre, String presentation) {
        super(denomination, genre, presentation);
    }

    public Cartomancien(long id, String denomination, String genre, String presentation) {
        super(id, denomination, genre, presentation);
    }
}
