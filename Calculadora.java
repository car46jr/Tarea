package prograi;

public class Calculadora {
    //area de atributos
    private String tipoCalculadora;
    private int cantidadDeTeclas;
    private int anchoPantalla;
    private String color;
    private String marca;
    private int ancho;
    private int alto;
    private String[] vectorTransacciones;  //declaracion de un vector.
    private int indiceVector;


    //constructor - sirve para iniciarlizar variables y recursos de la clase
    public Calculadora(){
        this.tipoCalculadora="Calculadora Básica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
        vectorTransacciones= new String[10000000];//inicializo el vector
        this.indiceVector=0;
    }
    //metodos
    public double sumar(double primerNumero, double segundoNumero){
        double resultado = primerNumero+segundoNumero;
        this.registrarTransaccion("suma", primerNumero, segundoNumero, resultado);
        double resultado1 = 0;
        return resultado1;
    }

    public double restar(double primerNumero, double segundoNumero){
        double resultado = primerNumero-segundoNumero;
        this.registrarTransaccion("resta", primerNumero, segundoNumero, resultado);
        double resultado2 = 0;
        return resultado2;
    }

    public double dividir(double primerNumero, double segundoNumero){
        double resultado = primerNumero/segundoNumero;
        this.registrarTransaccion("dividir", primerNumero, segundoNumero, resultado);
        return primerNumero/segundoNumero;
    }

    public static double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }
     public static int factorial(int ingresar ) {
      int fact = 1;
      for( int i = 1; i <= ingresar; i++ ) {
         fact *= i;
      }
      return fact;
      
}
     public double raiz(double num){
      this.registrarTransaccion("raiz", num, (double)Math.sqrt (num) );
        double raiz;
      return raiz =(double)Math.sqrt (num);   
    }

    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return this.tipoCalculadora;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setColor(String cualquierColor){
        this.color=cualquierColor;
    }

    public String getColor(){
        return this.color;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }    

    public void registrarTransaccion(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector= indiceVector+1;
        vectorTransacciones[indiceVector]= primerParametro+ " "+  tipo +" "+segundoParametro+" resultado: "+resultado;
        
    }
    
    
    public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("\n // otra forma de recorre el vector // \n");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                    System.out.println(transaccion);
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }

    private void registrarTransaccion(String raiz, double primerNumero, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}