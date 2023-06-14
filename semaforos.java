import java.util.*;
import javax.swing.*;

class semaforos{

	
	public static void main(String[]args){
		
			//definir
	boolean semaforo=false, semaforo2=false, semaforo3=false, semaforo4=false, semaforo5=false;
	int num=4, num2=2, num3=4, num4=6, num5=8, num6=4, tot=0, tot2=0;
		
		System.out.println("");
		System.out.println("INICIA PROGRAMA");
		System.out.println("2020 SISTEMAS OPERATIVOS");
		System.out.println("SEMAFOROS");
		System.out.println("");
		semaforo=true;
		
		
		
	// OPERACIONES CON VARIABLES X
		 
		if(semaforo=true){ //true = signal
			//suma
			System.out.println(" ");
			System.out.println("Suma signal");
			System.out.println(" ");
		System.out.println("Se suma " + num + " y " + num2);
		tot=num+num2;
			
		semaforo=false; // false = wait
		semaforo2=true;
		System.out.println(" ");
		System.out.println("El resultado de la suma es: " + tot);
		System.out.println(" ");
		System.out.println("Suma wait");
		System.out.println("--------------------------------------------------------------------");
		}
		
	
		if(semaforo2=true){
			//resta
			System.out.println(" ");
			System.out.println("Sustraccion signal");
			System.out.println(" ");
			System.out.println("Se realiza la sustraccion " + tot + " y " + num3);
			tot2=tot-num3;
		
			semaforo2=false;
			semaforo3=true;
			System.out.println(" ");
			System.out.println("El resultado de la sustraccion es: " + tot2);
			System.out.println(" ");
			System.out.println("Sustraccion wait");
			System.out.println("--------------------------------------------------------------------");
			
		}
			
			
			
		if(semaforo3=true){
			//multiplicar
			System.out.println("Multiplicacion signal");
			System.out.println(" ");
			System.out.println("Se multiplica: " + tot2 + " y " + num4);
			System.out.println(" ");
			tot=tot2*num4;
			semaforo4=true;
			semaforo3=false;
			System.out.println("El resultado de la multiplicacion es: " + tot);
			System.out.println(" ");
			System.out.println("Multiplicacion wait");
			System.out.println("--------------------------------------------------------------------");
		}
		
		
		if(semaforo4=true){
			System.out.println(" ");
			System.out.println("Sustraccion signal");
			System.out.println(" ");
			System.out.println("Se realiza la sustraccion " + tot + " y " + num5);
			tot2=tot-num5;
			semaforo4=false;
			semaforo5=true;
			System.out.println(" ");
			System.out.println("El resultado de la sustraccion es: " + tot2);
			System.out.println(" ");
			System.out.println("Sustraccion wait");
			System.out.println("--------------------------------------------------------------------");
			
		}
		
		if(semaforo5=true){
			System.out.println("Multiplicacion signal");
			System.out.println(" ");
			System.out.println("Se multiplica: " + tot2 + " y " + num6);
			System.out.println(" ");
			tot=tot2*num6;
			semaforo5=true;
			System.out.println("El resultado de la multiplicacion es: " + tot);
			System.out.println(" ");
			System.out.println("Multiplicacion wait");
			System.out.println("--------------------------------------------------------------------");
			
		}
					}
			}