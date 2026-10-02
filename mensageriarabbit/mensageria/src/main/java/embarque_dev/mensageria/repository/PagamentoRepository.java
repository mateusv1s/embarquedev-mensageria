package embarque_dev.mensageria.repository;

import embarque_dev.mensageria.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {

    Optional <Pagamento> registrarPagamento (Long idPagamento);


}
