package com.example.fitLifeTech.repository;

import com.example.fitLifeTech.model.Rutina;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository // Le dice a Spring que esta clase maneja datos
public class RutinaRepository {

    // Lista que simula una base de datos
    private List<Rutina> listaRutinas = new ArrayList<>();

    // Constructor: se ejecuta al iniciar la app
    public RutinaRepository(){

        // Datos de prueba (como tu biblioteca)
        listaRutinas.add(new Rutina(1,"Vicho","Intermedio","Fuerza",60,"Alta","2026-04-01","Activa"));
        listaRutinas.add(new Rutina(2,"Juan","Principiante","Cardio",30,"Media","2026-04-02","Completada"));
        listaRutinas.add(new Rutina(3,"Ana","Avanzado","Mixto",90,"Alta","2026-04-03","Activa"));
    }

    public List<Rutina> obtenerRutinas(){
        return listaRutinas;
    }

    public Rutina buscarPorId(int id){
        for (Rutina r : listaRutinas){
            if (r.getId() == id){
                return r;
            }
        }
    return null; // si no encuentra
    }

    public Rutina agregarRutina(Rutina rutina){
        listaRutinas.add(rutina);
        return rutina;
    }

    public Rutina actualizarRutina(int id, Rutina rutinaActualizada){
    for (Rutina r : listaRutinas){
        if (r.getId() == id){
            r.setNombreUsuario(rutinaActualizada.getNombreUsuario());
            r.setNivel(rutinaActualizada.getNivel());
            r.setTipo(rutinaActualizada.getTipo());
            r.setDuracion(rutinaActualizada.getDuracion());
            r.setIntensidad(rutinaActualizada.getIntensidad());
            r.setFecha(rutinaActualizada.getFecha());
            r.setEstado(rutinaActualizada.getEstado());
            return r;
            }
        }
        return null;
    }

    public boolean eliminarRutina(int id){
    return listaRutinas.removeIf(r -> r.getId() == id);
    }

    public List<Rutina> buscarPorUsuario(String usuario){
        List<Rutina> resultado = new ArrayList<>();
        for (Rutina r : listaRutinas){
            if (r.getNombreUsuario().equalsIgnoreCase(usuario)){
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<Rutina> buscarPorTipo(String tipo){
        List<Rutina> resultado = new ArrayList<>();
        for (Rutina r : listaRutinas){
            if (r.getTipo().equalsIgnoreCase(tipo)){
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<Rutina> buscarPorEstado(String estado){
        List<Rutina> resultado = new ArrayList<>();
        for (Rutina r : listaRutinas){
            if (r.getEstado().equalsIgnoreCase(estado)){
                resultado.add(r);
            }
        }
        return resultado;
    }

    public Rutina rutinaMasLarga(){
        return listaRutinas.stream().max(Comparator.comparing(Rutina::getDuracion)).orElse(null);
    }

    public Rutina rutinaMasCorta(){
        return listaRutinas.stream().min(Comparator.comparing(Rutina::getDuracion)).orElse(null);
    }

    public List<Rutina> rutinasActivas(){
        return listaRutinas.stream().filter(r -> r.getEstado().equalsIgnoreCase("Activa")).toList();
    }  
}