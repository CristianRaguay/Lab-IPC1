const expres = require('express');
const cors = require('cors')
const app = expres();

app.use(cors())
app.use(expres.json())

let usuarios = [];

let contadorId = 1;

app.post('/RegistrarUsuario', (req, res) =>{
    const elemento = req.body
    console.log(elemento)
    elemento.id = contadorId
    contadorId++
    usuarios.push(elemento)
    res.json({mensaje:"Registro exitoso", objeto:elemento});
})

app.get('/usuarios',(req, res)=>{
    res.status(200).json(usuarios)
})

app.get('/buscarUsuario/:id', (req, res)=>{
    const id = parseInt(req.params.id)
    console.log(id)
    const usuario = usuarios.filter((user) => user.id === id)
    res.status(200).json(usuario)
})

app.listen(3000, ()=>{
    console.log("Servidor corriendo en el puerto: http://localhost:3000");
})