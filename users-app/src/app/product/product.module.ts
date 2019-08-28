import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {OverviewComponent} from './overview/overview.component';


@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [OverviewComponent]
})
export class ProductModule { }


//not known by angular application , register with app module.ts