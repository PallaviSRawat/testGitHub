function demo(name,...args){
	console.log(args[0])
}

demo("foo",32)
demo("foo",32,true);


let f=[1,2,3,4]
let mf=[4,7,...f]
console.log(mf)


//template string
//multi line and expression
let username="FOO";

console.log(`hello multi
	mt${username}`)