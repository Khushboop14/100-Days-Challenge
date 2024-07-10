//Conditions: if else
let maths = 55;
let science = 60;
let hindi = 50;
let english = 44;
let marks = 100;
let totalMarks = maths+science+hindi+english;
if(totalMarks >= 65){
    console.log("first division");
}
else if(totalMarks >30 && totalMarks < 65){
    console.log("second division");
}
else {
    console.log("fail")
}

// Ternary Operatore: condition? true output : false output;
console.log("Ternart Operator")
totalMarks == 100 ? console.log("AIR1") : console.log("fail");

//User Input: 
alert("hello"); //one time popup
let p = prompt("Enter a number");//this also give popup bur also take input
if(p%5 ==0){
    console.log(p, "is multiple of 5");
}
else{
    console.log(p, "is not multiple of 5");

}