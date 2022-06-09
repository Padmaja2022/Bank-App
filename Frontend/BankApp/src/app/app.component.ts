import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MainService } from './services/main.service';
import { Account } from './common/account';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  account = new Account();

  constructor(public mainService: MainService,
              public router: Router) {}

  getAccount(id: number) {
    console.log(id);
    this.mainService.getAccountById(id).subscribe(res => { 
      this.account = res
    console.log(this.account); }
    );
  }

}