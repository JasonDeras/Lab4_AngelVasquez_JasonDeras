package lab4_angelvasquez_jasonderas;

import java.util.*;

public class Equipos {

    private String nombre;
    private String estadio;
    private String pais;
    private String entrenador;
    private String duenio;
    private String mascota;
    private String fecha_creacion;
    private String color;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipos(String nombre, String estadio, String pais, String entrenador, String duenio, String mascota, String fecha_creacion, String color) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.entrenador = entrenador;
        this.duenio = duenio;
        this.mascota = mascota;
        this.fecha_creacion = fecha_creacion;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        int pateador = 0;
        int tirador = 0;
        if (jugadores.size() < 5) {
            for (Jugador jugador : jugadores) {
                if (jugador instanceof Pateador) {
                    pateador++;
                    if (pateador >= 3) {
                        this.jugadores = jugadores;
                    }
                } else if (jugador instanceof Tirador) {
                    tirador++;
                    if (tirador <= 2) {
                        this.jugadores = jugadores;
                    }
                }
            }

        } else {
            System.out.println("Ya hay 5 jugadores\n");
        }
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", pais=" + pais + ", entrenador=" + entrenador + ", duenio=" + duenio + ", mascota=" + mascota + ", color=" + color + ", jugadores=" + jugadores + '}';
    }

}
