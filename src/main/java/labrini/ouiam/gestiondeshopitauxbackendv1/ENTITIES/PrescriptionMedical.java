package labrini.ouiam.gestiondeshopitauxbackendv1.ENTITIES;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class PrescriptionMedical {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrescriptionMedical;
    private String description;
    private boolean s = false;
    private int codeUser;
    private LocalDateTime dateLastAction = LocalDateTime.now();

    @ManyToOne
    private DossierMedical dossierMedical;

    @OneToMany(mappedBy = "prescriptionMedical")
    private List<PrescriptionMedicamentDetail> medicaments;
}
