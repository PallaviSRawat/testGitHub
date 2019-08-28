import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder,Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  username=new FormControl('',[Validators.required, Validators.email]);  //'' is the value of form control
  password = new FormControl('',[Validators.required, Validators.minLength(6)]);
  registerForm : FormGroup;
  fb: FormBuilder;
  
  // constructor(private fb : FormBuilder) { 
  constructor(fb : FormBuilder) { 
    this.fb=fb;
    this.registerForm=this.fb.group({
      username: this.username,
      password: this.password
    });
  }  //formbuilder group indivudual elements and by taking all the model sin class and returning form group instance

  onRegister(){
    console.log(this.registerForm);
  }
  ngOnInit() {
  }

}
