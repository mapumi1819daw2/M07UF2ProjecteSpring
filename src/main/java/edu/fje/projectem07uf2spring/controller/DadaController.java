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
 * @author sergi.grau@fje.edu
 * @version 1.0 21.3.19
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
        //List<Dada> dades = repositori.findAllBy();
        //System.out.print(dades.toString());


       // List<List<Map<Object, Object>>> canvasjsDataList = dades;
       // model.addAttribute("dataPointsList", dades);
       //eturn "chart";


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

        /*if(!model.containsAttribute("dades")) {
            model.addAttribute("dades", dades);
        }
        dades.add(d);*/




        return "Els paràmetres són" + allParams.entrySet();
    }



    @RequestMapping(value="/desarDada", method = RequestMethod.POST)
    String desarClient(@SessionAttribute("dades") List<Dada> dades,
                       @RequestParam (defaultValue = "") int id,
                       @RequestParam (defaultValue = "") int valor,
                       @RequestParam (defaultValue = "") Double lat,
                       @RequestParam (defaultValue = "") Double longitud,
                       ModelMap model){
        Dada d = new Dada(id, valor, lat, longitud);
        System.out.print(d.toString());
        repositori.save(d);

        if(!model.containsAttribute("dades")) {
            model.addAttribute("dades", dades);
        }
        dades.add(d);


        return("llistaDades");
    }



    /*@RequestMapping(value="/esborrarClient", method = RequestMethod.GET)
    String esborrarClient(@SessionAttribute("clients") List<Dada> clients,
                       @RequestParam (defaultValue = "") String id){

        System.out.println(id);

        repositori.deleteById(id);
        Dada t = new Dada();
        t.setId(id);
        clients.remove(t);

        return("llistaClients");
    }*/

}
