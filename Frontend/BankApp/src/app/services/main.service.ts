import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Account } from '../common/account';
import { Transaction } from '../common/transaction';

@Injectable({
  providedIn: 'root'
})

export class MainService {

    accounts = new Account();

    transactions: Transaction[] = new Array<Transaction>()

    private baseUrl: string = 'http://localhost:8080/'
  
    constructor(private http: HttpClient) {}

    getTransactionsById(id: number): Observable<Transaction[]> {
      return this.http.get<Transaction[]>(this.baseUrl + `transactions/get/transactions/${id}`);
    }

    getAccountById(id: number) {
      return this.http.get<Account>(this.baseUrl + `accounts/gt/account/${id}`).subscribe(
        res => {
          this.accounts = res;
          console.log(this.accounts);
        }
      )
    }
} 