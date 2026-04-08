package com.example.fitLifeTech.Service;
import com.example.fitLifeTech.model.Rutina;
import com.example.fitLifeTech.repository.RutinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Le dice a Spring: esta clase es lógica de negocio
public class RutinaService {

    // Inyección automática del repository
    @Autowired
    private RutinaRepository rutinaRepository;
    // Métodos que llaman al repository para obtener datos
    public List<Rutina> obtenerRutinas(){
        return rutinaRepository.obtenerRutinas();
    }
    // Método para buscar una rutina por su ID
    public Rutina buscarPorId(int id){
        return rutinaRepository.buscarPorId(id);
    }
    // Método para agregar una nueva rutina
    public Rutina agregarRutina(Rutina rutina){
        return rutinaRepository.agregarRutina(rutina);
    }
    // Método para actualizar una rutina existente
    public Rutina actualizarRutina(int id, Rutina rutinaActualizada){
        return rutinaRepository.actualizarRutina(id, rutinaActualizada);
    }   
    // Método para eliminar una rutina por su ID
    public boolean eliminarRutina(int id){
        return rutinaRepository.eliminarRutina(id);
    }
    // Método para buscar por nombre de usuario       
    public List<Rutina> getPorUsuario(String usuario){
        return rutinaRepository.buscarPorUsuario(usuario);
    }
    // Método para buscar por tipo entrenamiento
    public List<Rutina> getPorTipo(String tipo){
        return rutinaRepository.buscarPorTipo(tipo);
    }
    // Metodo para buscar por estado de rutina
    public List<Rutina> getPorEstado(String estado){
        return rutinaRepository.buscarPorEstado(estado);
    }
    // Método para buscar rutina mas larga
    public Rutina getRutinaMasLarga(){
        return rutinaRepository.rutinaMasLarga();
    }
    // Método para buscar rutina mas corta
    public Rutina getRutinaMasCorta(){
        return rutinaRepository.rutinaMasCorta();
    }
    // Método para buscar rutina activas
    public List<Rutina> getRutinasActivas(){
        return rutinaRepository.rutinasActivas();
    }
    
}