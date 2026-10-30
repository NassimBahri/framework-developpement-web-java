package tn.notifapp.repository;

import org.springframework.stereotype.Repository;
import tn.notifapp.model.Etudiant;

import java.util.List;

@Repository
public class EtudiantRepository {

    private final List<Etudiant> etudiants;

    public EtudiantRepository(List<Etudiant> etudiants){
        this.etudiants = etudiants;
    }

}
