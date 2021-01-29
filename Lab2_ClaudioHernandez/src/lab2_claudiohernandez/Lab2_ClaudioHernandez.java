/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_claudiohernandez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudio Hernandez
 */
public class Lab2_ClaudioHernandez {

    /**
     * @param args the command line arguments
     */
    static ArrayList restau = new ArrayList();
    static Scanner v = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================LOGIN========================");
        System.out.println("ingresa tu usuario pista : david");
        String nombreDavid = v.next();
        System.out.println("Ingresa tu contraseña:");
        int contrDavid = v.nextInt();
        while (!nombreDavid.equals("david")) {
            System.out.println("Nombre incorrecto, ingreselo de nuevo");
            nombreDavid = v.next();

        }
        while (contrDavid != 99) {
            System.out.println("Contrasena incorrecta ingresela de nuevo");
            contrDavid = v.nextInt();
        }
        int respuesta = 0;
        while (respuesta != 3) {
            System.out.println("==============================MENU===============================");
            String mensaje = "1.Reporte de restaurantes\n2.Manejo de restaurantes\n3.Salir";
            System.out.println(mensaje);
            respuesta = v.nextInt();
            switch (respuesta) {
                case 1: {
                    System.out.println("1.reporte de restaurantes segun su estado 1\n2.reporte de restaurantes premium 2\n3. reporte segun la franquicia \n4.reporte segun gerene con 2 mandos");
                    int resp2 = v.nextInt();
                    switch (resp2) {//iniicio de sub menu de reportes
                        case 1: {
                            Reporte1();
                            break;
                        }
                        case 2: {
                            Reporte2();
                            break;
                        }
                        case 3: {
                            Reporte3();
                            break;
                        }
                        case 4:{
                        verGerente();
                        break;
                        }

                    }//fin de switch interno de reportes
                    break;
                    /* Cada restaurante tiene un nombre de Franquici
                    a, Nombre de Restaurante, Ubicación, Cantidad de empleados, 
                    Parqueo (Si/No), Área de juegos (Si/No),
                    Cantidad de mesas, Cantidad de Cajeros, Nombre de Gerente,
                    Especialidad del restaurante y Estado del restaurante.
                            Deberá almacenar toda esta información en Arraylist*/

                }//fin de case de reportes
                case 2: {
                    System.out.println("====================MENU2=====================");
                    System.out.println("1.crear\n2.listar\n3.modificar\n4.eliminar\n");
                    int resp = v.nextInt();
                    switch (resp) {
                        case 1: {
                            int n7 = 0;
                            String n8 = "";
                            String n9 = "";
                            System.out.println("Ingrese nombre de franquicia");
                            String n1 = v.next();
                            System.out.println("Ingrese  nombre");
                            String n2 = v.next();
                            String nu = "";
                            System.out.println("ingrese ubicacion");
                            String n3 = v.next().toLowerCase();
                            int f = checkU(n3);
                            while (f == 1) {
                                System.out.println("UBICACION YA INGRESADA,NO PUEDE UBICAR AHI SU RESTAURANTE");
                                System.out.println("INGRESE UBICACION DE NUEVO :");
                                 n3 = v.next().toLowerCase();
                                f = checkU(n3);

                            }//valida ubicacion
                            
                            

                            System.out.println("ingrese cantidad de empleados");
                            int n4 = v.nextInt();
                            System.out.println("ingrese Si tiene parqueo(si/no)");
                            String n5 = v.next().toLowerCase();
                            System.out.println("ingrese si tiene area de juegos(si/no)");
                            String n6 = v.next().toLowerCase();

                            //String Franquicia, String nombre, String ubicacion, int cantEmpleados, String parqueo, String areaDejuegos, int CantidadDeMesas, String especialidad, String estado
                            System.out.println("ingrese el estado del restaurante ( Remodelacion, Demolicion, o Funcional. )");
                            String n10 = v.next().toLowerCase();
                            if (n10.equals("funcional")) {
                                System.out.println("ingrese nombre de gerente");
                                n8 = v.next();
                                int p = checkg(n8);
                                while (p== 1) {
                                    System.out.println("ESTE GERENTE YA TIENE 2 RESTAURANTES A SU FAVOR, PONGA A ALGUIEN MAS");
                                    System.out.println("INGRESE EL NOMBRE de GERENTE DE NUEVO :");
                                     n8 = v.next().toLowerCase();
                                    p = checkg(n8);

                                }
                                System.out.println("ingrese cantidad de mesas");
                                n7 = v.nextInt();
                                System.out.println("ingrese especialidad del restaurante");
                                
                                n9 = v.next().toLowerCase();
                                //String fran = ((restaurantes) restau.get(pos)).getEspecialidad();

                                      //  int f = verEspecialidad(n9, fran);
                                      //  while (f == 1) {
                                          //  System.out.println("ESTA ESPECIALIDAD YA LA TIENE OTRA FRANQUICIA");
                                          //  System.out.println("INGRESE LA ESPECIALIDAD DE NUEVO :");
                                           // String nu = v.next().toLowerCase();
                                           // f = verEspecialidad(nu, fran);

                                       // }
                            } else {
                                n8 = "Condicion no apta";
                                n7 = 0;
                                n9 = "condicion no apta";

                            }
                            restau.add(new restaurantes(n1, n2, n3, n4, n5, n6, n7, n9, n10, n8));

                            break;
                        }
                        case 2: {
                            listar();
                            break;
                        }//CASE DE LISTAR
                        case 3: {
                            System.out.println("INDIQUE LA POSICION DEL RESTAURANTE QUE DESEA MODIFICAR");
                            int pos = v.nextInt() - 1;
                            if (restau.size()>pos) {
                                System.out.println("QUE DESEA MODIFICAR DEL RESTAURANTE?");
                                System.out.println("1.Franquicia\n2.Nombre3.ubicacion\n4.cantidad de empleados\n5.Cantidad de mesas\n6.parqueo\n7.Area de juego\n8.especialidad\n9.nombre del gerente");
                                int resp2 = v.nextInt();
                                switch (resp2) {
                                    case 1: {
                                        System.out.println("Ingrese nueva franquicia");
                                        String x = v.next();
                                        ((restaurantes) restau.get(pos)).setFranquicia(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Ingrese nuevo nombre");
                                        String x = v.next();
                                        ((restaurantes) restau.get(pos)).setNombre(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Ingrese nueva ubicacion");
                                        String x = v.next();
                                        int f = checkU(x);
                                        while (f == 1) {
                                            System.out.println("UBICACION YA INGRESADA,NO PUEDE UBICAR AHI SU RESTAURANTE");
                                            System.out.println("INGRESE UBICACION DE NUEVO :");
                                            x = v.next().toLowerCase();
                                            f = checkU(x);

                                        }
                                       

                                        ((restaurantes) restau.get(pos)).setUbicacion(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;

                                    }
                                    case 4: {
                                        System.out.println("Ingrese nueva cantidad de empleados");
                                        int x = v.nextInt();
                                        ((restaurantes) restau.get(pos)).setCantEmpleados(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 5: {
                                        System.out.println("Ingrese nueva cantidad de mesas");
                                        int x = v.nextInt();
                                        ((restaurantes) restau.get(pos)).setCantidadDeMesas(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 6: {
                                        System.out.println("Ingrese nueva condicion de parqueo(si/no)");
                                        String x = v.next().toLowerCase();
                                        ((restaurantes) restau.get(pos)).setParqueo(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 7: {
                                        System.out.println("Ingrese nueva condicion de area de juegos(SI/NO)");
                                        String x = v.next().toLowerCase();
                                        ((restaurantes) restau.get(pos)).setAreaDejuegos(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 8: {
                                        System.out.println("Ingrese nueva especialidad");
                                        String x = v.next();
                                        String fran = ((restaurantes) restau.get(pos)).getEspecialidad();

                                        int f = verEspecialidad(x, fran);
                                        while (f == 1) {
                                            System.out.println("ESTA ESPECIALIDAD YA LA TIENE OTRA FRANQUICIA");
                                            System.out.println("INGRESE LA ESPECIALIDAD DE NUEVO :");
                                            x = v.next().toLowerCase();
                                            f = verEspecialidad(x, fran);

                                        }
                                        ((restaurantes) restau.get(pos)).setEspecialidad(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }
                                    case 9: {
                                        System.out.println("Ingrese nuevo nombre de gerente");
                                        String x = v.next().toLowerCase();
                                        int f = checkg(x);
                                        while (f == 1) {
                                            System.out.println("ESTE GERENTE YA TIENE 2 RESTAURANTES A SU FAVOR, PONGA A ALGUIEN MAS");
                                            System.out.println("INGRESE EL NOMBRE de GERENTE DE NUEVO :");
                                            x = v.next().toLowerCase();
                                            f = checkg(x);

                                        }
                                        ((restaurantes) restau.get(pos)).setNombreGerente(x);
                                        System.out.println("LISTO! PASAR A OPCION DE LISTAR O REPORTES PARA VER LOS CAMBIOS");

                                        break;
                                    }

                                }//switch para modificar
                            } else {
                                System.out.println("No se encuentra restaurante en esa posicion o su lista esta vacia");
                            }//if que valida que exista
                            break;
                        }//CASE DE MODIFICAR
                        case 4: {
                            System.out.println("Ingrese la posicion del restaurante a eliminar:");
                            int pos = v.nextInt() - 1;
                            if (restau.size() > pos) {
                                restau.remove(pos);
                            } else {
                                System.out.println("No se encuentra restaurante en esa posicion o su lista esta vacia");
                            }
                            break;
                        }//case para eliminar

                    }//switch de submenu de manejo de res
                    break;//break de case 2 moderar
                }//fin de case de moderar
                case 3: {//inicio case salir

                    break;
                }//fin case salir
                default: {
                    System.out.println("NUMERO INVALIDO");
                }

            }//switch principal

        }//while de menu principal

    }//main

    public static void verGerente() {
        int x = 0, y = 0, z = 1;
        System.out.println("==============LOS GERENTES CON DOBLE GERENCIA Y LAS POSICIONES DE LOS RESTAURANTES DONDE TRABAJAN");
        String gg = "";
                String ge = "";

        for (int i = 0; i < restau.size(); i++) {
            String ub = ((restaurantes) restau.get(i)).getNombreGerente();
            gg = ub;
            for (int j = 0; j < restau.size(); j++) {
                String ub2 = ((restaurantes) restau.get(j)).getNombreGerente();
                if (ub.equals(ub2)) {
                    x++;
                }
                if(x==2){
                    System.out.println(z+"="+gg);
                    x=0;
                    z++;
                    j = restau.size()-1;
                    
                
                }

            }

        }

    }

    public static int verEspecialidad(String especialidad, String fran) {
        int c = 0;
        for (int i = 0; i < restau.size(); i++) {
            String ub = ((restaurantes) restau.get(i)).getEspecialidad();

            if (especialidad.equals(ub)) {

                String ub2 = ((restaurantes) restau.get(i)).getFranquicia();

                if (ub2.equals(fran)) {
                    c = 1;
                    break;
                }

            }
        }
        return c;

    }

    public static int checkg(String gerente) {
        int c = 0;
        int c1 = 0;
        for (int i = 0; i < restau.size(); i++) {
            String ub = ((restaurantes) restau.get(i)).getNombreGerente();
            if (ub.equals(gerente)) {
                c1++;
                if (c1 >= 2) {
                    c = 1;
                    break;
                }
            }

        }
        if (c1 >= 2) {
            c = 1;
        } else {
            c = 0;
        }
        return c;

    }

    public static int checkU(String ubicacion) {
        int c = 0;
        for (int i = 0; i < restau.size(); i++) {
            String ub = ((restaurantes) restau.get(i)).getUbicacion();
            if (ub.equals(ubicacion)) {
                c = 1;
                break;

            } else {
                c = 0;
            }
        }
        return c;

    }

    public static void Reporte2() {
        int cont = 0;
        if (restau.size() >= 1) {
            System.out.println("==============Restaurantes premium==================");
            for (int i = 0; i < restau.size(); i++) {
                String pre = ((restaurantes) restau.get(i)).getParqueo();
                String pre2 = ((restaurantes) restau.get(i)).getAreaDejuegos();
                String espe = ((restaurantes) restau.get(i)).getEspecialidad();
                String ubicacion = ((restaurantes) restau.get(i)).getUbicacion();
                String nombre = ((restaurantes) restau.get(i)).getNombre();

                if (pre.equals("si") || pre2.equals("si")) {
                    System.out.println(cont + "=" + "Nombre:" + nombre + "|" + "Ubicacion:" + ubicacion + "|" + "Especialidad:" + espe);
                }
                cont++;
            }

        } else {
            System.out.println("USTED CUENTA CON 0 RESTAURANTES");
        }

    }//reporte2

    public static void Reporte1() {
        System.out.println("=======================REPORTE SEGUN ESTADO====================");
        int cont = 0;
        if (restau.size() >= 1) {
            System.out.println("Ingrese segun que estado quiere el reporte");
            String reporte = v.next().toLowerCase();
            for (int i = 0; i < restau.size(); i++) {
                String estado = ((restaurantes) restau.get(i)).getEstado();
                if (estado.equals(reporte)) {
                    System.out.println(cont + "=" + restau.get(i));
                }
                cont++;
            }

        } else {

            System.out.println("USTED CUENTA CON 0 RESTAURANTES");
        }

    }

    public static void Reporte3() {
        int cont = 0;
        System.out.println("===================REPORTE SEGUN FRANQUICIA========================");
        if (restau.size() >= 1) {
            System.out.println("Ingrese segun que franquicia quiere el reporte");
            String reporte = v.next().toLowerCase();
            for (int i = 0; i < restau.size(); i++) {
                String espe = ((restaurantes) restau.get(i)).getEspecialidad();
                String ubicacion = ((restaurantes) restau.get(i)).getUbicacion();
                String nombre = ((restaurantes) restau.get(i)).getNombre();
                String fran = ((restaurantes) restau.get(i)).getFranquicia();

                if (fran.equals(reporte)) {
                    System.out.println(cont + "=" + "Nombre:" + nombre + "|" + "Ubicacion:" + ubicacion + "|" + "estado:" + espe);
                } else {
                    System.out.println(cont + "-no cuenta con la especificaciones");
                }
                cont++;
            }
        } else {
            System.out.println("USTED CUENTA CON 0 RESTAURANTES");

        }

    }

    public static void listar() {
        System.out.println("====================RESTAURANTES==================");
        int cont = 1;
        for (Object res : restau) {
            System.out.println(cont + "=" + res);
            cont++;
        }

    }

}//clase
