package ifa.predictif.metier.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfilAstral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String signeZodiaque;
    private String signeAstrologiqueChinois;
    private String couleurPorteBonheur;
    private String animalTotem;

    public ProfilAstral() {
    }

    public ProfilAstral(String signeZodiaque, String signeAstrologiqueChinois, String couleurPorteBonheur, String animalTotem) {
        this.signeZodiaque = signeZodiaque;
        this.signeAstrologiqueChinois = signeAstrologiqueChinois;
        this.couleurPorteBonheur = couleurPorteBonheur;
        this.animalTotem = animalTotem;
    }

    public ProfilAstral(long id, String signeZodiaque, String signeAstrologiqueChinois, String couleurPorteBonheur, String animalTotem) {
        this.id = id;
        this.signeZodiaque = signeZodiaque;
        this.signeAstrologiqueChinois = signeAstrologiqueChinois;
        this.couleurPorteBonheur = couleurPorteBonheur;
        this.animalTotem = animalTotem;
    }
}

