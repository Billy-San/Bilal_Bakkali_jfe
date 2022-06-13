package com.ehb.examenjava.controller;

import com.ehb.examenjava.DAO.AutoDAO;
import com.ehb.examenjava.DAO.HuurderDAO;
import com.ehb.examenjava.DAO.VerhuurDAO;
import com.ehb.examenjava.model.Auto;
import com.ehb.examenjava.model.Huurder;
import com.ehb.examenjava.model.Verhuur;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class mainController {

    AutoDAO autodao;
    HuurderDAO huurderdao;
    VerhuurDAO verhuurdao;

    public mainController(AutoDAO autodao, HuurderDAO huurderdao, VerhuurDAO verhuurdao) {
        this.autodao = autodao;
        this.huurderdao = huurderdao;
        this.verhuurdao = verhuurdao;
    }

    //Opvragen van alle auto's
    @RequestMapping(value = "/Auto", method = RequestMethod.GET)
    public Iterable<Auto>findAll(){
        return AutoDAO.findAll();
    }

    //Aanmaken van pagina
    @RequestMapping(value = "/huurder/new", method = RequestMethod.POST)

    //Aanmaken nieuwe huurder
    public HttpStatus newhuurder(@RequestParam("Naam")String naam,
                                 @RequestParam("Voornaam") String voornaam,
                           @RequestParam("telefoonnr") String telefoonnr,
                           @RequestParam ("Email")String email){
        Huurder huurder = new Huurder();
        huurder.setVoornaam(voornaam);
        huurder.setEmail(email);
        huurder.setTelefoonnr(telefoonnr);

        return HttpStatus.OK;
    }

    //Opvragen van alle verhuren
    @RequestMapping(value = "/verhuur", method = RequestMethod.GET)
    public Iterable<Verhuur>findAll(){
        return VerhuurDAO.findAll();
    }



    public Iterable<Auto> giveAllProducts(@PathVariable("id")int id){
        if(AutoDAO.existsById(id)){
            Auto auto = AutoDAO.findById(id).get();
            return Auto.getAutoList();
        }
        return new ArrayList<Auto>();
    }
}
