package ifa.predictif.metier.modele;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("spirite")
public class Spirite extends Medium {
    private String support;

    public Spirite() {}

    public Spirite(String denomination, String genre, String presentation, String support) {
        super(denomination, genre, presentation);
        this.support = support;
    }

    public Spirite(long id, String denomination, String genre, String presentation, String support) {
        super(id, denomination, genre, presentation);
        this.support = support;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}
