/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

/**
 *
 * @author crist
 */
public class Usuario {

    private String nit;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String contrasenia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public boolean buscarUsuario(Usuario[] users, String nit) {
        for (Usuario user : users) {
            if (user != null) {
                if (user.getNit() == nit) {
                    return true;
                }
            }
        }
        return false;
    }
}
