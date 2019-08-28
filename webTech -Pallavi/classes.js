class Student{
	constructor(fname,age){
		this.fname = fname;
		this.age = age;
	}

	sayHello(){
		console.log("Hello, I'm "+ this.fname);
		console.log(`Hello I am ${this.fname}`)
	}
}

let foo =new Student("Foo" , 32);
foo.sayHello();

//typescript in Angular
//any,void,enum , string, num, boolean, date, classes