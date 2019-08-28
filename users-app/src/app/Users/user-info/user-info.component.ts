import { Component, OnInit, Input, DoCheck, OnDestroy, AfterViewChecked, AfterViewInit, AfterContentChecked, AfterContentInit, OnChanges } from '@angular/core';
import { IUser } from 'src/app/model/user';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnChanges, OnInit, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  @Input('user') user : IUser;

  dynamicClasses={
    feature:true,
    border:false
  }

  
  ngOnChanges(){console.log("onChanges")}
  ngOnInit(){console.log("OnInit")}
  ngDoCheck(){console.log("DoCheck")}
  ngAfterContentInit(){console.log("AfterContentInit")}
  ngAfterContentChecked(){console.log("AfterContentChecked")}
  ngAfterViewInit(){console.log("AfterViewInit")}
  ngAfterViewChecked(){console.log("AfterViewChecked")}
  ngOnDestroy(){console.log("OnDestroy")}
}
