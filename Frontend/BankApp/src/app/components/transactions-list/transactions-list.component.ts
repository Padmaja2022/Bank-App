import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Transaction } from 'src/app/common/transaction';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-transactions-list',
  templateUrl: './transactions-list.component.html',
  styleUrls: ['./transactions-list.component.css']
})
export class TransactionsListComponent implements OnInit {

  //transactions$!: Observable <Transaction[]>;

  constructor(public mainService: MainService) { }

  ngOnInit(): void {

    //this.transactions$ = this.mainService.getTransactionsById(id);
  }

}
