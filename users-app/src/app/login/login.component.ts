import { Component, OnInit } from '@angular/core';
import { __core_private_testing_placeholder__ } from '@angular/core/testing';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

    error : string =""

  onInput(f:NgForm){
    // if(f.value.username.length <=0){
      this.error="Something went wrong with username.";
    // }else{
      // this.error="";
    // }
    
  }
  onSubmit(f:NgForm){
    console.log(f);
  }

  showVal(newVal){
    console.log(newVal);
    // NgForm. value=newVal;
  }

}
