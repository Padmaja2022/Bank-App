import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from '../components/login-page/login-page.component';
import { SignupUpPageComponent } from '../components/signup-up-page/signup-up-page.component';
import { HomeComponent } from '../components/home/home.component';


const routes: Routes = [
  {path:"", redirectTo:"login", pathMatch:"full"},
  {path:"login", component:LoginPageComponent},
  {path:"signUp", component:SignupUpPageComponent},
  {path:"home", component:HomeComponent},
];

@NgModule({
  declarations: [
    SignupUpPageComponent,
      LoginPageComponent,
      HomeComponent

  ],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],

  exports: [
    RouterModule
    ],
  

})
export class AppRouterModule { }


