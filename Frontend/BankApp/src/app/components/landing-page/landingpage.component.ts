import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Account } from 'src/app/common/account';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-landingpage',
  templateUrl: './landingpage.component.html',
  styleUrls: ['./landingpage.component.css']
})
export class LandingPageComponent implements OnInit {

  account = new Account();
  @Output() accountId = new EventEmitter<number>();


  constructor(private route: ActivatedRoute,
              public mainService: MainService) { }

  ngOnInit(): void {
  }

  login(id: number) {
    this.accountId.emit(id);
    //this.mainService.getTransactionsById(id);
    console.log(id);
    
  }

}
