package embarque_dev.mensageria.service;

import embarque_dev.mensageria.dto.request.PagamentoRequest;
import embarque_dev.mensageria.dto.response.PagamentoResponse;
import embarque_dev.mensageria.entity.Pagamento;
import embarque_dev.mensageria.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService (PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }





}
