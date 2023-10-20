import { CookieService } from 'ngx-cookie-service';
import { UsuarioService } from './../../servicios/usuario.service';
import { Component } from '@angular/core';
import {  Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  nombre!:string;
  pass!:string

  constructor(private user:UsuarioService,
    private cookie:CookieService,
    private router:Router){

  }

  verNombre(){
    this.router.navigate(['restrar/usuario'])
    /* console.log(this.cookie.get("id"))
    console.log(this.cookie.get("nombre")) */
  }

  iniciarSecion(){
    this.user.loguin(this.nombre, this.pass).subscribe((res) =>{
      console.log(res)
      this.cookie.set("id", res[0].id.toString())
      this.cookie.set("nombre", res[0].nombre)
      this.cookie.set("apellido", res[0].apellido)
      this.cookie.set("user", res[0].user)
      this.router.navigate(['paciente'])
    })
  }
}
