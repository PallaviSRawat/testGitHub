


//ForEach // find //findIndex //reduce //filter //some //every //map 

var user ={
	firstname : "Foo",
	lastname : "Bar",
	sayHello : function(){
		var self=this;
		function nestedFunc(){
		// return "hello " + self.firstname +" " + self.lastname;    //preserved ref through self
		return "hello " + this.firstname +" " + this.lastname;   //this lost the refernce inside the nested function

	}
	return nestedFunc();
}
}

console.log(user.sayHello());
//or ES6

var user ={
	firstname : "Foo",
	lastname : "Bar",
	sayHello : function(){
		var nestedFunc=() => "hello " + this.firstname +" " + this.lastname    //preserved ref through arrow function
	return nestedFunc();
}
}

console.log(user.sayHello());

//to be done - these r all iterator functions
var numbers =[2,3,4,5,6];
var num = numbers.filter(value => value > 4);
console.log(num)

//ARROW FUNCTION

//ES5
var numbers =[2,3,4,5,6];

var newArr = numbers.map(function(value){
	return value *2;
})  //called an iterator function for thw array

console.log(newArr);

//ES6
var newArr1 = numbers.map(value => value*3);
console.log(newArr1);

var newArr1 = numbers.map(value => {
	return value*4;});
console.log(newArr1);

var newArr1 = numbers.map((value,i) => {
	console.log(i);
	return value*3
});
console.log(newArr1);





//closures in JS

// function buildTicket(transport){
// 	var numOfPass=0;
// 	return function(name){
// 		return "Hello Mr. " + name + "\nYou are going via "+ transport + "\n Your ticket ID #" + (++numOfPass);
// 	}
// }


// var ship = buildTicket("ship");
// console.log(ship("Foo"));
// console.log(ship("bar"));

// var air = buildTicket("air");  //all such declarations have own copy of variables bound to funvtions
// console.log(air("Baz"));

// console.log(ship("Abc"));





// //static in javascript

// function testClosure(){
// 	var x=4;

// 	return function(){
// 		return ++x;
// 	}
// }

// console.log(testClosure()());    //5
// console.log(testClosure()());    //5

// var nestedFunc = testClosure();
// console.log(nestedFunc());     //5
// console.log(nestedFunc());    //6 , value persist like static in java




// //function is a value in java script
// var addition=function add(n1,n2){   //function expression
// 	return n1+n2;
// }
// function add(n1,n2){    
// 	return n1+n2;
// }
// var addition=function (n1,n2){  //anonymous function
// 	return n1+n2;
// }
// console.log(add(3,5));   //calls the second one not the first one
// console.log(addition(3,5));
// console.log(addition);  //variable -function body

// //function nesting

// function mystery(){
// 	function chooseNumber(){
// 		return 7;
// 	}
// 	return chooseNumber;
// 	function chooseNumber(){
// 		return 12;
// 	}
// }
// function mystery2(){
// 	var chooseNumber=function chooseNumber(){
// 		return 7;
// 	}
// 	return chooseNumber;
// 	var chooseNumber=function chooseNumber(){
// 		return 12;
// 	}
// }
// console.log(mystery());   // returns function body of chooseNumber
// var nestedFunc=mystery();
// console.log(nestedFunc());

// console.log(mystery2());   // returns function body of chooseNumber
// var nestedFunc=mystery2();
// console.log(nestedFunc());





//NoN blocking behaviour of Java Script





// function longRunningOperation(){
// 	setTimeout(function(){
// 		console.log("Running ........");
// 	},3000)
// }
// function WebRequest(req){
// 	console.log("Starting with ID #", req.id);
// 	longRunningOperation();
// 	console.log("Ending with ID #", req.id);
// }

// WebRequest({id:1})
// WebRequest({id:2})






// var x="20"
// var y=10
// var z=20
// console.log(typeof x);
// x=true

// console.log(typeof x);    // at runtime java script can change the type
// console.log(x===z); //check type
// console.log(x==z); //check value
// console.log(x+y);
// console.log(x-y);
//node nodedemo.js


// primitives and references type variables