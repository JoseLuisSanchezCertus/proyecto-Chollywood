//CAMBIOS RECIENTES
package com.chollywood.chollywood.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chollywood.chollywood.repository.ZonaRepository;

@Controller
public class ZonaViewController {
	
    @Autowired
    private ZonaRepository repo;

    @GetMapping("/vista/zonas")
    public String mostrarZonas(Model model) {
        model.addAttribute("zonas", repo.findAll());
        return "zonas"; // nombre del archivo HTML (peliculas.html)
    }
}
////CAMBIOS RECIENTES
