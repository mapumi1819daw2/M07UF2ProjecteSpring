package edu.fje.projectem07uf2spring.controller;



import edu.fje.projectem07uf2spring.DadaRepositori;
import edu.fje.projectem07uf2spring.model.Dada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Controlador de clients
 * Verifica el funcionament de curl
 * @author marc Purgimon
 * @version 1.0
 */
@Controller
@SessionAttributes("dades")
public class DadaController {

    @Autowired
    private DadaRepositori repositori;

    @ModelAttribute("dades")
    public List<Dada> inicialitzar() {

        List<Dada> dades = new ArrayList();
        for (Dada c : repositori.findAll()) {
            dades.add(c);
        }
        return dades;
    }



            @RequestMapping(value={"/client", "/usuari"})
    String mostrarFormulari() {
        return("formulari");
    }


    @RequestMapping(value={"/grafic"})
    String desarClient(ModelMap model){
        List<Dada> dades = repositori.findAll();

        model.addAttribute("dades", dades);
        return("grafic");
    }


    //curl -X POST -F 'nom=abc' -F 'id=123' http://localhost:8080/api/foos
    @PostMapping("/afegirDada")
    @ResponseBody
    public String mapejarParams(@RequestParam Map<String,String> allParams) {

        Dada d = new Dada(Integer.parseInt(allParams.get("id")), Integer.parseInt(allParams.get("valor")), Double.parseDouble(allParams.get("lat")), Double.parseDouble(allParams.get("longitud")));
        System.out.print(d.toString());
        repositori.save(d);

        return "Els paràmetres són" + allParams.entrySet();
    }

}
