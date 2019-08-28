import { Component, OnInit } from '@angular/core' //helps make it a components once imported from core
import { IUser } from '../model/user';
import { DataService } from '../services/data.service';
// import { userInfo } from 'os';
@Component({
  selector: 'app-users',
  templateUrl : './users.component.html'
})
// export class UsersComponent {
//     user:IUser={
//         firstName : "Bill",
//         lastName: "Gates",
//         dob : new Date("Dec 21, 1964"),
//         income : 50000,
//         company : "Mirosoft",
//         image : '../assets/Desert.jpg',
//         vote: 120
//     };
export class UsersComponent implements OnInit{
    
    users:IUser[];
        // users:IUser[]=[{
        //     firstName : "Bill",
        //     lastName: "Gates",
        //     dob : new Date("Dec 21, 1964"),
        //     income : 50000,
        //     company : "Mirosoft",
        //     isWorking : true,
        //     image : '../assets/Desert.jpg',
        //     vote: 120
        // },{
        //     firstName : "Tim",
        //     lastName: "Gates",
        //     dob : new Date("Dec 21, 1964"),
        //     income : 0,
        //     company : "Mirosoft",
        //     isWorking:false,
        //     image : '../assets/Desert.jpg',
        //     vote: 120
        // },{
        //     firstName : "Martha",
        //     lastName: "Gates",
        //     dob : new Date("Dec 21, 1964"),
        //     income : 50000,
        //     company : "Mirosoft",
        //     isWorking: true,
        //     image : '../assets/Desert.jpg',
        //     vote: 120
        // }]
    moreInfo(){
        alert("clicked");
    };
    moreInfo3(u : any){
        alert(`Mr. ${u.firstName} is working in ${u.company}.`);
    }
    moreInfo2(u : IUser){
        alert(`Mr. ${u.firstName} is working in ${u.company}.`);
    }

    constructor(private dataService : DataService){}
    
    ngOnInit(){
        this.users= this.dataService.getData();
        this.dataService.getRemotedata();
        // .subscribe( response => this.users =response['userdata']);
    }
}

