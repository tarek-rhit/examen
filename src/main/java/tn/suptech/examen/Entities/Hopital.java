package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = " T_HOPITAL")
public class Hopital {
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
    private Long Tel;

    @OneToOne
    @JoinColumn(name = "pharmacie_id")
    private Pharmacie pharmacie;

    @OneToMany( mappedBy = "hopital")
    private List <Pavillon> pavillons;


    @OneToMany( mappedBy = "hopital")
    private List <Caisse> caisses;

    @OneToMany( mappedBy = "hopital")
    private List <Magasin> magasins;

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public List<Pavillon> getPavillons() {
        return pavillons;
    }

    public void setPavillons(List<Pavillon> pavillons) {
        this.pavillons = pavillons;
    }

    public List<Caisse> getCaisses() {
        return caisses;
    }

    public void setCaisses(List<Caisse> caisses) {
        this.caisses = caisses;
    }

    public List<Magasin> getMagasins() {
        return magasins;
    }

    public void setMagasins(List<Magasin> magasins) {
        this.magasins = magasins;
    }

    public Hopital() {
    }

    public Hopital(Long id, String name, String address, String email, Long tel) {
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

    public Long getTel() {
        return Tel;
    }

    public void setTel(Long tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Hopital{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                ", Tel=" + Tel +
                '}';
    }
}
