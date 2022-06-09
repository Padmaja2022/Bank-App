import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { Transaction } from 'src/app/common/transaction';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css'],
})
export class TransactionsComponent implements OnInit {
  
  transactions$!: Observable<Transaction[]>;

  constructor(public mainService: MainService, public route: ActivatedRoute) {}

  ngOnInit(): void {
    const number: number = +this.route.snapshot.paramMap.get('id')!;

    this.transactions$ = this.mainService.getTransactionsById(number);
    console.log(this.transactions$);
  }
}
