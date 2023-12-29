package tn.suptech.examen.Entities;

import javax.persistence.*;

@Entity
@Table(name =" T_PRODUIT")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Designation;
    @Column
    private Double prix;
    @Column
    private Integer stock;
    @Column
    private String emplacement;

    @ManyToOne
    private Fournisseur fournisseur;// on admet qu'un produit se trouve que chez un seul fournisseur
    @ManyToOne
    private Magasin magasin;
    @ManyToOne
    private Pharmacie pharmacie;

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Produit() {
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public Produit(Long id, String designation, Double prix, Integer stock, String emplacement) {
        this.id = id;
        Designation = designation;
        this.prix = prix;
        this.stock = stock;
        this.emplacement = emplacement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", Designation='" + Designation + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                ", emplacement='" + emplacement + '\'' +
                '}';
    }
}
