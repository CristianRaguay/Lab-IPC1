class AdminCitas{
    citas = []

    crearCita(elemento){
        this.citas.push(elemento)
    }

    verCitas(id){
        return this.citas.filter((elemet) => elemet.idUser === id)
    }
}
exports.AdminCitas = AdminCitas