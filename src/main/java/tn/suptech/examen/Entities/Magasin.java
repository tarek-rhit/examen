package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "T_MAGASIN")
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long Tel;
    @Column
    private String email;
    @Column
    private String Address;


    @ManyToOne
    private Hopital hopital;
    @OneToMany(mappedBy = "magasin")
    private List<Fournisseur> fournisseurs;
    @OneToMany(mappedBy = "magasin")
    private List<Personnel> personnels;
    @OneToMany(mappedBy = "magasin")
    private List<Produit> produits;

    public Hopital getHopital() {
        return hopital;
    }

    public void setHopital(Hopital hopital) {
        this.hopital = hopital;
    }

    public List<Fournisseur> getFournisseurs() {
        return fournisseurs;
    }

    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }

    public Magasin() {
    }

    public List<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Magasin(Long id, Long tel, String email, String address) {
        this.id = id;
        Tel = tel;
        this.email = email;
        Address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTel() {
        return Tel;
    }

    public void setTel(Long tel) {
        Tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "id=" + id +
                ", Tel=" + Tel +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
