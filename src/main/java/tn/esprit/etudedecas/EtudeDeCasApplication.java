package tn.esprit.etudedecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class EtudeDeCasApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtudeDeCasApplication.class, args);
    }

}
