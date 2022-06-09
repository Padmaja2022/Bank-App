import { Component, OnInit } from '@angular/core';
import { Account } from 'src/app/common/account';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor(public mainService: MainService) { }
  
  ngOnInit(): void {

  }
  

}
