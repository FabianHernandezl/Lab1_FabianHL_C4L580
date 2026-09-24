package com.cr.ac.ucr.laboratorio1.laboratorio1.controller.rest;

import com.cr.ac.ucr.laboratorio1.laboratorio1.business.AirplaneBusiness;
import com.cr.ac.ucr.laboratorio1.laboratorio1.business.AirplaneTypeBusiness;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.Airplane;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AirplaneController {

    @Autowired
    private AirplaneTypeBusiness airplaneTypeBusiness;

    @Autowired
    private AirplaneBusiness airplaneBusiness;

    @GetMapping("/")
    public String iniciar(Model model) {
        model.addAttribute("tipos", airplaneTypeBusiness.findAll());
        return "ver_tipos_avion";
    }

    @GetMapping("/buscar")
    public String buscarPorTipo(Model model, @RequestParam("idTipo") int idTipo) {
        List<Airplane> aviones = airplaneBusiness.getByTypeId(idTipo);
        AirplaneType tipo = airplaneTypeBusiness.getById(idTipo);
        model.addAttribute("aviones", aviones);
        model.addAttribute("tipoSeleccionado", tipo);
        return "mostrar_aviones";
    }
}