import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule , ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import {UsersComponent} from './Users/users.component';
import { UserInfoComponent } from './Users/user-info/user-info.component';
import { UserImageComponent } from './Users/user-image/user-image.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { NationalCodePipe } from './pipes/national-code.pipe';
import { DataService } from './services/data.service';
import {RouterModule} from '@angular/router';
import { APP_ROUTES } from './app.routes';
import { ProductModule} from './product/product.module';
 //step3: link routeModule to routes array
@NgModule({
  declarations: [
    AppComponent, UsersComponent, UserInfoComponent, UserImageComponent, LoginComponent, RegisterComponent, PipeDemoComponent, NationalCodePipe
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule, HttpClientModule,RouterModule.forRoot(APP_ROUTES), ProductModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
