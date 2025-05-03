package com.chollywood.chollywood.Controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chollywood.chollywood.model.Pelicula;
import com.chollywood.chollywood.repository.PeliculaRepository;

@Controller
public class PeliculaViewController {

    @Autowired
    private PeliculaRepository repo;

    @GetMapping("/vista/peliculas")
    public String mostrarPeliculas(Model model) {
        List<Pelicula> lista = getPelicula();
        model.addAttribute("peliculas", lista);
        model.addAttribute("peliculas", repo.findAll());
        return "peliculas"; // nombre del archivo HTML (peliculas.html)
    }
	private List<Pelicula> getPelicula(){
		List<Pelicula> lista = new LinkedList<Pelicula>();
		try {
			Pelicula poster1 = new Pelicula();
			poster1.setImagen("img1.jpg");
			
			Pelicula poster2 = new Pelicula();
			poster2.setImagen("img2.jpeg");
			
			Pelicula poster3 = new Pelicula();
			poster3.setImagen("img3.jpg");
			
			
			lista.add(poster1);
			lista.add(poster2);
			lista.add(poster3);
			
		} catch (Error e) {
			System.out.println("Error; " + e.getMessage());
		}
		return lista;
	}
}