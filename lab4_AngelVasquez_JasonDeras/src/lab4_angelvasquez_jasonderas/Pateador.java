package lab4_angelvasquez_jasonderas;

public class Pateador extends Jugador {

    private int pateadora;
    private int fuerza;
    private int regateadora;
    private double anotacion;

    public Pateador(int pateadora, int fuerza, int regateadora, String nombre, String apodo, int numero_camisa, String equipo_futbol, String equipo_balomcesto, Jugador jugador_favorito, boolean mayor_edad, String nacimento, int estrellas) {
        super(nombre, apodo, numero_camisa, equipo_futbol, equipo_balomcesto, jugador_favorito, mayor_edad, nacimento, estrellas);
        this.pateadora = pateadora;
        this.fuerza = fuerza;
        this.regateadora = regateadora;
    }

    public int getPateadora() {
        return pateadora;
    }

    public void setPateadora(int pateadora) {
        if (pateadora >= 1 && pateadora <= 100) {
            this.pateadora = pateadora;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 1 && fuerza <= 100) {
            this.fuerza = fuerza;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
    }

    public int getRegateadora() {
        return regateadora;
    }

    public void setRegateadora(int regateadora) {
        if (regateadora >= 1 && regateadora <= 100) {
            this.regateadora = regateadora;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
    }

    public void setAnotacion(double anotacion) {
        this.anotacion = anotacion;
    }

    @Override
    public double ataque() {

        return anotacion;
    }

}
