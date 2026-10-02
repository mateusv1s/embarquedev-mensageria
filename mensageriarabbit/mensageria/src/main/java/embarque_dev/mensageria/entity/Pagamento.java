package embarque_dev.mensageria.entity;

import embarque_dev.mensageria.enums.StatusPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;

    private String idempotencyKey;

    private BigDecimal valor;

    private StatusPagamento status;

    private LocalDateTime criadoEm;

    private LocalDateTime pagoEm;

}
