package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "T_FORMATION")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Modules;
    @Column
    private Date dateDebut;
    @Column
    private Date dateFin;

    @ManyToMany( mappedBy = "formations")
    private List <Personnel> personnels;

    public Formation() {
    }

    public Formation(Long id, String modules, Date dateDebut, Date dateFin, List<Personnel> personnels) {
        this.id = id;
        Modules = modules;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.personnels = personnels;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModules() {
        return Modules;
    }

    public void setModules(String modules) {
        Modules = modules;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(List<Personnel> personnels) {
        this.personnels = personnels;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", Modules='" + Modules + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", personnels=" + personnels +
                '}';
    }
}
