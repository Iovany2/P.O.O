Figuras

const triangulo= {
    tipo "Equilatero"
    perimetro:9 
    altura:10 
    base:10
}

const cuadrado = {
    tipo: "Cuadrado",
    altura:4,
    base:4,
}
const circulo = {
    tipo: "Circulo"
    radio:5
}

document.write("<h2>Figuras</h2>");
document.write("Circulo");
document.write("Radio: "circulo.radio+"Circunferencia"+(3.1416*circulo.radio));
document.write("<br>Diamentro: "+(2*circulo.radio));

document.write("<h2>Figuras</h2>");
document.write("Triangulo");
document.write("Radio"+triangulo.radio+""+(3.1416*triangulo.radio));
document.write("<br>Diamentro: "+(2*triangulo.radio));

document.write("<h2>Figuras</h2>");
document.write("Circulo");
document.write("Cuadrado"+cuadrado.radio+""+(3.1416*cuadrado.radio));
document.write("<br>Diamentro: "+(2*cuadrado.radio));
