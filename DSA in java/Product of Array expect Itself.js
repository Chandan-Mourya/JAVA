function runProgram(input){
    input=input.trim().split("\n")
    let tc=+input[0]
    let line=1;
    for(let i=0; i<tc; i++){
        let n=+input[line++]
        let arr=input[line++].trim().split(" ").map(Number)
        chandan(n,arr)
        //console.log(n,arr)
    }
    
}
function chandan(n,arr){
    let left=new Array(n);
    let right=new Array(n);
    let output=new Array(n);
    
     left[0]=1;
     right[n-1]=1;
    
    for(let i=1; i<n; i++){
        left[i]=left[i-1]*arr[i-1];
    }
    for(let i=n-2; i>=0; i--){
        right[i]=right[i+1]*arr[i+1]
    }
    for(let i=0; i<n; i++){
        output[i]=left[i]*right[i];
    }
    console.log(output.join(" "))
    
    
}

 

if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
