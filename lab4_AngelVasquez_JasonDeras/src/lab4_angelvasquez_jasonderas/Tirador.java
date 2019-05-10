package lab4_angelvasquez_jasonderas;

public class Tirador extends Jugador {

    private int tiro3;
    private int tiro2;
    private int balon;
    private double anotacion2 = 0;
    private double anotacion3 = 0;

    public Tirador(int tiro3, int tiro2, int balon, String nombre, String apodo, int numero_camisa, String equipo_futbol, String equipo_balomcesto, String jugador_favorito, boolean mayor_edad, String nacimento, int estrellas) {
        super(nombre, apodo, numero_camisa, equipo_futbol, equipo_balomcesto, jugador_favorito, mayor_edad, nacimento, estrellas);
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.balon = balon;
    }

    

    public int getTiro3() {
        return tiro3;
    }

    public void setTiro3(int tiro3) {
        if (tiro3 >= 1 && tiro3 <= 100) {
            this.tiro3 = tiro3;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        if (tiro2 >= 1 && tiro2 <= 100) {
            this.tiro2 = tiro2;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
    }

    public int getBalon() {
        return balon;
    }

    public void setBalon(int balon) {
        if (balon >= 1 && balon <= 100) {
            this.balon = balon;
        } else {
            System.out.println("No puede ingresar un numero mayor a 100 o menor a 1\n");
        }
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
