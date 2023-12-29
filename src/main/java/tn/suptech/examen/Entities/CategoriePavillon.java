package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_CATEGORIEPAVILLON")
public class CategoriePavillon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nameCat;
    @Column
    private String descriptionCat;

    @OneToMany ( mappedBy = "categoriePavillon")
    private List<Pavillon> pavillons;


    public CategoriePavillon() {
    }

    public List<Pavillon> getPavillons() {
        return pavillons;
    }

    public void setPavillons(List<Pavillon> pavillons) {
        this.pavillons = pavillons;
    }

    public CategoriePavillon(Long id, String nameCat, String descriptionCat) {
        this.id = id;
        this.nameCat = nameCat;
        this.descriptionCat = descriptionCat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String getDescriptionCat() {
        return descriptionCat;
    }

    public void setDescriptionCat(String descriptionCat) {
        this.descriptionCat = descriptionCat;
    }

    @Override
    public String toString() {
        return "CategoriePavillon{" +
                "id=" + id +
                ", nameCat='" + nameCat + '\'' +
                ", descriptionCat='" + descriptionCat + '\'' +
                '}';
    }
}
