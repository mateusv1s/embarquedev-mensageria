package embarque_dev.mensageria.consumer;

import embarque_dev.mensageria.config.RabbitMQConfig;
import embarque_dev.mensageria.service.PagamentoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoConsumer {

    private final PagamentoService pagamentoService;

    public PagamentoConsumer (PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @RabbitListener(queues = RabbitMQConfig.PAGAMENTO_QUEUE)
    public void consumir (String mensagem) {

        System.out.println("Mensagem recebida: " + mensagem);
    }


}
