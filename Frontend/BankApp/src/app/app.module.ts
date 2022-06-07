import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { TransactionsComponent } from './components/transactions/transactions.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ProfileDataComponent } from './components/profile-data/profile-data.component';
import { SignupUpPageComponent } from './components/signup-up-page/signup-up-page.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import {Routes, RouterModule} from '@angular/router';
import { LandingPageComponent } from './components/landing-page/landingpage.component';
import { MainService } from './services/main.service';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { TransactionsListComponent } from './components/transactions-list/transactions-list.component';
import { SettingsModalComponent } from './components/settings-modal/settings-modal.component';


const routes: Routes = [
  { path: '', component: DashboardComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'landing-page', component: LandingPageComponent },
  { path: 'transactions', component: TransactionsListComponent },
  { path: '**', redirectTo: '/', pathMatch: 'full' },
  {path:"", redirectTo:"login", pathMatch:"full" },
  { path:"login", component: LoginPageComponent },
  { path:"signUp", component: SignupUpPageComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    TransactionsComponent,
    ProfileComponent,
    ProfileDataComponent,
    SignupUpPageComponent,
    LoginPageComponent,
    LandingPageComponent,
    DashboardComponent,
    TransactionsListComponent,
    SettingsModalComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  
  ],
  providers: [MainService],

  bootstrap: [AppComponent]
})
export class AppModule { }
