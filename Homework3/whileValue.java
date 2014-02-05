/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
   		System.out.println(args[0]);
int numero=Integer.parsInt(args[0].toString());
if(numero>0){

while(valorActual<numero)
System.out.println(valorActual)
valorActual++;


} else{
   		//si valor actual < args[0]
   			System.out.println("el valor actual es: "+numero);
    } 
   }

}