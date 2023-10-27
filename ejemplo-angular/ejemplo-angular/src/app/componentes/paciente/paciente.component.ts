import { UsuarioService } from './../../servicios/usuario.service';
import { CookieService } from 'ngx-cookie-service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CrearCita } from 'src/app/interfaces/usuario';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit{

  descripcion!:string
  fecha!: Date
  columnas: string[] = ['descripcion', 'fecha']
  dataSourt = new MatTableDataSource()
  constructor(private cookie:CookieService,
    private router:Router,
    private usuarioService:UsuarioService){}
  ngOnInit(): void {
      if (this.cookie.get("id") === undefined || this.cookie.get("id") === null || this.cookie.get("id") === "") {
        this.router.navigate(['/login']);
      }
  }

  cita(){
    let id=this.cookie.get('id')
    var newDate: CrearCita ={
      description: this.descripcion,
      fecha:this.fecha,
      idUsuario: +id
    }
    this.usuarioService.crearCita(newDate).subscribe((res => {
      console.log(res)
    }))
  }

  verCitas(){
    this.router.navigate(['/verCitas', +this.cookie.get('id')])
    /* this.usuarioService.verCitas(+this.cookie.get('id')).subscribe((res=>{
      console.log(res)
      this.dataSourt.data = res;
    })) */
  }

}
