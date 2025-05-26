package ifa.predictif.metier.modele;

import javax.persistence.*;

@Entity
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String note;
    private String message;
    private String type;
    @ManyToOne
    @JoinColumn(name = "consultation_id", nullable = false)
    private Consultation consultation;

    public Prediction() {
    }

    public Prediction(String note, String message, String type, Consultation consultation) {
        this.note = note;
        this.message = message;
        this.type = type;
        this.consultation = consultation;
    }

    public Prediction(long id, String note, String message, String type, Consultation consultation) {
        this.id = id;
        this.note = note;
        this.message = message;
        this.type = type;
        this.consultation = consultation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
