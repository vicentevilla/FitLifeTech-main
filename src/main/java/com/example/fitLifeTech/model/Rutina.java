package com.example.fitLifeTech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// Representa una rutina de entrenamiento
public class Rutina {
    private int id; // identificador único
    private String nombreUsuario; // nombre del usuario
    private String nivel; // principiante, intermedio, avanzado
    private String tipo; // fuerza, cardio, mixto
    private int duracion; // duración en minutos
    private String intensidad; // baja, media, alta
    private String fecha; // fecha de la rutina
    private String estado; // activa, completada, pausada
}