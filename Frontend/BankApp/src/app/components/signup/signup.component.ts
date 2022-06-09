import { Component, OnInit } from '@angular/core';
import { Account } from 'src/app/common/account';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  account = new Account();

  constructor(public mainService: MainService) { }

  ngOnInit(): void {
  }

  createAccount() {
    this.mainService.createAccount(this.account);
    console.log("Running");
  }
}
