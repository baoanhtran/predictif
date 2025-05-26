package ifa.predictif.metier.modele;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Client extends Utilisateur {
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String adresse;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idProfilAstral")
    private ProfilAstral profilAstral;

    // Constructors
    public Client() {
        super();
    }

    public Client(String nom, String prenom, String telephone, String email, String motDePasse,
                  Date dateNaissance, String adresse, ProfilAstral profilAstral) {
        super(nom, prenom, telephone, email, motDePasse);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.profilAstral = profilAstral;
    }

    public Client(long id, String nom, String prenom, String telephone, String email, String motDePasse,
                  Date dateNaissance, String adresse, ProfilAstral profilAstral) {
        super(id, nom, prenom, telephone, email, motDePasse);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.profilAstral = profilAstral;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ProfilAstral getProfilAstral() {
        return profilAstral;
    }

    public void setProfilAstral(ProfilAstral profilAstral) {
        this.profilAstral = profilAstral;
    }
}
