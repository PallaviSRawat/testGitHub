function demo(arr){
	if(arr.length >2){
		var load="LAOD"
		// console.log(flash);
	}else{
		var flash = "FLASH"
	}
}

demo([1,2,3,4]);
// console.log(load);

const action="ACTION";
action = "New Value";

//const is ref type hence we are able to change the value

const USER ={
	firstname: "FOO"
}
//fetches error
// USER={
// 	firstname: "BAR"
// }

user.firstname="BAR"; //ok

user=Object.freeze()