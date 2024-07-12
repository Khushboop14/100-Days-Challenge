/* loops:
1. for loop:
2. while loop:
3. do while loop:
4.for-of loop:
5. for-in loop;
*/

//for loop:
console.log("ForLoop");
for(let i =0; i<6; i++){
    console.log("hello world! ")//it will print "hello world!" on console 6 times(0-5)
    }

//while loop:
console.log("WhileLoop");
let i = 5;
while(i != 0){
    console.log("not yet",i);
    i--;
}

//do-while loop: this loop run atleast one time, because the conditions checked at last.
let j =0;
console.log("do-whileLoop");
do{
    console.log("print khushboo while j become zero");
}while(j != 0);

//for-of loop: to iterate on array and string data types, we do not need to initialize of update var like for loop.: 
let str = "khushbooParmar"
let length  = 0;
for(let i of str){
    console.log("i=",i);
    length++;
}
console.log("string length is:", length);

//for-in loop: use for objects and array, key pair values the iterator i will always return keys:
let student ={
    fName : "khushboo",
    age : 23,
    cgpa : 8.6,
}
for(let i in student){
    console.log(i);// fName, age, cgpa;
    console.log("key=", i, "value=", student[i]);
}
