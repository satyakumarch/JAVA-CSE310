// const arr=[..."satya"];
// console.log(arr);

const { CommandStartedEvent } = require("mongodb");

// const numbers=[1,2,3,4,5];
// numbers[100]=500;
// console.log(numbers);

// function abc(){
//     console.log(abc.xyz);
// }
// abc();
// abc.xyz=400;
// abc.xyz=200;
// abc();

    
//  console.log(parseInt('10+2'));
//  console.log(parseInt('7FM'));
//  console.log(parseInt('M7F'));
//  console.log(isNaN("satya"));

// console.log([1,2].map(num=>{
//     if(num>0 )return ;
//     return num*2;
// }))
// "use strict";
// {
//     function abc(){
//         console.log('Praveen');
//     }
// }
// abc();

const arr=[1,2,3,4,5,6,7,8];
const newArr=arr.find((num)=>num>4);
const newArr1=arr.filter((num)=>num>4);
const newArr2=arr.map((num)=>num>4);
console.log(newArr);
console.log(newArr1);
console.log(newArr2);