import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from 'src/app/common/account';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  account = new Account();

  constructor(public mainService: MainService,
              public router: Router) {}

  ngOnInit(): void {
    
  }

  getAccount(id: number) {
    console.log(id);
    this.mainService.getAccountById(id).subscribe(res => { 
      this.account = res
    console.log(this.account); 
  
  }
    );
  }


}
