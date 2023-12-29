package tn.suptech.examen.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.Produit;
import tn.suptech.examen.Repositories.ProduitRepository;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAll() {

        return this.produitRepository.findAll();
    }


    public Produit createProduit(Produit produit) {

        return this.produitRepository.save(produit);
    }

    public Produit updateProduit(Produit produit) {

        return this.produitRepository.save(produit);
    }

    public boolean deleteProduit(Long pid) {
        try {
            this.produitRepository.deleteById(pid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Produit getProduitById(Long pid){

        return this.produitRepository.getById(pid);
    }
}
