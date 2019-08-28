let arr=["foo","bar","bam","baz"]

let [arr1,arr2,arr3,arr4]=arr;
console.log(arr3); //bam

let [,ar3,ar4] = arr;  //very useful in array of objects

console.log(arr3); //bar

//object destructuring

// let user={
// 	firstname: "Foo",
// 	lastname: "Bar",
// 	getFullName : () =>{
// 		return this.firstname + " " + this.lastname
// 	}
// }

let user={
	firstname: "Foo",
	lastname: "Bar",
	getFullName : function(){
		return this.firstname + " " + this.lastname
	}
}
let {lastname, getFullName} =user;  //inside the curly braces should match the actual name of object components


//adv: code shortened, immutability, can bind the reference of the object calling the function
console.log(getFullName());  //ref of this lost ...therefore undefined ...func called by node runtime env
console.log(lastname);

//bind the function to an object

let newUser={
	firstname: "NewUser FirstName",     //this name of property should be same as that in user ,else borrowing won't work
	lastname: "NewUser LastName",
}

//function borrowing
let boundFunc=getFullName.bind(newUser);
console.log(boundFunc());

// let {lname: "lnae",Lastname} =user;
// console.log(lname);


let user2 = {
	name : "Foo",
	address : {
		street : "201 street",
		city : "Delhi"
	},
	friends : ["bar","Bam","Baz"]
}


let {name, address, friends} =user2;
console.log(name);
console.log(friends);
console.log(address);

let{street,city}= address;
console.log(street);
console.log(city);

let[,,arrrr3]=friends;
console.log(arrrr3);
