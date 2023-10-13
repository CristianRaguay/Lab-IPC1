class Usuario{
    id
    nombre
    apellido
    contrasena

    constructor(id, nombre, apellido, contrasena){
        this.id = id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.contrasena=contrasena;
    }

    getId(){
        return this.id;
    }

    setId(id){
        this.id = id;
    }

    getNombre(){
        return this.nombre;
    }

    setNombre(){
        this.nombre = nombre;
    }

    getApellido(){
        return this.apellido;
    }

    setApellido(apellido){
        this.apellido = apellido;
    }

    getContrasena(){
        return  this.contrasena;
    }

    setContrasena(){
        this.contrasena = contrasena;
    }
}

exports.Usuario