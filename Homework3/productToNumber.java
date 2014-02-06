/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int resultado = 1;
   		System.out.println(args[0]);

int numero=Integer.parseInt(args[].toString());

if(numero>0){
for(int inicio=1;inicio<=numero;inicio++){

	System.out.print(inicio);
	resultado*=inicio;  		
if(inicio<numero)
{
System.out.print(" x ");
}
}
System.out.println("el producto es: "+" = "+resultado);



} else {

System.out.println("No ingresar numeros negativos");
}




      
   }

}