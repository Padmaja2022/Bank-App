import { Component, OnInit } from '@angular/core';
import { MainService } from 'src/app/services/main.service';
import { ActivatedRoute } from '@angular/router';
import { Account } from 'src/app/common/account';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  account = new Account();

  constructor(public mainService: MainService,
              public route: ActivatedRoute) { }

  ngOnInit(): void {
    const number: number = +this.route.snapshot.paramMap.get('id')!;
    this.mainService.getAccountById(number).subscribe( res => {
      this.account = res;
    });
  }

}
