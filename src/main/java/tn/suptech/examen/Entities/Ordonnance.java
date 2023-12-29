package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_ORDONNANCE")
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date dateObtention;

    @ManyToOne
    private Personnel personnel;

    @ManyToOne
    private Patient patient;

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Ordonnance() {
    }

    public Ordonnance(Long id, Date dateObtention) {
        this.id = id;
        this.dateObtention = dateObtention;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(Date dateObtention) {
        this.dateObtention = dateObtention;
    }

    @Override
    public String toString() {
        return "Ordonnance{" +
                "id=" + id +
                ", dateObtention=" + dateObtention +
                '}';
    }
}
