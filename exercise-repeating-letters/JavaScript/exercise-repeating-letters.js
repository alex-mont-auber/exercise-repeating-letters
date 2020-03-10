
// START FASE 1

const MyName = ['A','l','e','x','a','n','d','r','e'];

var count = 0;

console.log(MyName);

MyName.forEach(e => {
    console.log("- " + e);
    count++;
});

// END FASE 1

// START FASE 2

const NumbersList = ["1","2","3","4","5","6","7","8","9","0"];

console.log("Total number of letters: " + count);

for(e = 0; e < MyName.length; e++){
    for(i = 0; i < NumbersList.length; i++){
        if(MyName[e] === NumbersList[i]){
            console.log("En los nombres de personas no existen numeros!");
        }
    }
    if(MyName[e] == "a" || MyName[e] == "e" || MyName[e] == "i" || MyName[e] == "o" || MyName[e] == "u"){
        console.log("It's a vocal");
    } else {
        console.log("It's a consonant.");
    }
} 

// END FASE 2

// START FASE 3 -> Consultar ejercicio map() de JavaScript

const MyNameInMap = [
    { Repeated: 2, letter: "A" },
    { Repeated: 1, letter: "l" },
    { Repeated: 2, letter: "e" },
    { Repeated: 1, letter: "x" },
    { Repeated: 2, letter: "a" },
    { Repeated: 1, letter: "n" },
    { Repeated: 1, letter: "d" },
    { Repeated: 1, letter: "r" },
    { Repeated: 2, letter: "e" }
    ];

// END FASE 3

// START FASE 4

const MySurname = [' ','M','o','n','t','s','e','r','r','a','t'];

console.log(MyName + MySurname);

// END FASE 4