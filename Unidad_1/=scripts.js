//output
//window.alert("Hola mundo");
//document.getElementsByTagName("p").innerHTML=("texto por innerHTML");  //manera inner
//document.write("Si");//manera 
//console.log("Una manera por medio de la consola");//Inspeccionar/consola.Una manera por medio de la consola

//window,onload()=function(). No se pa que jala
//<br> salto de pagina 

//____________________________________________________________________________________________________________
//Declaracion de variables
// let x,y,z;
// x=5;
// y=7;
// z=x+y;
// document.write(z);
// console.log(z);
// window.alert(z);
/*x="Hola mundo";
document.write("<br>"+y+x+);*/

//Bucle y decisiones

// for( let i=0;  i<10; i++){

// window.alert("Hi guy "+i);
// // }
// // document.write("<br> while<br>")
// // let j=0;
// // while (j<5){
// //     document.write("<br >Dicen"+j);
// //     j++;
// // }
// //break Romper bucle pa

// /*_____,While,for y Switch_case_______________________________________________________________________________*/

let resp="si";
while(resp=="si") {
    let nombre=prompt("Escribe el nombre: ");
    let sexo=prompt("Sexo (H/M)");
    let edad=prompt("Rango de edad (1: 0 a 13: (2 14 a 21; (3: 22 en adelante):");

    if(sexo=="H"){
        switch(edad){
          case "1" :
            window.alert("Vallase al parque ");
            break;
            case "2": window.alert("Haga ejercicio padrino:");
                        break;
            case "3":
                window.alert("Pongase a jalar:");
        }
    } else if (sexo=="M"){
        switch(edad){
            case "1" :
              window.alert("Vallase al parque:");
              break;
              case "2": window.alert("Te recomiendo hacer actividad fisica:");
                          break;
              case "3":
                  window.alert("Consigue un trabajo:");
          }

    }else{
            window.alert("Ta tonto o que padrino ingrese bien el dato");
        }
        resp = prompt("¿Quieres registrar a otra persona?");
    }

//     // |Areglos y for________________________________________________________________________________________________________________|

//     // let apoo2q=["juan","Pedro","Yuna","El kirito xd"];

//     //     for(let i=0; i<apoo2q.length; i++){

//     //     document.write("<br>"+(i+1)+ ", "+apoo2q[i]);
//     //     if (i==2){
//     //     apoo2q [i]="Angel";
//     //     document.write("<br> El nombre cambio, ahora es: "+apoo2q[i]);
//     //     }
//   // }
// //|______Funciones_______|

// // function saludo(){
// //     alert("Hola mundo");

// // }
// // function despedida(){
// //     document.write("Camara pues.");
// // }

// // saludo();
// // despedida();

// //Calculadora basica

// function suma(a,b){
//     alert("la suma de "+a+"+"+b+(a+b));
// }
// function  resta(a,b){
//     alert("La resta de "+a+"-"+b+(a-b));
// }
// function multilicacion(a,b){
//     alert("La multiplicacion de"+a+"X"+b+(a*b));
// }
// function division(a,b){
//    alert("La divison de"+a+"entre"+b+(a/b));
// }
// let a,b;
//   let resp="si";
//   while(resp=="si"){
// opc=prompt("Que operacion deseas realisar: (1-suma(2-resta(3-multiplicacion(4-division");
// switch(opc){
//     case "1":
//          a=parseInt (prompt("Ingresa el primer numero"));
//          b=parseInt (prompt("Ingrese el segundo numero"));
//        suma(a,b); 
//        break;
//        case "2": 
//         a=parseInt (prompt("Ingresa el primer numero"));
//         b=parseInt (prompt("Ingrese el segundo numero"));
//        resta(a,b);
//        break;
//        case "3":
//          a=parseInt (prompt("Ingresa el primer numero"));
//          b=parseInt (prompt("Ingrese el segundo numero"));
//         multilicacion(a,b);
//         case "4": 
//          a=parseInt (prompt("Ingresa el primer numero"));
//          b=parseInt (prompt("Ingrese el segundo numero"));
//         division(a,b);
//         break;
//         default:
//             alert("No valida");
// }
    
// resp=prompt("Quieres realizar otra operacion (si/no):")
// }