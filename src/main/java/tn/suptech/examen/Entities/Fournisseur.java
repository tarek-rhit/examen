package tn.suptech.examen.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "T_FORNISSEUR")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String FullName;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private Long Tel;

    @ManyToOne
    private Pharmacie pharmacie;
    @ManyToOne
    private Magasin magasin;

    @OneToMany( mappedBy = "fournisseur" )
    private List<Facture> factures;
    @OneToMany( mappedBy = "fournisseur" )
    private List<Produit> fournisseur;

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public List<Produit> getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(List<Produit> fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Fournisseur() {
    }

    public Fournisseur(Long id, String fullName, String address, String email, Long tel) {
        this.id = id;
        FullName = fullName;
        this.address = address;
        this.email = email;
        Tel = tel;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return Tel;
    }

    public void setTel(Long tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", Tel=" + Tel +
                '}';
    }
}
