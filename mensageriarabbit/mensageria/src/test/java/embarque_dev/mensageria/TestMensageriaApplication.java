package embarque_dev.mensageria;

import org.springframework.boot.SpringApplication;

public class TestMensageriaApplication {

	public static void main(String[] args) {
		SpringApplication.from(MensageriaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
