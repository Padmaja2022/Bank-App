import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Transaction } from 'src/app/common/transaction';
import { MainService } from 'src/app/services/main.service';
import { Account } from 'src/app/common/account';

@Component({
  selector: 'app-transactions-list',
  templateUrl: './transactions-list.component.html',
  styleUrls: ['./transactions-list.component.css']
})
export class TransactionsListComponent implements OnInit {

  transactions$!: Observable<Transaction[]>;
  account = new Account();

  constructor(public mainService: MainService,
              public route: ActivatedRoute) { }

  ngOnInit(): void {
    const number: number = +this.route.snapshot.paramMap.get('id')!;

    this.mainService.getAccountById(number).subscribe(res => {
      this.account = res;
    })
    console.log(this.account);
    this.transactions$ = this.mainService.getTransactionsById(number);
    console.log(this.transactions$);
  }


  }
  


