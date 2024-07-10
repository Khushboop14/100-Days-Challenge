// Comments in JS: for single line comment " // "  and this is a multiple line comment "/*  */"
// Arithmetic Operators: +,-,*,/, %, **(a^b, power of), ++(increment), --(decrement)

console.log("Arthimetic Operators: ");
let a = 5;
let b = 2;
let c = a+b;
console.log("a=", a ,"b=", b )
console.log("a+b : ", c);
console.log("a-b : ", a-b);
console.log("a*b : ", a*b);
console.log("a/b : ", a/b);
console.log("a%b : ", a%b);
console.log("a**b : ", a**b);
console.log("a++ (a+1): " , a++);
console.log("a-- (a-1): " , a--);

//Unary operator: 
console.log("Unary Operators: ");
let d = 4;
console.log("d:", d++);
console.log("d:", d--);
console.log("d:", --d);
console.log("d:", ++d );

/* comperison Operators:
1. equal to ==
2. equal to and type === (same content and their data type.)
3. not equal to !=
4. nor equal to and type ===
5. <=
6. >=
7. 
*/
let age1 = "5";
let age2 = 5;
console.log("age1 : ", age1 , "and age2 : ", age2);
console.log("equal to (==) operator : ", age1 == age2);
console.log("equal to and type (===) operator : ",  age1 === age2);

/*Logical operator: 
1. AND (&&) both condition must be true
2. OR (||) any one condition must be true
3. NOT (!) 
*/
console.log("Logical operator");
console.log("cond1 && cond2", a<b && a == 6);
console.log("cond1 || cond2", a<b || a ==6);
console.log("!(6<5) ", !(6<5));//it should be true but the NOT operator will output false.