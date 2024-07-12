let gameNumber = 29;
let usernum = prompt("enter number from 0-29");
while(usernum != gameNumber){
usernum = prompt("you entered wrong number, enter again: ");
}
console.log("Congratulations! ", usernum);