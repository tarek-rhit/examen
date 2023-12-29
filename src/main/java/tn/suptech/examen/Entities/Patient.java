package tn.suptech.examen.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "T_PATIENT")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private Integer tel;



    @OneToMany( mappedBy = "patient" )
    private List<Ordonnance> ordonnances;
    @OneToMany( mappedBy = "patient" )
    private List<Pavillon> pavillons;
    @OneToMany( mappedBy = "patient" )
    private List<Facture> factures;
    @OneToMany( mappedBy = "patient" )
    private List<Lit> lits;







    public Patient() {
    }

    public Patient(Long id, String name, String lastName, String address, String email, Integer tel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.tel = tel;
    }

    public List<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public List<Pavillon> getPavillons() {
        return pavillons;
    }

    public void setPavillons(List<Pavillon> pavillons) {
        this.pavillons = pavillons;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public List<Lit> getLits() {
        return lits;
    }

    public void setLits(List<Lit> lits) {
        this.lits = lits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }
}
