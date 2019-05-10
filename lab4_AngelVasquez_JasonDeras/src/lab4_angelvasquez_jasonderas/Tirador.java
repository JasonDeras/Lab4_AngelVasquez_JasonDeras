package lab4_angelvasquez_jasonderas;

public class Tirador extends Jugador {

    private int tiro3;
    private int tiro2;
    private int balon;
    private double anotacion2 = 0;
    private double anotacion3 = 0;

    public Tirador(int tiro3, int tiro2, int balon, double anotacion2, double anotacion3, String nombre, String apodo, int numero_camisa, String equipo_futbol, String equipo_balomcesto, Jugador jugador_favorito, boolean mayor_edad, String nacimento, int estrellas) {
        super(nombre, apodo, numero_camisa, equipo_futbol, equipo_balomcesto, jugador_favorito, mayor_edad, nacimento, estrellas);
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.balon = balon;
        this.anotacion2 = anotacion2;
        this.anotacion3 = anotacion3;
    }

    public int getTiro3() {
        return tiro3;
    }

    public void setTiro3(int tiro3) {
        this.tiro3 = tiro3;
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        this.tiro2 = tiro2;
    }

    public int getBalon() {
        return balon;
    }

    public void setBalon(int balon) {
        this.balon = balon;
    }

    public void setAnotacion2(double anotacion2) {
        this.anotacion2 = anotacion2;
    }

    public void setAnotacion3(double anotacion3) {
        this.anotacion3 = anotacion3;
    }

    @Override
    public double ataque() {
        if (anotacion2 > 0) {
            return anotacion2;
        } else {
            return anotacion3;
        }
    }
}
