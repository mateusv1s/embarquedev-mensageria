package embarque_dev.mensageria.dto.response;

import embarque_dev.mensageria.entity.Pagamento;
import embarque_dev.mensageria.enums.StatusPagamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoResponse (

        Long idPagamento,
        BigDecimal valor,
        StatusPagamento status,
        LocalDateTime criadoEm,
        LocalDateTime pagoEm


)

{

    public static PagamentoResponse fromEntity (Pagamento pagamento) {
        return new PagamentoResponse (
                pagamento.getIdPagamento(),
                pagamento.getValor(),
                pagamento.getStatus(),
                pagamento.getCriadoEm(),
                pagamento.getPagoEm()
        );
    }

}
