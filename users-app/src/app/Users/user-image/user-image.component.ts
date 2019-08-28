import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { IUser } from 'src/app/model/user';
// import { EventEmitter } from 'events';

@Component({
  selector: 'app-user-image',
  templateUrl: './user-image.component.html',
  styleUrls: ['./user-image.component.css']
})
export class UserImageComponent{

@Input('user')
user : IUser;

@Output('myevent')
userEvent=new EventEmitter<IUser>();

onClicked(user: IUser){
  this.userEvent.emit(user)

}
}
