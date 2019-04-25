package edu.fje.projectem07uf2spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe Controladora de peticions REST.
 * Retorna un missatge de prova del funcionament de Spring
 * @author sergi.grau@fje.edu
 * @version 1.0 21.3.19
 */
@RestController
@RequestMapping("/salutacio")
public class SalutacioController {
    @GetMapping
    public String salutarGET() {
        return "Spring 5 i Tomcat 9 encastat per GET";
    }
    @PostMapping
    public String salutarPOST() {
        return "Spring 5 i Tomcat 9 encastat per POST";
    }
}