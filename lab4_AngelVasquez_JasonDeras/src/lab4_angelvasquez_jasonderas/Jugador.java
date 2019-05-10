package lab4_angelvasquez_jasonderas;

public abstract class Jugador {

    private String nombre;
    private String apodo;
    private int numero_camisa;
    private String equipo_futbol;
    private String equipo_balomcesto;
    private String jugador_favorito;
    private boolean mayor_edad;
    private String nacimento;
    private int estrellas;

    public Jugador(String nombre, String apodo, int numero_camisa, String equipo_futbol, String equipo_balomcesto, String jugador_favorito, boolean mayor_edad, String nacimento, int estrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numero_camisa = numero_camisa;
        this.equipo_futbol = equipo_futbol;
        this.equipo_balomcesto = equipo_balomcesto;
        this.jugador_favorito = jugador_favorito;
        this.mayor_edad = mayor_edad;
        this.nacimento = nacimento;
        this.setEstrellas(estrellas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public String getEquipo_futbol() {
        return equipo_futbol;
    }

    public void setEquipo_futbol(String equipo_futbol) {
        this.equipo_futbol = equipo_futbol;
    }

    public String getEquipo_balomcesto() {
        return equipo_balomcesto;
    }

    public void setEquipo_balomcesto(String equipo_balomcesto) {
        this.equipo_balomcesto = equipo_balomcesto;
    }

    public String getJugador_favorito() {
        return jugador_favorito;
    }

    public void setJugador_favorito(String jugador_favorito) {
        this.jugador_favorito = jugador_favorito;
    }

    public boolean isMayor_edad() {
        return mayor_edad;
    }

    public void setMayor_edad(boolean mayor_edad) {
        this.mayor_edad = mayor_edad;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        if (estrellas >= 1 && estrellas <= 5) {
            this.estrellas = estrellas;
        } else {
            System.out.println("No puede tener un numero de estrellas mayor a 5 o menor que uno\n");
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apodo=" + apodo + ", numero_camisa=" + numero_camisa + ", mayor_edad=" + mayor_edad + ", nacimento=" + nacimento + ", estrellas=" + estrellas + '}';
    }

    public abstract double ataque();
}
