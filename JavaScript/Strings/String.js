/* Strings is sequence of character: 
Strings are immutable, hence the orignal string can never be manipulate.
methods of strings:
- toUpperCase()
- toLowerCase()
- trim(): trim the whitespace. 
- slice(start,end):  substring.
- str1.concat(str2
- str.replace(searchVal, newVal)
- str.charAr(idx)
*/

let str = "khushbooParmar.";
let len = str.length;
str[0],str[1],str[2];
console.log("string:", str , "\nlength of string: ", len ,"\nindex(8): ", str[8]);

/*Template Literals: 
- it is used to print both variable and string simultanously ,it is a write into backstiricks ``.  
- it is a way to embedded expression in strings. this is called STRING INTERPOLATION.
`string text ${expression}string text` value calulate and then showed as output.
*/

let specialString = `String ${str} has length of ${str.length} and at index 0 ${str[0]} character`;
console.log(specialString);


/*
- \n : new line
- \t : tab
length if escap character is counted as 1.
*/

