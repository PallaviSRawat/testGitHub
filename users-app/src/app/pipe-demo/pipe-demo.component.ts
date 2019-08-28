import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  promise =new Promise((resolve, reject) =>{
    setTimeout(() =>{
      resolve("here is the result.");
    },3000);
  });
  constructor() { }

  ngOnInit() {
  }

}
