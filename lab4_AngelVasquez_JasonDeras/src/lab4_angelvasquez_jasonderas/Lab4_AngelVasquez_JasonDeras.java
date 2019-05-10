package lab4_angelvasquez_jasonderas;

import java.awt.Color;
import java.util.*;

public class Lab4_AngelVasquez_JasonDeras {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        ArrayList<Equipos> equipos = new ArrayList();
        String nom = "", Estadio = "", p = "", nome = "", nomd = "", nomm = "", fecha = "", co = "", mon = "";
        char op = '0', op2 = ' ';
        int n = 0, numc = 0;
        while (op != 3) {
            System.out.println("1.Gestion de informacion\n2.Jugar\n3.Salir");
            op = l.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("1.Crear Equipo\n2.Eliminar Equipo\n3.Craer Jugador\n4.Eliminar Jugador");

                    op2 = l.next().charAt(0);
                    switch (op2) {
                        case '1':
                            try {
                                System.out.println("Ingrese nombre:");
                                nom = l.next();
                                System.out.println(nom);
                                validaString(nom);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Estadio");
                                Estadio = l.next();
                                validaString(Estadio);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Pais");
                                p = l.next();
                                validaString(p);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Nombre de Entrenador");
                                nome = l.next();
                                validaString(nome);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Nombre de Dueño");
                                nomd = l.next();
                                validaString(nomd);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Nombre de Mascota ");
                                nomm = l.next();
                                validaString(nomm);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Fecha de Creación");
                                fecha = l.next();
                                validaString(fecha);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }

                            try {
                                System.out.println("Ingrese Color principal");
                                co = l.next();
                                validaString(co);
                            } catch (Valinfo e) {
                                System.out.println(e.getMessage());
                            }
                            equipos.add(new Equipos(nome, Estadio, p, Estadio, co, co, fecha, co));
                            break;
                        case '2':
                            boolean v = false;
                            if (equipos.size() > 0) {
                                while (v = false) {
                                    try {
                                        System.out.println("Ingrese posicion del Equipo que desea eliminar");
                                        n = l.nextInt();
                                        v = true;
                                        equipos.remove(n);
                                    } catch (Exception e) {
                                        System.out.println("Ingreso una posicion no existente");
                                    }
                                }

                            } else {
                                System.out.println("No hay equipos");
                            }

                            break;
                        case '3':
                            char r;
                            boolean m = false;
                            int anio = 0,
                             e = 0,
                             po = 0;
                            try {
                                System.out.println("Ingrese posicon del equipo");
                                po = l.nextInt();
                                validaInt("" + po);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese nombre del jugador");
                                nom = l.next();
                                validaString(nom);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Apodo");
                                co = l.next();
                                validaString(co);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Numero de Camiseta");
                                numc = l.nextInt();
                                validaInt("" + numc);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Equipo de Futbol Favorito");
                                nomd = l.next();
                                validaString(nomd);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Equipo de Baloncesto Favorito");
                                nome = l.next();
                                validaString(nome);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese Jugador Favorito");
                                nomm = l.next();
                                validaString(nomm);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese s si es mayor de edad");
                                r = l.next().charAt(0);
                                if (r == 's') {
                                    m = true;
                                }
                                validaString("" + r);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese año de nacimiento");
                                anio = l.nextInt();
                                validaInt("" + anio);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese numero de estrellas");
                                e = l.nextInt();
                                validaInt("" + e);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            int op3 = 0;
                            try {
                                System.out.println("1.Tirador");
                                System.out.println("2.Pateador");
                                op3 = l.nextInt();
                                validaInt("" + op3);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            if (op3 == 1) {
                                int ti = 0, ti2 = 0, ba = 0;
                                try {
                                    System.out.println("Ingrese tiro");
                                    ti = l.nextInt();
                                    validaInt("" + ti);
                                } catch (Valinfo ex) {
                                    System.out.println(ex.getMessage());
                                }
                                try {
                                    System.out.println("Ingrese tiro 2 puntos");
                                    ti2 = l.nextInt();
                                    validaInt("" + ti2);
                                } catch (Valinfo ex) {
                                    ex.getMessage();
                                }
                                try {
                                    System.out.println("Ingrese manejo del balon");
                                    ba = l.nextInt();
                                    validaInt("" + ba);
                                } catch (Valinfo ex) {
                                    System.out.println(ex.getMessage());
                                }
                                equipos.get(po).getJugadores().add(new Tirador(ti2, ti2, ba, nome, co, numc, nomd, nome, nomm, m, nome, e));
                            }
                            if (op3 == 2) {
                                int pateadora = 0;
                                int fuerza = 0;
                                int regateadora = 0;
                                try {
                                    System.out.println("Ingrese Habilidad pateadora:");
                                    pateadora = l.nextInt();
                                    validaInt("" + pateadora);
                                } catch (Valinfo ex) {
                                    System.out.println(ex.getMessage());
                                }
                                try {
                                    System.out.println("Ingrese fuerza:");
                                    fuerza = l.nextInt();
                                    validaInt("" + fuerza);
                                } catch (Valinfo ex) {
                                    System.out.println(ex.getMessage());
                                }
                                try {
                                    System.out.println("Ingrese Habilidad regateadora");
                                    regateadora = l.nextInt();
                                    validaInt("" + regateadora);
                                } catch (Valinfo ex) {
                                    System.out.println(ex.getMessage());
                                }
                                equipos.get(po).getJugadores().add(new Pateador(pateadora, fuerza, regateadora, nome, co, numc, nomd, nome, nomm, m, nome, e));
                            }
                            break;
                        case '4':

                            System.out.println("Ingrese posiocn del equipo");
                            po = l.nextInt();
                            System.out.println("Ingrese posicion del jugador");
                            n = l.nextInt();
                            equipos.get(po).getJugadores().remove(n);
                            break;
                        case '5':
                            System.out.println("Ingrese posicion del equipo");
                            po = l.nextInt();

                            System.out.println("1. Modificar nombre:\n2.Modificar Estadio\n3.Modificar Pais\n4.Modificar Nombre de Entrenador\n5.Nombre de Dueño\n6.Nombre de Mascota\n7.Fecha de Creación\n8.Color principal");
                            op3 = l.nextInt();
                            switch (op3) {
                                case 1:
                                    System.out.println("Ingrese nombre");
                                    nom = l.next();
                                    equipos.get(po).setNombre(nom);
                                    break;
                                case 2:
                                    System.out.println("Ingrese Estadio");
                                    nom = l.next();
                                    equipos.get(po).setEstadio(nom);
                                    break;
                                case 3:
                                    System.out.println("Ingrese pais");
                                    p = l.next();
                                    equipos.get(po).setPais(p);
                                    break;
                                case 4:
                                    System.out.println("Ingrese Nombre del Entrenador");
                                    nome = l.next();
                                    equipos.get(po).setEntrenador(nome);
                                    break;
                                case 5:
                                    System.out.println("Ingrese nombre del dueño");
                                    nomd = l.next();
                                    equipos.get(po).setDuenio(nomd);
                                    break;
                                case 6:
                                    System.out.println("Ingrese Nombre de mascota ");
                                    nomd = l.next();
                                    equipos.get(po).setMascota(nomd);

                                    break;
                                case 7:
                                    System.out.println("Ingrese fecha de creacion");
                                    nomd = l.next();
                                    equipos.get(po).setFecha_creacion(nomd);
                                    break;
                                case 8:
                                    System.out.println("Ingrese color principal");
                                    nomd = l.next();
                                    equipos.get(po).setColor(nomd);
                                    break;
                                default:
                                    System.out.println("No hay opcion");
                                    break;
                            }
                            break;
                        case '6':
                            char op4;
                            System.out.println("Ingrese posicion del equipo");
                            po = l.nextInt();
                            System.out.println("Ingrese posicion del jugador");
                            n = l.nextInt();
                            // 
                            System.out.println("1.Nombre del jugador\n2.Apodo\n3.Numero de Camiseta\n4.Equipo de Futbol Favorito\n5.Equipo de Baloncesto Favorito\n6.Jugador Favorito\n7.Mayor de edad o no\n"
                                    + "8.Año de nacimiento\n9.Ingrese numero de estrellas\n0.Stas de jugador");
                            op4 = l.next().charAt(0);
                            switch (op4) {
                                case '1':
                                    System.out.println("Ingrese nombre del jugador");
                                    nom = l.next();
                                    equipos.get(po).getJugadores().get(n).setNombre(nom);
                                    break;
                                case '2':
                                    System.out.println("Ingrese Apodo");
                                    nom = l.next();
                                    equipos.get(po).getJugadores().get(n).setApodo(nom);
                                    break;
                                case '3':
                                    System.out.println("Ingrese Numero de Camiseta");
                                    break;
                                case '4':
                                    System.out.println("Ingrese Equipo de Futbol Favorito");
                                    break;
                                case '5':
                                    System.out.println("Ingrese Equipo de Baloncesto Favorito");
                                    break;
                                case '6':
                                    System.out.println("Ingrese Jugador Favorito");
                                    break;
                                case '7':
                                    System.out.println("Ingrese s si es mayor de edad");
                                    r = l.next().charAt(0);
                                    if (r == 's') {
                                        m = true;
                                    }
                                    break;
                                case '8':
                                    System.out.println("Ingrese ");
                                    break;
                                case '9':
                                    System.out.println("Ingrese ");
                                    break;
                                case '0':
                                    System.out.println("");
                                    break;

                                default:
                                    throw new AssertionError();
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida\n");
                            break;
                    }
                    break;
                case '2':
                    break;
                case '3':
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ingreso una opcicion no valida");
                    break;
            }
        }

    }

    public static void listar() {

    }

    public static void listarj() {

    }

    static void validaString(String hola) throws Valinfo {
        for (int i = 0; i < hola.length(); i++) {
            char x = hola.charAt(i);
            if (Character.isDigit(x)) {
                throw new Valinfo(Color.red, "No se aceptan numeros en campos de letras");
            }
        }
    }

    static void validaInt(String n) throws Valinfo {
        for (int i = 0; i < n.length(); i++) {
            char x = n.charAt(i);
            if (Character.isDigit(x)) {
            } else {
                throw new Valinfo(Color.red, "No se aceptan letras en los espacios de solo numeros");
            }
        }
    }
}
