// console is used print output on console. 
console.log("khushboo");

//=================== *variables:* we dont need tp define datatype to variables. ====================  
/* "=" this is called assignment operator which assign value to variables.
 Variable Rules: 
 1. Variable name are case sensative: a and A are different
 2. Only letters, digits, underscore(_) and $ is allowed. (not even space)
 3. First character of variable should be an letter, underscore, or $ only.
 4. Reserved words can not be variable names. (eg: if, else, console etc).
conventions: we use only camel style for variables. (fullName, helloWorld, etc).
*/

fName = "Khushboo is the best!!!";
CGPA = 7.96;
agr = 22;
y = undefined; //dont know what is the value.
x = null; // it is emplty value.
isFollow = true;
console.log(fName);
console.log(agr);
console.log(CGPA);
console.log(x);
console.log(y);
console.log(isFollow);

/* 
Define variable: 
1. var = variable can be re-declared and updated, A global scope variable.(not recommand to define variavle with "var")
2. let = variable can not be re-declared but can be updated. A block scope {} variable.
3. const = variabe can not be re-declared or updated, A block scope variable. this variable must be initialized.
*/

let  fullName = "khushboo parmar"; 
fullName  = "viraj";
const schoolName = "DMPS";//fixed it can not be change. 
console.log(fullName);
console.log(fullName);
console.log(schoolName);

// this is block
{
// collegeName is scope variable this variable can not be acessed out of block
    let collegeName = "CDGI"
    console.log(collegeName);
}

/*
 Data type in JS: 
 1. Primitive data type: number, string, boolean, undefined, null (it is type of object), bigInt, symbol
 2. Non-Primitive data type: objects(collections of values, key : value ): Arrays, functions etc .
 we can not update constant variable but we can change the keys of the constant objects. 
*/
console.log(typeof fullName);
const student ={
    fullName : "khushboo Parmar",
    department : "engineering",
    branch : "CSE",
    cgpa : 8.97,
    isPass : true,
};
student["cgpa"] = student["cgpa"]+1;
console.log(" ------------ ARRAY CONCEPT ---------");
console.log(student);
console.log(student["cgpa"])