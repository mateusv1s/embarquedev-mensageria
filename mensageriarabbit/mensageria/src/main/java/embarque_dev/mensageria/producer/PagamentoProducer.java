package embarque_dev.mensageria.producer;

import embarque_dev.mensageria.dto.response.PagamentoResponse;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PagamentoProducer {

    private final RabbitTemplate rabbitTemplate;

    public PagamentoProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @
    public void publicar (PagamentoResponse response) {
        rabbitTemplate.convertAndSend("pagamento", response);
    }

}
