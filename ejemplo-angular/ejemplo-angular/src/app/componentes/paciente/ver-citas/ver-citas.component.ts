import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { ActivatedRoute, Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { UsuarioService } from 'src/app/servicios/usuario.service';

@Component({
  selector: 'app-ver-citas',
  templateUrl: './ver-citas.component.html',
  styleUrls: ['./ver-citas.component.css']
})
export class VerCitasComponent implements OnInit{

  columnas: string[] = ['descripcion', 'fecha']
  dataSourt = new MatTableDataSource()

  constructor(private cookie:CookieService,
    private router:Router,
    private usuarioService:UsuarioService,
    private activatedRoute: ActivatedRoute){}
  ngOnInit(): void {
    if (this.cookie.get("id") === undefined || this.cookie.get("id") === null || this.cookie.get("id") === "") {
      this.router.navigate(['/login']);
    }
    this.verCitas()
  }

  verCitas(){
    let idUser = this.activatedRoute.snapshot.params['id']
    this.usuarioService.verCitas(+idUser).subscribe((res=>{
      console.log(res)
      this.dataSourt.data = res;
    }))
  }
}
