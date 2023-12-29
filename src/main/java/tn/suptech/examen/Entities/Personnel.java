package tn.suptech.examen.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_PERSONNEL")
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Name;
    @Column
    private String lastName;
    @Column
    private String address;
    @Column
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name ="personnel_role",
            joinColumns =  @JoinColumn(name ="personnel_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name ="personnel_formation",
            joinColumns =  @JoinColumn(name ="personnel_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "formation_id", referencedColumnName = "id"))
    private List <Formation> formations;

    @OneToMany ( mappedBy = "personnel" )
    private List<Ordonnance> ordonnances;

    @ManyToOne
    private Pavillon pavillon;
    @ManyToOne
    private Pharmacie pharmacie;
    @ManyToOne
    private Magasin magasin;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public Personnel() {
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Personnel(Long id, String name, String lastName, String address, String email) {
        this.id = id;
        Name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
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

    @Override
    public String toString() {
        return "Personnel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
