let line = '';
for(let index = 1; index <= 10; index++){
if(index % 4 == 0){
for(let count = 1; count < 6; count++){
line += index; }
line += ' '
}
}
console.log(line);
