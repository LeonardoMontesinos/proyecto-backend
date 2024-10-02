package dbp.proyecto;

import org.springframework.boot.SpringApplication;

public class TestProyectoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProyectoBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
