package tn.suptech.examen.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "T_PAVILLON")
public class Pavillon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Name;
    @Column
    private String Address;
    @Column
    private String email;
    @Column
    private String Tel;


    @ManyToOne
    private Hopital hopital;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private CategoriePavillon categoriePavillon;

    @OneToOne(mappedBy = "pavillon")
    @JsonIgnore
    private Caisse caisse;

    public Hopital getHopital() {
        return hopital;
    }

    public void setHopital(Hopital hopital) {
        this.hopital = hopital;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public CategoriePavillon getCategoriePavillon() {
        return categoriePavillon;
    }

    public void setCategoriePavillon(CategoriePavillon categoriePavillon) {
        this.categoriePavillon = categoriePavillon;
    }

    public List<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }

    public List<Lit> getLits() {
        return lits;
    }

    public void setLits(List<Lit> lits) {
        this.lits = lits;
    }

    @OneToMany ( mappedBy = "pavillon")
    private List<Personnel> personnels;
    @OneToMany ( mappedBy = "pavillon")
    private List<Lit> lits;

    public Pavillon() {
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public Pavillon(Long id, String name, String address, String email, String tel) {
        this.id = id;
        Name = name;
        Address = address;
        this.email = email;
        Tel = tel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Pavillon{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}
