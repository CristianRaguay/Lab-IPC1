import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { CrearCita, RegistrarUSuario, usuario } from "../interfaces/usuario";

@Injectable({
  providedIn: 'root'
})
export class UsuarioService{

  private baseUrl = 'http://localhost:3000'

  constructor(private http: HttpClient){

  }

  loguin(usuario:string, pass:string):Observable<usuario[]>{
    return this.http.get<usuario[]>(`${this.baseUrl}/login/${usuario}/${pass}`)
  }

  registrarUsuario(user:usuario):Observable<RegistrarUSuario>{
    return this.http.post<RegistrarUSuario>(`${this.baseUrl}/RegistrarUsuario`, user)
  }

  crearCita(cita:CrearCita):Observable<CrearCita>{
    return this.http.post<CrearCita>(`${this.baseUrl}/crearCita`, cita);
  }

  verCitas(id:number):Observable<CrearCita[]>{
    return this.http.get<CrearCita[]>(`${this.baseUrl}/verMisCitas/${id}`);
  }
}
