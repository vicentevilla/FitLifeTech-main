package com.example.fitLifeTech.Controller;
import com.example.fitLifeTech.model.Rutina;
import com.example.fitLifeTech.Service.RutinaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rutinas")

public class RutinaController {

    @Autowired
    private RutinaService rutinaService;
    // Endpoints para manejar las solicitudes HTTP
    @GetMapping
    // Método para obtener todas las rutinas
    public List<Rutina> getRutinas(){
        return rutinaService.obtenerRutinas();
    }
    // Método para obtener una rutina por su ID
    @GetMapping("/{id}")
    public Rutina buscarPorId(@PathVariable int id){
        return rutinaService.buscarPorId(id);
    }
    // Método para agregar una nueva rutina
    @PostMapping
    public Rutina agregarRutina(@RequestBody Rutina rutina){
        return rutinaService.agregarRutina(rutina);
    }
    // Método para actualizar una rutina existente
    @PutMapping("/{id}")
    public Rutina actualizarRutina(@PathVariable int id, @RequestBody Rutina rutinaActualizada){
        return rutinaService.actualizarRutina(id, rutinaActualizada);
    }
    // Método para eliminar una rutina por su ID
    @DeleteMapping("/{id}")
    public boolean eliminarRutina(@PathVariable int id){
        return rutinaService.eliminarRutina(id);
    }
    // Método para buscar por nombre de usuario
    @GetMapping("/usuario/{usuario}")
    public List<Rutina> getRutinasPorUsuario(@PathVariable String usuario){
        return rutinaService.getPorUsuario(usuario);
    }
    // Método para buscar por tipo de entrenamiento
    @GetMapping("/tipo/{tipo}")
    public List<Rutina> getRutinasPorTipo(@PathVariable String tipo){
        return rutinaService.getPorTipo(tipo);
    }
    // Método para buscar por estado de rutina
    @GetMapping("/estado/{estado}")
    public List<Rutina> getRutinasPorEstado(@PathVariable String estado){
        return rutinaService.getPorEstado(estado);
    }
    // Método para buscar rutina más larga
    @GetMapping("/mas-larga")
    public Rutina getRutinaMasLarga(){
        return rutinaService.getRutinaMasLarga();
    }
    // Método para buscar rutina más corta
    @GetMapping("/mas-corta")
    public Rutina getRutinaMasCorta(){
        return rutinaService.getRutinaMasCorta();
    }
    // Método para buscar rutinas activas
    @GetMapping("/activas")
    public List<Rutina> getRutinasActivas(){
        return rutinaService.getRutinasActivas();
    }

}
