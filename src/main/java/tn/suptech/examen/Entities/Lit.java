package tn.suptech.examen.Entities;


import javax.persistence.*;

@Entity
@Table( name = "T_LIT")
public class Lit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Float longueur;
    @Column
    private Float largeur;
    @Column
    private String description;


    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Pavillon pavillon;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public Lit() {
    }

    public Lit(Long id, Float longueur, Float largeur, String description) {
        this.id = id;
        this.longueur = longueur;
        this.largeur = largeur;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getLongueur() {
        return longueur;
    }

    public void setLongueur(Float longueur) {
        this.longueur = longueur;
    }

    public Float getLargeur() {
        return largeur;
    }

    public void setLargeur(Float largeur) {
        this.largeur = largeur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lit{" +
                "id=" + id +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", description='" + description + '\'' +
                '}';
    }
}
