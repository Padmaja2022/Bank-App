import { Component, OnInit } from '@angular/core';
import { MainService } from '../services/main.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public mainService : MainService) { }

  ngOnInit(): void {
  }

  login(id: number) {
    this.mainService.getAccountById(id);
    this.mainService.getTransactionsById(id);
    console.log(id);
  }
  

}
