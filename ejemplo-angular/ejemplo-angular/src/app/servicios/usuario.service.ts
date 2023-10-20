import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { RegistrarUSuario, usuario } from "../interfaces/usuario";

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
}
