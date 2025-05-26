package ifa.predictif.metier.modele;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = javax.persistence.DiscriminatorType.STRING)
public abstract class Medium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String denomination;
    private String genre;
    private String presentation;

    public Medium() {
    }

    public Medium(String denomination, String genre, String presentation) {
        this.denomination = denomination;
        this.genre = genre;
        this.presentation = presentation;
    }

    public Medium(long id, String denomination, String genre, String presentation) {
        this.id = id;
        this.denomination = denomination;
        this.genre = genre;
        this.presentation = presentation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
}
