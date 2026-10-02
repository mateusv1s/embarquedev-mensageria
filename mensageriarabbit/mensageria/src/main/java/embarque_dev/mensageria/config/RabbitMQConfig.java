package embarque_dev.mensageria.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private final static String PAGAMENTO_QUEUE = "pagamento";
    private final static String PAGAMENTO_QUEUE_DLQ = "pagamento.DLQ";

    @Bean
    public Queue pagamentoQueue () {
        return QueueBuilder.durable
                (PAGAMENTO_QUEUE)
                .build();
    }




}
