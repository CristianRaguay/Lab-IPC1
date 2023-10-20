import { CookieService } from 'ngx-cookie-service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit{

  constructor(private cookie:CookieService,
    private router:Router){}
  ngOnInit(): void {
      if (this.cookie.get("id") === undefined || this.cookie.get("id") === null || this.cookie.get("id") === "") {
        this.router.navigate(['/login']);
      }
  }
}
