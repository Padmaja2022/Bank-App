import { Component, OnInit } from '@angular/core';
import { MainService } from '../services/main.service';
import { Output, EventEmitter } from '@angular/core';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  @Output() accountId = new EventEmitter<number>();

  constructor(public mainService : MainService) { }

  ngOnInit(): void {
  }



  

}
