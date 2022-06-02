import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CardComponent } from './components/card/card.component';
import { TransactionsComponent } from './components/transactions/transactions.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ProfileDataComponent } from './components/profile-data/profile-data.component';
import { SignupUpPageComponent } from './components/signup-up-page/signup-up-page.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { HomeComponent } from './components/home/home.component';
import {Routes, RouterModule} from '@angular/router';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CardComponent,
    TransactionsComponent,
    ProfileComponent,
    ProfileDataComponent,
    SignupUpPageComponent,
    LoginPageComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

const routes: Routes = [
  {path:"", redirectTo:"login", pathMatch:"full"},
  {path:"login", component:LoginPageComponent},
  {path:"signUp", component:SignupUpPageComponent},
  {path:"home", component:HomeComponent},
];

