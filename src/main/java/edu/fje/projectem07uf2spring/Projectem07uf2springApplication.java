package edu.fje.projectem07uf2spring;

import edu.fje.projectem07uf2spring.model.Dada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class Projectem07uf2springApplication implements CommandLineRunner {

    @Autowired
   private DadaRepositori repositori;

    public static void main(String[] args) {
        SpringApplication.run(Projectem07uf2springApplication.class, args);
    }

    @RequestMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @Override
    public void run(String... args) throws Exception {

        repositori.deleteAll();

        repositori.save(new Dada(1, 21, 2.22234234, 3.343453));
        repositori.save(new Dada(2, 45, 3.34543543, 1.453453));

        for (Dada d : repositori.findAll()) {
            System.out.println(d);
        }

    }

}
