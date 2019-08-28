import { Injectable } from "@angular/core";
import { USER_DATA } from "../model/mocks";
import {HttpClient} from '@angular/common/http'
@Injectable()
export class DataService{
    getData(){
        return USER_DATA;
    }

    constructor(private httpClient : HttpClient){}

    getRemotedata(){
        this.httpClient.get("http://jsonplaceholder.typicode.com/posts").subscribe(response => console.log(response));
        // return this.httpClient.get();
        // return this.httpClient.get("../model/user-model.json")
    }
}