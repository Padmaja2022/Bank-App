import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'BankApp';
  showModal!: boolean;
  registerForm!: FormGroup;
  submitted = false;
  constructor(private formBuilder: FormBuilder) {}
  show()
  {
    this.showModal = true;
  }
  hide()
  {
    this.showModal = false;
  }
  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['',[Validators.required, Validators.minLength(6)]]
    });
  }
  get f() {return this.registerForm.controls; }
  onSubmit() {
    this.submitted = true;
    if(this.registerForm.invalid) {
      return;
    }
    if(this.submitted) {
      this.showModal = false;
    }
  }
}
