//Arrays are collections of items in linear.Array is object type. arrays are mutable.
let marks = [13, 55, 67, 87,99988,4556,22];
marks.pop();
console.log(marks,marks.length,marks[0]=555);
console.log("marks tostring",marks.toString());


//print all element of array: 
console.log("for loop")
for(let i = 0; i<= marks.length-1; i++){
console.log(marks[i]);
}

console.log("for-of loop")
for(let i of marks){
    console.log(i);
}

/**
 * Methods in arrays: 
 * push()- add to end
 * pop()- delete from end andd reutrn 
 * toStrign()-converts array to string
 * 
 */
console.log("Array Methods");
console.log("marks tostring",marks.toString());
console.log("marks concate",marks.concat(234566));
console.log("marks unshift: it is used to add element at start of the array:", marks.unshift(100000), marks);
console.log("marks shift: it is used to delete element from star of the array",marks.shift(100000), marks);
console.log("marks slice: it doesnot change in orignal array, it is used to retrive sub-array:", marks.slice(2,5), `orignal array: ${marks}`);
console.log("marks splice: it change in orignal array, it is used to retrive sub-array: we can Add, Delete, replace from this method.", marks.splice(), `orignal array: ${marks}`);
