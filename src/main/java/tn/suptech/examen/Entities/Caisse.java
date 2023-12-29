package tn.suptech.examen.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="T_CAISSE")
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long nameCaisse;
    @Column
    private Long Tel;
    @Column
    private String email;
    @Column
    private Double recettePArjour;

    @ManyToOne
    private Hopital hopital;

    @OneToMany ( mappedBy = "caisse")
    private List<Facture> factures;


    @OneToOne
    @JoinColumn(name = "pavillon_id")
    private Pavillon pavillon;

    public Hopital getHopital() {
        return hopital;
    }

    public Long getNameCaisse() {
        return nameCaisse;
    }

    public void setNameCaisse(Long nameCaisse) {
        this.nameCaisse = nameCaisse;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public void setHopital(Hopital hopital) {
        this.hopital = hopital;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public Caisse() {
    }

    public Caisse(Long id, Long nameCaisse, Long tel, String email, Double recettePArjour) {
        this.id = id;
        this.nameCaisse = nameCaisse;
        Tel = tel;
        this.email = email;
        this.recettePArjour = recettePArjour;
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

    public Double getRecettePArjour() {
        return recettePArjour;
    }

    public void setRecettePArjour(Double recettePArjour) {
        this.recettePArjour = recettePArjour;
    }

    @Override
    public String toString() {
        return "Caisse{" +
                "id=" + id +
                ", nameCaisse=" + nameCaisse +
                ", Tel=" + Tel +
                ", email='" + email + '\'' +
                ", recettePArjour=" + recettePArjour +
                ", hopital=" + hopital +
                ", factures=" + factures +
                ", pavillon=" + pavillon +
                '}';
    }
}
