package edu.fje.projectem07uf2spring;

import edu.fje.projectem07uf2spring.model.Dada;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * Interficie de persistència amb Spring Data i MongoDB.
 * @author sergi.grau@fje.edu
 * @version  1.0 4.4.2019
 */

public interface DadaRepositori extends MongoRepository<Dada, String> {

    Dada findByValor(int valor);
    List<Dada> findByLat(Float lat);
    List<Dada> findAll();


}