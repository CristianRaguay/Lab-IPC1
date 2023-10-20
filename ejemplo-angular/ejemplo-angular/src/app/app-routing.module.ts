import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componentes/login/login.component';
import { RegistrarUsuarioComponent } from './componentes/registrar-usuario/registrar-usuario.component';
import { PacienteComponent } from './componentes/paciente/paciente.component';

const routes: Routes = [
  //{path:'', component: LoginComponent, pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path:'restrar/usuario', component: RegistrarUsuarioComponent},
  {path: 'paciente', component: PacienteComponent}
  //{ path: '**', redirectTo: '/login' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
