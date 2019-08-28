import {Routes} from '@angular/router';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { UsersComponent } from './Users/users.component';
import { OverviewComponent } from './product/overview/overview.component';

// step2:configure routes

export const APP_ROUTES : Routes=[{
    path : "",
    redirectTo : "/login",              //http://localhost:4200
    pathMatch: 'full'
},{
    path : "login",
    component : LoginComponent        //http://localhost:4200/login
},{
    path : "register",
    component: RegisterComponent      //http://localhost:4200/register
},{
    path : "users",
    component: UsersComponent         // //http://localhost:4200/users
},{
    path : "pipes",
    component: PipeDemoComponent       //http://localhost:4200/pipes
},{
    path : "overview",
    component: OverviewComponent       //http://localhost:4200/pipes
},{
    path : "**",
    redirectTo : "/login",
    pathMatch: 'full'                   //http://localhost:4200/notexist
}]

