package ifa.predictif.metier.modele;

import javax.persistence.*;

@Entity
public class Employe extends Utilisateur {
    private String genre;

    // Constructors
    public Employe() {
        super();
    }

    public Employe(String nom, String prenom, String telephone, String email, String motDePasse, String genre) {
        super(nom, prenom, telephone, email, motDePasse);
        this.genre = genre;
    }

    public Employe(long id, String nom, String prenom, String telephone, String email, String motDePasse, String genre) {
        super(id, nom, prenom, telephone, email, motDePasse);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
