package labrini.ouiam.gestiondeshopitauxbackendv1.ENTITIES;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class DossierMedical {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDossierMedical;
    private String description;
    private boolean s = false;
    private int codeUser;
    private LocalDateTime dateLastAction = LocalDateTime.now();

    @ManyToOne
    private Utilisateur patient;

    @OneToMany(mappedBy = "dossierMedical")
    private List<GererDossierMedical> gestionnaires;

    @OneToMany(mappedBy = "dossierMedical")
    private List<Fichier> fichiers;

    @OneToMany(mappedBy = "dossierMedical")
    private List<Diagnostic> diagnostics;

    @OneToMany(mappedBy = "dossierMedical")
    private List<PrescriptionMedical> prescriptions;

    @OneToMany(mappedBy = "dossierMedical")
    private List<InterventionMedical> interventions;

    @OneToMany(mappedBy = "dossierMedical")
    private List<ResultatExamen> resultats;
}