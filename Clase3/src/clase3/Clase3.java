/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    int opcuionMenu = 0;
    static String[][] usuarios = new String[2][5];

    public static void main(String[] args) {
        //System.out.println(usuarios[1].length);
        menuUsuarios();
    }

    public static void menuUsuarios() {
        int opcionMenu = 0;
        while (opcionMenu != 3) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Administrador");
            System.out.println("2. Cliente");
            Scanner sc = new Scanner(System.in);
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    String usuario,
                     pass;
                    System.out.println("Ingrese su usuario");
                    usuario = sc.next();
                    System.out.println("Ingrese su contrasena");
                    pass = sc.next();
                    if (usuario.equals("admin") && pass.equals("123")) {
                        System.out.println("usuario correcto");
                    } else {
                        System.out.println("usuario o contrasena incorrecto");
                    }
                    break;
                case 2:
                    int opcionMenu2 = 0;
                    while (opcionMenu2 != 3) {
                        System.out.println("Ingrese una opcion");
                        System.out.println("1. iniciar sesion");
                        System.out.println("2. crear usuario");
                        opcionMenu2 = sc.nextInt();
                        switch (opcionMenu2) {
                            case 1:
                                iniciaSesion();
                                break;
                            case 2:
                                System.out.println("Ingrese su usuario");
                                usuario = sc.next();
                                System.out.println("Ingrese su contrasena");
                                pass = sc.next();
                                for (int i = 0; i < usuarios[1].length; i++) {
                                    if (usuarios[0][i] == null) {
                                        usuarios[0][i] = usuario;
                                        usuarios[1][i] = pass;
                                        break;
                                    }
                                }
                        }
                    }
                    break;
            }
        }
    }

    public static void iniciaSesion() {
        String usuario, pass;
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        System.out.println("Ingrese su usuario");
        usuario = sc.next();
        System.out.println("Ingrese su contrasena");
        pass = sc.next();
        for (int i = 0; i < usuarios[1].length; i++) {
            if (usuarios[0][i] != null && usuarios[1][i] != null) {
                            if (usuarios[0][i].equals(usuario) && usuarios[1][i].equals(pass)) {
                encontrado = true;
                break;
            }
            }

        }
        if (encontrado) {
            System.out.println("usuario encontrado");
        } else {
            System.out.println("usuario no encontrado");
        }
    }

    public static void menu() {
        int opcionMenu = 0;
        int a, b;
        while (opcionMenu != 4) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            Scanner sc = new Scanner(System.in);
            opcionMenu = sc.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Valor a");
                    a = sc.nextInt();
                    System.out.println("Valor b");
                    b = sc.nextInt();
                    int suma = a +b;
                    System.out.println("resultado => " + suma);
                    break;
                case 3:
                    int numero2 = 0;
                    while (numero2 != 3) {
                        System.out.println("Ingrese una opcion");
                        System.out.println("1. division");
                        System.out.println("2. multiplicacion");
                        numero2 = sc.nextInt();
                        switch (numero2) {
                            case 2:
                                System.out.println("Valor a");
                                a = sc.nextInt();
                                System.out.println("Valor b");
                                b = sc.nextInt();
                                System.out.println("resultado => " + multiplicacion(a, b));
                                break;
                        }
                    }
            }
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

}
