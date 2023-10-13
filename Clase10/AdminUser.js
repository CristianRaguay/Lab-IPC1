class AdminUser{
    lista = []

    agregarUsuario(user){
        this.lista.push(user)
    }

    obtenerUsuarios(){
        return this.lista;
    }

    buscarUsuario(id){
        return this.lista.filter((user) => user.id === id)
    }

    compararUsuario(us, pass){
        return this.lista.filter((user) => user.user === us && user.contrasena === pass)
    }

}
exports.AdminUser = AdminUser;