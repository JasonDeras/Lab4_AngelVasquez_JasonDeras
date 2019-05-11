package lab4_angelvasquez_jasonderas;

import java.awt.Color;
import java.util.*;

public class Lab4_AngelVasquez_JasonDeras {

    static Scanner l = new Scanner(System.in);
    static ArrayList<Equipos> equipos = new ArrayList();
    static ArrayList jug1 = new ArrayList();
    static ArrayList jug2 = new ArrayList();
    static int puntos1 = 0;
    static int puntos2 = 0;
    static int turnos1 = 0;
    static int turnos2 = 0;
    static double tiro1 = 0;
    static double tiro2 = 0;
    static double pat = 0;

    public static void main(String[] args) {
        String nom = "", Estadio = "", p = "", nome = "", nomd = "", nomm = "", fecha = "", co = "", mon = "";
        char op = '0', op2 = ' ';
        int n = 0, numc = 0;
        int po = 0;
        while (op != 3) {
            System.out.println("1.Gestion de informacion\n2.Jugar\n3.Listar Equipo\n4.Listar Jugadores\n5.Salir");
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
                            char r = ' ';
                            boolean m = false;
                            int anio = 0,
                             e = 0;
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
                            try {
                                System.out.println("Ingrese posiocn del equipo");
                                po = l.nextInt();
                                validaInt("" + po);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese posicion del jugador");
                                n = l.nextInt();
                                validaInt("" + n);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            equipos.get(po).getJugadores().remove(n);
                            break;
                        case '5':
                            try {
                                System.out.println("Ingrese posicion del equipo");
                                po = l.nextInt();
                                validaInt("" + po);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            System.out.println("1. Modificar nombre:\n2.Modificar Estadio\n3.Modificar Pais\n4.Modificar Nombre de Entrenador\n5.Nombre de Dueño\n6.Nombre de Mascota\n7.Fecha de Creación\n8.Color principal");
                            op3 = l.nextInt();
                            switch (op3) {
                                case 1:
                                    try {
                                        System.out.println("Ingrese nombre");
                                        nom = l.next();
                                        validaString(nom);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setNombre(nom);
                                    break;
                                case 2:
                                    try {
                                        System.out.println("Ingrese Estadio");
                                        nom = l.next();
                                        validaString(nom);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setEstadio(nom);
                                    break;
                                case 3:
                                    try {
                                        System.out.println("Ingrese pais");
                                        p = l.next();
                                        validaString(p);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setPais(p);
                                    break;
                                case 4:
                                    try {
                                        System.out.println("Ingrese Nombre del Entrenador");
                                        nome = l.next();
                                        validaString(nome);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setEntrenador(nome);
                                    break;
                                case 5:
                                    try {
                                        System.out.println("Ingrese nombre del dueño");
                                        nomd = l.next();
                                        validaString(nomd);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setDuenio(nomd);
                                    break;
                                case 6:
                                    try {
                                        System.out.println("Ingrese Nombre de mascota ");
                                        nomd = l.next();
                                        validaString(nomd);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setMascota(nomd);
                                    break;
                                case 7:
                                    try {
                                        System.out.println("Ingrese fecha de creacion");
                                        nomd = l.next();
                                        validaString(nomd);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setFecha_creacion(nomd);
                                    break;
                                case 8:
                                    try {
                                        System.out.println("Ingrese color principal");
                                        nomd = l.next();
                                        validaString(nomd);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).setColor(nomd);
                                    break;
                                default:
                                    System.out.println("No hay opcion");
                                    break;
                            }
                            break;
                        case '6':
                            char op4 = ' ';
                            try {
                                System.out.println("Ingrese posicion del equipo");
                                po = l.nextInt();
                                validaInt("" + po);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("Ingrese posicion del jugador");
                                n = l.nextInt();
                                validaInt("" + n);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            try {
                                System.out.println("1.Nombre del jugador\n2.Apodo\n3.Numero de Camiseta\n4.Equipo de Futbol Favorito\n5.Equipo de Baloncesto Favorito\n6.Jugador Favorito\n7.Mayor de edad o no\n"
                                        + "8.Año de nacimiento\n9.Ingrese numero de estrellas\n0.Stas de jugador");
                                op4 = l.next().charAt(0);
                                validaString("" + op4);
                            } catch (Valinfo ex) {
                                System.out.println(ex.getMessage());
                            }
                            switch (op4) {
                                case '1':
                                    try {
                                        System.out.println("Ingrese nombre del jugador");
                                        nom = l.next();
                                        validaString(nom);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setNombre(nom);
                                    break;
                                case '2':
                                    try {
                                        System.out.println("Ingrese Apodo");
                                        nom = l.next();
                                        validaString(nom);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setApodo(nom);
                                    break;
                                case '3':
                                    try {
                                        System.out.println("Ingrese Numero de Camiseta");
                                        numc = l.nextInt();
                                        validaInt("" + numc);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setNumero_camisa(numc);
                                    break;
                                case '4':
                                    try {
                                        System.out.println("Ingrese Equipo de Futbol Favorito");
                                        Estadio = l.next();
                                        validaString(Estadio);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setEquipo_futbol(Estadio);
                                    break;
                                case '5':
                                    System.out.println("Ingrese Equipo de Baloncesto Favorito");
                                    nom = l.next();
                                    equipos.get(po).getJugadores().get(n).setEquipo_balomcesto(nom);
                                    break;
                                case '6':
                                    try {
                                        System.out.println("Ingrese Jugador Favorito");
                                        nomd = l.next();
                                        validaString(nomd);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setJugador_favorito(nomd);
                                    break;
                                case '7':
                                    char r1 = ' ';
                                    try {
                                        System.out.println("Ingrese s si es mayor de edad");
                                        r = l.next().charAt(0);
                                        validaString("" + r);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    if (r1 == 's' || r1 == 'S') {
                                        m = true;
                                    } else {
                                        m = false;
                                    }
                                    equipos.get(po).getJugadores().get(n).setMayor_edad(m);
                                    break;
                                case '8':
                                    int anio1 = 0;
                                    try {
                                        System.out.println("Ingrese año de nacimiento");
                                        anio1 = l.nextInt();
                                        validaInt("" + anio1);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setNacimento("" + anio1);
                                    break;
                                case '9':
                                    int e1 = 0;
                                    try {
                                        System.out.println("Ingrese Ingrese numero de estrellas");
                                        e1 = l.nextInt();
                                        validaInt("" + e1);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    equipos.get(po).getJugadores().get(n).setEstrellas(e1);
                                    break;
                                case '0':
                                    op3 = 0;
                                    try {
                                        System.out.println("1.Tirador");
                                        System.out.println("2.Pateador");
                                        op3 = l.nextInt();
                                        validaInt("" + op3);
                                    } catch (Valinfo ex) {
                                        System.out.println(ex.getMessage());
                                    }

                                    if (equipos.get(po).getJugadores().get(n) instanceof Pateador) {
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
                                        ((Pateador) equipos.get(po).getJugadores().get(n)).setFuerza(fuerza);
                                        ((Pateador) equipos.get(po).getJugadores().get(n)).setPateadora(pateadora);
                                        ((Pateador) equipos.get(po).getJugadores().get(n)).setRegateadora(regateadora);
                                    }
                                    if (equipos.get(po).getJugadores().get(n) instanceof Tirador) {
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
                                        ((Tirador) equipos.get(po).getJugadores().get(n)).setBalon(ba);
                                        ((Tirador) equipos.get(po).getJugadores().get(n)).setTiro2(ti2);
                                        ((Tirador) equipos.get(po).getJugadores().get(n)).setTiro3(ti);

                                    }
                                    break;
                                default:
                                    System.out.println("No valido");
                                    break;
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
                    ArrayList juga = new ArrayList();
                    for (int i = 0; i < equipos.size(); i++) {
                        juga.add(equipos.get(i).getJugadores());
                    }
                    System.out.println("Jugadores\n");
                    for (int i = 0; i < juga.size(); i++) {
                        System.out.println(juga.get(i));
                    }
                    break;
                case '4':
                    System.out.println("Equipos\n");
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(equipos.get(i));
                    }
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingreso una opcicion no valida");
                    break;
            }
        }

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
     public static void listar(ArrayList<Equipos> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toString());
        }
    }
    static void juego() {
          Random ran = new Random();
        int turn = 1, po, po2, pun1 = 0, pun2 = 0,prop;
        listar(equipos);
        System.out.println("");
        System.out.println("Jugador 1 Ingrese la posicion del equipo que quiere");
        po = l.nextInt();
        System.out.println("Jugador 2 Ingrese la posicion del equipo que quiere");
        po2 = l.nextInt();

        boolean win = false;
        int j,op5;
        char r;
        while (win == false) {
            if (turn % 2 != 0) {
                System.out.println("Turno jugador 1");
                System.out.println("Ingrese la posicon del jugador que va a tenar la pelota");

                j = l.nextInt();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Desea hacer un pase[Ingrese s si quiere]");
                    r = l.next().charAt(0);
                    if (r == 's') {
                        System.out.println("Ingrese la posicon del jugador que le van a hacer el pase");
                        j = l.nextInt();
                    } else {
                        i = 5;
                    }
                }
                

            } else {
                System.out.println("Turno jugador 2");
                System.out.println("Ingrese la posicon del jugador que va a tenar la pelota");
                j = l.nextInt();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Desea hacer un pase[Ingrese s si quiere]");
                    r = l.next().charAt(0);
                    if (r == 's') {
                        System.out.println("Ingrese la posicon del jugador que le van a hacer el pase");
                        j = l.nextInt();
                    } else {
                        i = 5;
                    }
                }
                
                 System.out.println("1.Tirar\n2.Patear");
                 op5=l.nextInt();
                 
                if(equipos.get(po).getJugadores().get(j) instanceof Pateador)
                {
                   if(op5==2)
                   {
                      prop=(((Pateador)equipos.get(po).getJugadores().get(j)).getPateadora()+((Pateador)equipos.get(po).getJugadores().get(j)).getFuerza()+((Pateador)equipos.get(po).getJugadores().get(j)).getPateadora())*65*(((Pateador)equipos.get(po).getJugadores().get(j)).getEstrellas()/10) ;
                     
                        int s=1+ran.nextInt(99);
                        if(s>=1 && s<=prop)
                        {
                          pun1++;
                        }
                     
                   }
                }
                if(equipos.get(po).getJugadores().get(j) instanceof Tirador)
                {
                   if(op5==1)
                   {
                       System.out.println("1.Tiro 2 puntos\n2.Tiro 3 puntos");
                   }
                }
            }

            if (pun1 == 11) {
                win = true;
                System.out.println("Gana jugador 1");
            }
            if (pun2 == 11) {
                System.out.println("Gana jugador 2");
                win = true;
            }
        }
    }
}
