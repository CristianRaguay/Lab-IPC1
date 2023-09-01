/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Menu {

    private Carro[] carros = new Carro[10];
    private Usuario[] usuarios = new Usuario[5];
    private Oferta[] ofertas = new Oferta[5];

//    public void verMenu() {
//        Scanner sc = new Scanner(System.in);
//        int opcion = 0;
//        while (opcion != 3) {
//            System.out.println("1. Admin");
//            System.out.println("2. Cliente");
//            System.out.println("3. Salir");
//            opcion = sc.nextInt();
//            switch (opcion) {
//                case 1:
//                    String usuario,
//                     contrasenia;
//                    System.out.println("ingrese el usuario");
//                    usuario = sc.next();
//                    System.out.println("Ingrese la contrasenia");
//                    contrasenia = sc.next();
//                    if (usuario.equals("admin") && contrasenia.equals("admin")) {
//                        int opcion2 = 0;
//                        while (opcion2 != 7) {
//                            System.out.println("1. Ingresar Usuario");
//                            System.out.println("2. Ver Usuarios");
//                            System.out.println("3. Ingresar Vehiculo");
//                            System.out.println("4. ver Vehiculos");
//                            System.out.println("5. ingresar Ofertas");
//                            System.out.println("6 ver Ofertas");
//                            opcion2 = sc.nextInt();
//                            switch (opcion2) {
//                                case 1:
//                                    agregarUsuario();
//                                    break;
//                                case 2:
//                                    verUsuarios();
//                                    break;
//                                case 3:
//                                    ingresarVehiculo();
//                                    break;
//                                case 4:
//                                    verVehiculos();
//                                    break;
//                                case 5:
//                                    ingresarOferta();
//                                    break;
//                                case 6:
//                                    verOferta();
//                                    break;
//                            }
//                        }
//                    } else {
//                        System.out.println("Else");
//                    }
//                    break;
//            }
//        }
//    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }

    public void setOfertas(Oferta[] ofertas) {
        this.ofertas = ofertas;
    }
    
    public boolean buscarNit(String nit){
        for (Usuario usuario : usuarios) {
            if (usuario.getNit().equals(nit)) {
                return true;
            }
        }
        return false;
    }

    public void agregarUsuario(String nombre, String apellido, String nit) {
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setNit(nit);
        if (!user.buscarUsuario(usuarios, user.getNit())) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == null) {
                    usuarios[i] = user;
                    break;
                }
            }
        }
    }

    public void verUsuarios() {
        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                System.out.println("nombre: " + usuario.getNombre());
                System.out.println("apellido: " + usuario.getApellido());
                System.out.println("nit: " + usuario.getNit());
            }
        }
    }

    public void ingresarVehiculo() {
        Carro carro = new Carro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese placa");
        carro.setPlaca(sc.next());
        System.out.println("Ingrese Marca");
        carro.setMarca(sc.next());
        System.out.println("Ingrese Modelo");
        carro.setModelo(sc.next());

        if (!carro.buscarCarro(carros)) {
            for (int i = 0; i < carros.length; i++) {
                if (carros[i] == null) {
                    carros[i] = carro;
                    break;
                }
            }
        } else {
            System.out.println("La placa ya existe");
        }

    }

    public void verVehiculos() {
        for (Carro carro : carros) {
            if (carro != null) {
                System.out.println("placa: " + carro.getPlaca());
                System.out.println("marca: " + carro.getMarca());
                System.out.println("modelo: " + carro.getModelo());
            }
        }
    }
    
    public void ingresarOferta(){
        Oferta oferta = new Oferta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero de dias");
        oferta.setDias(sc.nextInt());
        System.out.println("Ingresar el porcentaje");
        oferta.setDescuento(sc.nextInt());
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = oferta;
                break;
            }
        }
    }
    
    public void verOferta(){
        for (Oferta oferta : ofertas) {
            if (oferta != null) {
                System.out.println("dias minimos: " + oferta.getDias());
                System.out.println("porcentaje de descuento: " + oferta.getDescuento());
            }
        }
    }
}
