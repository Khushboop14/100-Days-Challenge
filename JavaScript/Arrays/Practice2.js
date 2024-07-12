//change the array to store final price after applying offer of 10% on each price. 
let price = [250,645,300,900,50]; 
let finalprice = [];
for(let i =0; i<price.length-1;i++){
 let offer = price[i]/10;
 price[i] = price[i]-offer;
}
console.log("price after discount",price);

