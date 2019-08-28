// //promises - to handle the asynchronous behaviour of javascript
// //promise object takes a callback function
// var promise=new Promise((resolve,reject)=>{
// 	setTimeout(()=>{
// 		// resolve("here comes the data");
// 		reject(new Error("bad happened!"))
// 	},3000);
// });

// promise.then(response => console.log(response))
// 	.catch(err => console.log(err));



//delay to return a promise after 3 seconds so that we can add a then to it

function delay(ms){
	var promise=new Promise((resolve,reject)=>{
		setTimeout(()=>{
			resolve("resolved");
			// reject(new Error("Bad thing happened."))
		
		},ms);
	});
	return promise;
}

delay(3000).then(()=> console.log('runs after 3 seconds'));