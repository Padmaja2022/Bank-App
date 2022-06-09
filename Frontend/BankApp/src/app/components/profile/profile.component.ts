import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Account } from 'src/app/common/account';
import { MainService } from 'src/app/services/main.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
account = new Account();

  constructor(public mainService: MainService,
    public route: ActivatedRoute) { }

  ngOnInit(): void {
    const number: number = +this.route.snapshot.paramMap.get('id')!;

    this.mainService.getAccountById(number).subscribe(res => {
      this.account = res;
    })
  }

}

