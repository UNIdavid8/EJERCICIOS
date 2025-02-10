/*
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
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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


    int numero = 2;
    System.out.println("Los primeros " + contador + " números primos son:");
    int[] primos = new int[contador];
    int index = 0;

    while (contador > 0) {
        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= sqrt(numero); i++) {
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
void Factorizar() {
    int numero;
    System.out.print("Introduzca un número a factorizar: ");
       Scanner sc = new Scanner(System.in);
        numero  = sc.nextInt();

        ArrayList<Integer> factores = new ArrayList<>();
        int divisor = 2;
        while (numero >= divisor) {
            if (numero % divisor == 0) {
                factores.add(divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.print("Descomposición en factores primos: ");
        for (int i = 0; i < factores.size(); i++) {
            if (i == factores.size() - 1) {
                System.out.print(factores.get(i));
            } else {
                System.out.print(factores.get(i) + " * ");
            }
        }
        System.out.println("\nCantidad de factores encontrados: " + factores.size());
    }
void calcularEstadisticas() {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int n;

    System.out.println("Introduce números ( número negativo o Cero, ACABA):");
    while (true) {
        System.out.print("Número: ");
        n = sc.nextInt();
        if (n <= 0) break;
        numeros.add(n);
    }

    if (numeros.isEmpty()) {
        System.out.println("No se ingresaron números válidos.");
        return;
    }

    int suma = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int num : numeros) {
        suma += num;
        if (num > max) max = num;
        if (num < min) min = num;
    }

    float media = (float) suma / numeros.size();

    System.out.println("La media de los números es: " + media);
    System.out.println("El número máximo es: " + max);
    System.out.println("El número mínimo es: " + min);
}
void ProductoEscalar(){
    int n;

    System.out.println("Cuantas dimensiones quieres para los vectores? ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    ArrayList<Integer> vector1;
    vector1 = new ArrayList<>(n);

    ArrayList<Integer> vector2;
    vector2 = new ArrayList<>(n);

    System.out.println("Vector A: ");
    for (int i = 1; i <= n; i++) {
        System.out.println("Coordenda " +i+ " : ");
        vector1.add(i - 1, sc.nextInt());
    }

    System.out.println("Vector B: ");
    for (int i = 1; i <= n; i++) {
        System.out.println("Coordenda " +i+ " : ");
        vector2.add(i - 1, sc.nextInt());
    }
    //PRODUCTO ESCALAR
    double v1 = 0;
    double v2 = 0;
    for (int i = 0; i < vector1.size(); i++) {
        v1 += pow(vector1.get(i), 2);
        v2 += pow(vector2.get(i), 2);
    }
    double resultado = sqrt(v1) * sqrt(v2);
    System.out.println("Asumiendo mismo angulo respecto del plano: ");
    System.out.println("A "+ vector1 +" * B "+ vector2 +" = "+ String.format("%.2f", resultado));

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
    //7
    Factorizar();
    //8
    calcularEstadisticas();
    //9
    ProductoEscalar();
}