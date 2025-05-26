package ifa.predictif.metier.modele;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "employe_id", nullable = false)
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "medium_id", nullable = false)
    private Medium medium;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prediction> predictions;

    private String commentaire;

    public Consultation() {}

    public Consultation(Client client, Employe employe, Medium medium, Date dateDebut, Date dateFin, List<Prediction> predictions, String commentaire) {
        this.client = client;
        this.employe = employe;
        this.medium = medium;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.predictions = predictions;
        this.commentaire = commentaire;
    }

    public Consultation(long id, Client client, Employe employe, Medium medium, Date dateDebut, Date dateFin, List<Prediction> predictions, String commentaire) {
        this.id = id;
        this.client = client;
        this.employe = employe;
        this.medium = medium;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.predictions = predictions;
        this.commentaire = commentaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(List<Prediction> predictions) {
        this.predictions = predictions;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
