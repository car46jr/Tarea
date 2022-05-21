package prograi;

import java.util.Scanner;

public class PrograI {
        static int select = -1; //opción elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola munda con Java");
        Scanner scanner1 = new Scanner(System.in);
        Calculadora calculadora1=new Calculadora();
        //System.out.println(calculadora1.sumar(5, 10));

        Calculadora otraCalculadora = new Calculadora();
        
        /*System.out.println(otraCalculadora.sumar(8, 9));
        System.out.println(otraCalculadora.restar(10, 3));
        System.out.println(otraCalculadora.multiplicar(5, 3));*/
        //System.out.println(otraCalculadora.getMarca());
        //System.out.println(otraCalculadora.getTipo());
        //System.out.println(otraCalculadora.getAnchoPantalla());
        //Scanner sc= new Scanner(System.in);
       // System.out.println("Ingrese el color de la calculadora");
        //String valorRecibido = sc.nextLine();

        /*otraCalculadora.setColor(valorRecibido);
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());
        otraCalculadora.setColor("Azul");
        System.out.println("El color de la calculadora es: " + otraCalculadora.getColor());*/

        CalculadoraEspecial calculadoraNueva = new CalculadoraEspecial();
        System.out.println(calculadoraNueva.getTipoCalculadora());

        CalculadoraEspecial calculadora4 = new CalculadoraEspecial("Calculadora del mundo de a 3");
        System.out.println(calculadora4.getTipoCalculadora());
        
        CalculadoraEspecial calculadora5 = new CalculadoraEspecial("Calculadora del Bazar Chino", 100);
        System.out.println(calculadora5.getTipoCalculadora() + " con " + calculadora5.getNumeroDeTeclas()+ " teclas");
        /*calculadora1.sumar(5, 10);
        calculadora1.restar(15, 5);
        calculadora1.restar(1000, 500);
        calculadora1.sumar(100, 50);
        calculadora1.dividir(100, 4);
        calculadora1.sumar(5, 10);
        calculadora1.restar(15, 5);
        calculadora1.restar(1000, 500);
        calculadora1.sumar(100, 50);
        calculadora1.dividir(100, 4);
        calculadora1.sumar(5, 10);
        calculadora1.restar(15, 5);
        calculadora1.restar(1000, 500);
        calculadora1.sumar(100, 50);
        calculadora1.dividir(100, 4);
        calculadora1.sumar(5, 10);
        calculadora1.restar(15, 5);
        calculadora1.restar(1000, 500);
        calculadora1.sumar(100, 50);
        calculadora1.dividir(100, 4);*/
         
       
        
		//Mientras la opción elegida sea 0, preguntamos al usu
		while(select != 0){
                    
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("""
                                  Elige opcion de la Clase 1:
                                  1- Suma
                                  2- Resta
                                  3- Multiplicacion
                                  4- Dividir
                                  5- Factorial
                                  6- Raiz
                                  7- Resultados""");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner1.nextLine()); 
	
				//switch case para menu de las clasess
				switch(select){
				case 5 -> {
                                    ingresar();
                                    System.out.println("El factorial del numero " + num1+ " es " + Calculadora.factorial(num1));
                                }
                                case 1 -> {
                                    ingresar();
                                    calculadora1.sumar(num1, num2); 
                                    System.out.println(num1+num2);

                                }
                                case 2 ->{
                                    ingresar();
                                    calculadora1.restar(num1,num2);
                                    System.out.println(num1-num2);
                                }                              
                                case 3 -> {
                                   ingresar();
                                    System.out.println(Calculadora.multiplicar(num1, num2));
                                }
                                 case 4 -> {
                                    ingresar();
                                    calculadora1.dividir(num1,num2);
                                     System.out.println(num1/num2);
                                }
				 case 7 -> {
                                    calculadora1.mostrarTransacciones();        

                                }
                                 case 6 ->{
                                 ingresar();
                                        double raiz;
                                    System.out.println(raiz =(double)Math.sqrt (num1));
                                 
                                 }

				
				
				}
				
				System.out.println("\n");
				
			}catch(NumberFormatException e){
				System.out.println("Error");
			}
		}

	}
	
	//Método para recoger variables por consola
	public static void ingresar(){
                    Scanner scanner1 = new Scanner(System.in);

		System.out.println("Introduce el Primer digito:");
		num1 = Integer.parseInt(scanner1.nextLine());
                num2 = Integer.parseInt(scanner1.nextLine());


		//Mostrar un salto de línea en Java
		System.out.println("\n");
    }
    }
    
