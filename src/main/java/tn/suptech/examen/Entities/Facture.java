package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_FACTURE")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date dateFact;
    @Column
    private Double montant;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Caisse caisse;
    @ManyToOne
    private Fournisseur fournisseur;

    public Facture() {
    }

    public Facture(Long id, Date dateFact, Double montant) {
        this.id = id;
        this.dateFact = dateFact;
        this.montant = montant;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateFact() {
        return dateFact;
    }

    public void setDateFact(Date dateFact) {
        this.dateFact = dateFact;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", dateFact=" + dateFact +
                ", montant=" + montant +
                '}';
    }
}
