import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;

public
//1
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
//2
void TamaniosDatos(){
    System.out.println("Máximo valor representable por un char: " + (int) Character.MAX_VALUE);
    System.out.println("Máximo valor representable por un short: " + Short.MAX_VALUE);
    System.out.println("Máximo valor representable por un int: " + Integer.MAX_VALUE);
}
//3
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
//4
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
//5
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
//6
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
//7
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
//8
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
//9
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
//10
void imprimirMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
        System.out.println(Arrays.toString(fila));
    }
}

void MatrizSimetrica(){
    int n;
    System.out.println("Cuantas dimensiones quieres para las matrices? ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int [][]   matriz = new int[n][n];
    int [][] matrizT  = new int[n][n];
    int [][] matrizS = new int[n][n];

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int randomNumbers = rand.nextInt(5);
            matriz[i][j] = randomNumbers;
            matrizT[j][i] = matriz[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrizS[i][j] = matriz[i][j] + matrizT[i][j];
        }
    }
    System.out.println("La matriz es: ");
    imprimirMatriz(matriz);
    System.out.println("La matriz Traspuesta es: ");
    imprimirMatriz(matrizT);
    System.out.println("La matriz Simetrica es: ");
    imprimirMatriz(matrizS);
}
//11
void MultiplicacionMatrices(){
    int n;
    System.out.println("Cuantas dimensiones quieres para las matrices? ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int [][] matrizA = new int[n][n];
    int [][] matrizB  = new int[n][n];
    int [][] matrizM = new int[n][n];
    System.out.println("MATRIZ A:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++){
            System.out.println("Coordenda " +i+ "," +j+" : ");
            matrizA[i][j] = sc.nextInt();
        }
    }
    System.out.println("MATRIZ B:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++){
            System.out.println("Coordenda " +i+ "," +j+" : ");
            matrizB[i][j] = sc.nextInt();
        }
    }
    System.out.println("MATRIZ A*B:");

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                int aux = 0;
                for(int j = 0; j < n; j++){
                    aux += matrizA[i][j] * matrizB[j][i];
                    System.out.println(aux);
                }
                matrizM[k][i] = aux;
                System.out.println("!!"+ matrizM[k][i]+ "!!");
            }
        }
    imprimirMatriz(matrizA);
    System.out.println("    * ");
    imprimirMatriz(matrizB);
    System.out.println("    = ");
    imprimirMatriz(matrizM);
}
//12
void Vocales(){
    System.out.println("Escribe una palabra o frase: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] caracteres = input.toCharArray();
    int cuenta = 0;
    for (int i = 0; i < caracteres.length; i++) {
        if (caracteres[i] == 'a' || caracteres[i] == 'A'){
            cuenta++;
        }
        if (caracteres[i] == 'e' || caracteres[i] == 'E'){
            cuenta++;
        }
        if (caracteres[i] == 'i' || caracteres[i] == 'I'){
            cuenta++;
        }
        if (caracteres[i] == 'o' || caracteres[i] == 'O'){
            cuenta++;
        }
        if (caracteres[i] == 'u' || caracteres[i] == 'U'){
            cuenta++;
        }
    }
    System.out.println("En tu plabra/frase hay " + cuenta + " vocales!!");
}
//13
void EscribirAlReves(){
    System.out.println("Escribe una palabra o frase: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] caracteres = input.toCharArray();
    char[] inversa = new char [caracteres.length];
    for (int i = caracteres.length ; i > 0 ; i--) {
        inversa[caracteres.length-i] = caracteres[i-1];
    }
    System.out.println("Palabra/Frase al reves: ");
    System.out.println(new String(inversa));
}
//14
void Palindromo(){
    System.out.println("Escribe una palabra o frase: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] caracteres = input.toCharArray();
    ArrayList<Character> nospace = new ArrayList<>();

    for (int i = 0; i < caracteres.length; i++) {
        if (caracteres[i] != ' ') {
            nospace.add(Character.toLowerCase(caracteres[i]));
        }
    }
    char[] inversa = new char [nospace.size()];
    for (int i = nospace.size() ; i > 0 ; i--) {
        inversa[nospace.size()-i] = nospace.get(i-1);
    }
    int contador = 0;
    for (int i = 0; i < inversa.length; i++) {
        if(inversa[i] == nospace.get(i)){
            contador++;
        }
    }
    if(contador == nospace.size()){
        System.out.println("Palabra/Frase ''" +new String(caracteres)+"'' SI es un palindromo:");
    }else{
        System.out.println("Palabra/Frase ''" +new String(caracteres)+"'' NO es un palindromo:");
    }
    System.out.println(new String(caracteres) + " --> "+new String(inversa));
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
    //10
        MatrizSimetrica();
    //11
        MultiplicacionMatrices();
    //12
        Vocales();
    //13
        EscribirAlReves();
    //14
    Palindromo();
}
