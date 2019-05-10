/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_angelvasquez_jasonderas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jason
 */
public class Lab4_AngelVasquez_JasonDeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner l = new Scanner(System.in);
        ArrayList<Equipos> equipos = new ArrayList();
        String nom, Estadio, p, nome, nomd, nomm, fecha, co,mon = null;
        char op = '0', op2 = ' ';
        int n,numc;
        while (op != 3) {
            System.out.println("1.Gestion de informacion\n2.Jugar\n3.Salir");
            op = l.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("1.Crear Equipo\n2.Eliminar Equipo\n3.Craer Jugador\n4.Eliminar Jugador");
                    op2 = l.next().charAt(0);
                    switch (op2) {
                        case '1':
                            System.out.println("Ingrese nombre:");
                            nom = l.next();
                            System.out.println("Ingrese Estadio");
                            Estadio = l.next();
                            System.out.println("Ingrese Pais");
                            p = l.next();
                            System.out.println("Ingrese Nombre de Entrenador");
                            nome = l.next();
                            System.out.println("Ingrese Nombre de Dueño");
                            nomd = l.next();
                            System.out.println("Ingrese Nombre de Mascota ");
                            nomm = l.next();
                            System.out.println("Ingrese Fecha de Creación");
                            fecha = l.next();
                            System.out.println("Ingrese Color principal");
                            co = l.next();
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
                            boolean m= false;
                            int anio,e,po;
                            System.out.println("Ingrese posicon del equipo");
                            po=l.nextInt();
                            
                            System.out.println("Ingrese nombre del jugador");
                            nom=l.next();
                            System.out.println("Ingrese Apodo");
                            co=l.next();
                            System.out.println("Ingrese Numero de Camiseta");
                            numc=l.nextInt();
                            System.out.println("Ingrese Equipo de Futbol Favorito");
                            nomd=l.next();
                            System.out.println("Ingrese Equipo de Baloncesto Favorito");
                            nome=l.next();
                            System.out.println("Ingrese Jugador Favorito");
                            nomm=l.next();
                            System.out.println("Ingrese s si es mayor de edad");
                            r=l.next().charAt(0);
                            if(r=='s')
                            {
                              m=true;
                            }
                            System.out.println("Ingrese año de nacimiento");
                            anio=l.nextInt();
                            System.out.println("Ingrese numero de estrellas");
                            e=l.nextInt();
                            int op3;
                             System.out.println("1.Tirador");
                             op3=l.nextInt();
                             if(op3==1)
                             {
                                 int ti,ti2,ba;
                                 System.out.println("Ingrese tiro");
                                 ti=l.nextInt();
                                 System.out.println("Ingrese tiro 2 puntos");
                                 ti2=l.nextInt();
                                 System.out.println("Ingrese manejo del balon");
                            
                                 ba=l.nextInt();
                                 equipos.get(po).getJugadores().add(new Tirador(ti2, ti2, ba, anio, anio, nome, mon, numc, Estadio, nome, jugador_favorito, m, nome, ba));
                             }
                            
                            break;
                        case '4':
                            break;
                        default:
                            System.out.println("Ingres un opcion no valida");
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

}
