import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Transaction } from 'src/app/common/transaction';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-transactions-list',
  templateUrl: './transactions-list.component.html',
  styleUrls: ['./transactions-list.component.css']
})
export class TransactionsListComponent implements OnInit {

  transactions: Transaction[] = [];
  searchMode: boolean = false;

  constructor(private router: Router,
              private main: MainService,
              private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

 

  doSearch(value: string) {
    console.log(`value=${value}`);
    this.router.navigateByUrl(`/search/${value}`);
  }
}
