/*

6. (20 minutos) Escribe un programa que muestre por pantalla la lista de los N
primeros números primos. Realiza una función que reciba N, devuelve un
array conteniendo los N primeros números primos y posteriormente
imprima el array en el main.

7. (15 minutos) Escribe un programa que lea un número entero de teclado, lo
guarde en una variable, lo envíe a una función que lo descomponga en factores
primos, y dicha función devuelva un array que contenga los factores primos.
Posteriormente imprima el array en el main. ; por ejemplo 40 = 2 * 2

8. (20 minutos) Empleando un array, escribir un programa que pida al usuario
números enteros hasta que se introduzca el número 0. A continuación, calcular
la media, el mínimo y el máximo de los datos introducidos. Utilice funciones
independientes para: a) recibir N números enteros por teclado hasta que el
usuario introduzca un 0; b) Calcule la media de los elementos de un array; c)
calcule el mínimo de los elementos de un array; y d) Calcule el máximo de los
elementos de un array.

9. (15 minutos) Escribir un programa que solicite al usuario dos vectores de N
elementos y que imprima su producto escalar. Utilice un array para representar
el vector de N elementos. Realice la entrada de usuario por teclado en una
función que reciba las dimensiones del vector a la que se invoca dos veces
(una por vector) y otra función que calcule el producto escalar recibiendo dos
arrays que representan dos vectores.

10. (15 minutos) Escribir un programa que rellene una matriz cuadrada (las
dimensiones de la matriz serán un parámetro que se pida al usuario) con
números aleatorios de tal modo que la matriz sea simétrica. Imprimir la matriz
por pantalla. Realice todo en una única función a la que se llama desde el
main.

11. (20 minutos) Escribir un programa que multiplique dos matrices. Sus
dimensiones y valores deben de solicitarse al usuario por teclado y tras realizar
la multiplicación debe visualizarse en pantalla ambas matrices y el
Página 4
resultado de la multiplicación. Cree una nueva función similar al ejercicio 9
pero que recibirá vectores de varias dimensiones. Realice otra función
multiplicar matrices que reciba dos arrays de dos dimensiones que representan
2 vectores y devuelva otro array de dos dimensiones que contenga su
multiplicación. En caso de no ser compatibles las dimensiones la función
indicará que ha habido un error.

12. (15 minutos) Escribe un programa que acepte una cadena de caracteres (que
podrá contener cualquier carácter a excepción del retorno de carro) y que diga
cuántas vocales contiene. Realice la entrada de teclado en una función
(lectura de una string) y el cálculo de vocales de una string en otra función
independiente que reciba una string y devuelva un entero.

13. (15 minutos) Escribe un programa que acepte una cadena de caracteres (que
podrá contener cualquier carácter a excepción del retorno de carro) y que la
escriba al revés. Reutiliza la función del ejercicio para la entrada de teclado y
otra función que invierta la cadena.

14. (20 minutos) Escribe un programa que lee una cadena de caracteres de teclado
e indique si es o no palíndroma (se lee igual de izquierda a derecha que de
derecha a izquierda, sin tener en cuenta los espacios en blanco y las
mayúsculas). Por ejemplo: "dábale arroz a la zorra el abad". Reutilice la
función del ejercicio 12 para la entrada de teclado y cree otra función que
dada una cadena de caracteres devuelva un boolean indicando si es o no
palíndroma.*/

import java.util.Scanner;
import java.util.ArrayList;
public
void TiemposAnios(){
    Scanner sc = new Scanner(System.in);
    System.out.println("INTRODUZCA EL NUMERO DE ANIOS:");
    int years = sc.nextInt();

    System.out.println("INTRODUZCA EL NUMERO DE MESES:");
    int months = sc.nextInt();

    System.out.println("INTRODUZCA EL NUMERO DE DIAS:");
    int days = sc.nextInt();
    int seconds = years*60*60*24*30*12+months*60*60*24*30+days*60*60*24;
    System.out.println("LOS SEGUNDOS DE LOS TIEMPOS INTRODUCIDOS SON: " +seconds);
}
void TamaniosDatos(){
    System.out.println("Máximo valor representable por un char: " + (int) Character.MAX_VALUE);
    System.out.println("Máximo valor representable por un short: " + Short.MAX_VALUE);
    System.out.println("Máximo valor representable por un int: " + Integer.MAX_VALUE);
}
void Multiplos5(){
    int contador = 0;
    int x = 0;
    int[] multiplos;
    multiplos = new int [21];
    for(int i=1; i<=100; i++){
        if(i%5==0){
            contador++;
            multiplos[contador] = i;
            System.out.println("El numero " +multiplos[contador]+ " es el " +contador+ " multipolo 5");
        }
    }
    System.out.println("Contador de multiplos de 5 entre 1 y 100: "+contador);
    int suma = 0;
    for(int j=0; j<= contador; j++){
        if(multiplos[j] != 0){
            suma += multiplos[j];
        }
    }
    System.out.println("La suma de los multiplos de 5 es "+suma);
}
void MaxMin(){

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<>();

    int numero;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    do {
        System.out.print("INTRODUZCA UN NUMERO: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            lista.add(numero); // Agregar a la lista
            max = Math.max(max, numero); // Actualizar máximo
            if (numero > 0) {
                min = Math.min(min, numero); // Actualizar mínimo
            }
        }
    } while (numero >= 0);

    System.out.println("\nNumeros introducidos: " + lista);
    System.out.println("Has introducido " + lista.size() + " numeros.");
    System.out.println("El número máximo introducido es " + max);
    System.out.println("El número mínimo introducido es " + min);
}
void TablaMultiplicar(){
    int N;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nINTRODUZCA UN NUMERO PARA MOSTRAR LAS TABLAS DE MULTIPLICAR HASTA ESE NUMERO: ");
    N = sc.nextInt();
    for (int i = 1; i <= N; i++){
        System.out.println("-TABLA DEL "+i);
        for (int j = 1; j <= 10; j++) {
            int [] tabla1;
            tabla1 = new int [10];
            int [] tabla2;
            tabla2 = new int [10];
            tabla2[i-1] = i;
            tabla1[i-1] = tabla2[i-1] * j;
            System.out.println("\t"+tabla2[i-1] + " x " + j + " = " + tabla1[i-1]);
        }
        System.out.println("\n");
    }
}
void Primos(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce hasta qué primo quieres llegar: ");
    int contador = sc.nextInt();
    sc.close();

    int numero = 2;
    System.out.println("Los primeros " + contador + " números primos son:");
    int[] primos = new int[contador];
    int index = 0;

    while (contador > 0) {
        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            primos[index] = numero;
            index++;
            contador--;
        }
        numero++;
    }
    System.out.println(Arrays.toString(primos));
   }



public void main() {
    //1
    TiemposAnios();
    //2
    TamaniosDatos();
    //3
    Multiplos5();
    //4
    MaxMin();
    //5
    TablaMultiplicar();
    //6
    Primos();


}