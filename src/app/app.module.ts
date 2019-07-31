import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import {UsersComponent} from './Users/users.component';
import { UserInfoComponent } from './Users/user-info/user-info.component';
import { UserImageComponent } from './Users/user-image/user-image.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent, UsersComponent, UserInfoComponent, UserImageComponent, LoginComponent
  ],
  imports: [
    BrowserModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
