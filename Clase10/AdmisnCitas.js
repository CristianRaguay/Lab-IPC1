class AdminCitas{
    citas = []

    crearCita(elemento){
        this.citas.push(elemento)
    }

    verCitas(id){
        let  userId = parseInt(id)
        return this.citas.filter((user) => user.idUsuario === userId)
    }

    verTodo(){
        return this.citas;
    }
}
exports.AdminCitas = AdminCitas