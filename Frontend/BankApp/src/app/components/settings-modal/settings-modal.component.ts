import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MainService } from 'src/app/services/main.service';
import { Account } from 'src/app/common/account';

@Component({
  selector: 'app-settings-modal',
  templateUrl: './settings-modal.component.html',
  styleUrls: ['./settings-modal.component.css'],
})
export class SettingsModalComponent implements OnInit {
  account = new Account();

  constructor(public mainService: MainService, public route: ActivatedRoute) {}

  ngOnInit(): void {
    const number: number = +this.route.snapshot.paramMap.get('id')!;

    this.mainService.getAccountById(number).subscribe((res) => {
      this.account = res;
    });
  }
}
