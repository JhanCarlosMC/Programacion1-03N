//Santiago Gonzales
//Jhon Morales
//Jose Barrera
//Miguel Diaz

public class Main {
  public static void main(String[] args) {
    String nombre = "Santiago";
    int edad = 18;
    boolean mayorEdad = true;


//    System.out.printf("Hello " + "and welcome! \n"+"Hello " + "and welcome! \n");

    //comparacionNumeros();
    tablaMultiplicar();
  }

  public static void comparacionNumeros(){
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    String resultado;

    if(num1 == num2 && num2 == num3){
      resultado = "Todos son iguales";

    }else if(num1 > num2 && num1 > num3){
      resultado =  "El mayor es: "+ num1;

    }else if(num2 > num1 && num2 > num3){
      resultado =  "El mayor es: "+ num2;

    }else {
      resultado =  "El mayor es: "+ num3;

    }
    System.out.println(resultado);
  }

  public static void tablaMultiplicar(){

    int numSeleccionado = 6;

    for(int i = 1; i <=10; i++){
      System.out.println(numSeleccionado +" * "+i + " = " + numSeleccionado*i ) ;
    }
  }
}

//Operadores Logicos
//AND -> &&
//OR -> ||
//NOT -> !

//Convenciones

//SnakeCase = mayor_edad; nombramiento de variables
//KebabCase = mayor-edad; nombramiento de variables

//CamelCase = mayorEdad; nombramiento de variables/metodos en java
//PascalCase = MayorEdad; nombramiento de clases java
//toLowerCase = mayoredad; nombramiento de paquetes java
