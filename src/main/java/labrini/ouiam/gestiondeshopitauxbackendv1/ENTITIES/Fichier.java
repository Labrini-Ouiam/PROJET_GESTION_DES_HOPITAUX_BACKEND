package labrini.ouiam.gestiondeshopitauxbackendv1.ENTITIES;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Fichier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFichier;
    private LocalDate date;
    private String path;
    private boolean s = false;
    private int codeUser;
    private LocalDateTime dateLastAction = LocalDateTime.now();

    @ManyToOne
    private DossierMedical dossierMedical;

    @ManyToOne
    private CategorieFichier categorieFichier;

    @ManyToOne
    private TypeFichier typeFichier;
}