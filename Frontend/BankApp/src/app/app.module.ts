import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { TransactionsComponent } from './components/transactions/transactions.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ProfileDataComponent } from './components/profile-data/profile-data.component';
import { Routes, RouterModule } from '@angular/router';
import { LandingPageComponent } from './components/landing-page/landingpage.component';
import { MainService } from './services/main.service';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { TransactionsListComponent } from './components/transactions-list/transactions-list.component';
import { LoginComponent } from './login/login.component';
import { SettingsModalComponent } from './components/settings-modal/settings-modal.component';
import { SignupComponent } from './components/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './components/navbar/navbar.component';


const routes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'dashboard/:id', component: DashboardComponent },
  { path: 'landing-page', component: LandingPageComponent },
  { path: 'transactions/:id', component: TransactionsListComponent },
  { path: '**', redirectTo: '/', pathMatch: 'full' },
  {path:"", redirectTo:"login", pathMatch:"full" },
  { path:"login", component: LoginComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    TransactionsComponent,
    ProfileComponent,
    ProfileDataComponent,
    LoginComponent,
    LandingPageComponent,
    DashboardComponent,
    TransactionsListComponent,
    LoginComponent,
    SettingsModalComponent,
    SignupComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [MainService],

  bootstrap: [AppComponent]
})
export class AppModule { }
