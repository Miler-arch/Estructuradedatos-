import java.util.Scanner;

public class Ejercicio2{
    //definimos arreglo
    Integer[] vector;
    Scanner scanner;
    //metodo constructor
    public Ejercicio2(){
        this.vector = new Integer[10];
        scanner = new Scanner(System.in);
    }
    public void ejecutar(){
        //llenar el vector segun la condicion
        int i=0;
        while(i < vector.length){
            int numero = scanner.nextInt();

            if(numero >=0){

                i++;
            } else {//si el numero es negativo
                break; //rompé el while
            }
        }

        //mostrar solo los elementos introducidos
        int j=0;
        while(j < vector.length){
            if(vector[j] != null){

                System.out.println("vector[" + j +"]: " + vector[j]);

                j++;

            } else {//si el numero es negativo
                break; //rompé el while
            }
        }
    }
}
