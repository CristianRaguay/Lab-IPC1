import { UsuarioService } from './../../servicios/usuario.service';
import { usuario } from './../../interfaces/usuario';
import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-registrar-usuario',
  templateUrl: './registrar-usuario.component.html',
  styleUrls: ['./registrar-usuario.component.css']
})
export class RegistrarUsuarioComponent {
  nuevoUser!:usuario
  nombre!:string
  apellido!:string
  user!:string
  contrasena!:string

  constructor(private usuarioServiuce:UsuarioService,
     private router:Router){}

  registrar(){

    /* this.nuevoUser.nombre = this.nombre
    this.nuevoUser.user = this.user
    this.nuevoUser.contrasena = this.contrasena */
    var newUser: usuario ={
      apellido: this.apellido,
      nombre:this.nombre,
      user:this.user,
      contrasena:this.contrasena,
      id:0
    }
    this.usuarioServiuce.registrarUsuario(newUser).subscribe((data)=>{
      console.log(data)
      this.router.navigate(['/login']);
  })
}
}
