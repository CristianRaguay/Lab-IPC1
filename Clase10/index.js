const expres = require('express');
const cors = require('cors')
const app = expres();
const {AdminUser} = require('./AdminUser')
const {AdminCitas} = require('./AdmisnCitas')

app.use(cors())
app.use(expres.json())

let usuarios = [];
let contadorId = 1;
let admin = new AdminUser()
let adminCitas = new AdminCitas()

app.post('/RegistrarUsuario', (req, res) =>{
    const elemento = req.body
    elemento.id = contadorId
    contadorId++
    //AdminUser.agregarUsuario(elemento)
    admin.agregarUsuario(elemento)
    res.json({mensaje:"Registro exitoso", objeto:elemento});
})

app.get('/usuarios',(req, res)=>{
    res.status(200).json(admin.obtenerUsuarios())
})

app.get("/login/:user/:pass", (req, res)=>{
    const user = req.params.user
    const pass = req.params.pass
    const resultado = admin.compararUsuario(user, pass)
    if(resultado !== undefined){
        res.status(200).json(resultado)
    }else{
        res.status(401).json("Accseso denegado");
    }

})

app.get('/buscarUsuario/:id', (req, res)=>{
    const id = parseInt(req.params.id)
    console.log(id)
    //const usuario = usuarios.filter((user) => user.id === id)
    const usuario = admin.buscarUsuario(id)
    res.status(200).json(usuario)
})

app.post("/crearCita", (req, res)=>{
    const cita = req.body
    adminCitas.crearCita(cita)
    res.status(200).json({mensaje:"cita creada"})
})

app.get("/verMisCitas/:id", (req, res)=>{
    const id = parseInt(req.params.id)
    console.log(id)
    res.status(200).json(adminCitas.verCitas(id))
})

app.listen(3000, ()=>{
    console.log("Servidor corriendo en el puerto: http://localhost:3000");
})