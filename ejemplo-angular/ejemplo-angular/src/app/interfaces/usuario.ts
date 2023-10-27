export interface usuario{
  nombre:string
  apellido:string
  user:string
  contrasena:string
  id:number
}

export interface RegistrarUSuario{
  mensaje:string
  objeto:usuario
}

export interface CrearCita{
  description:string
  fecha:Date
  idUsuario:number
}
