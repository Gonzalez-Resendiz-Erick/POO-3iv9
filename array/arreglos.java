import java.util.*;
public class arreglos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, numA;
        int pos = 0, neg = 0;
        int numeros[] = new int[10]; 
        double sumaPos = 0, sumaNeg = 0, promedio = 0, suma = 0;                   
        
        for (i = 0; i < 10; i++) {
            System.out.print("numero " + i + "= ");
            numeros[i]=sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){
                sumaNeg += numeros[i];
                neg++;
            }
        }

        if (pos != 0) {
            System.out.println("Promedio de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No hay numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Promedio de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No hay numeros negativos");
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                promedio = promedio + numeros[i];
            }
        }
        System.out.println("Promedio de los valores que se encuentran en posiciones pares: "+ promedio/5);
        
        do {
            System.out.print("Numero de alumnos de la clase: ");
            numA = sc.nextInt();
        } while (numA <= 0);

        double[] cal = new double[numA]; 
        
        for (i = 0; i < cal.length; i++) {
            System.out.print("Alumno " + (i + 1) + " calificacion: ");
            cal[i] = sc.nextDouble();
        }

        for (i = 0; i < cal.length; i++) {
            suma = suma + cal[i];
        }
        promedio = suma / cal.length;
        System.out.printf("Promedio de calificacion: %.2f %n", promedio);

        System.out.println("Alumnos aprobados: ");
        for (i = 0; i < cal.length; i++) {
            if (cal[i] >= 6) {
                System.out.println("Alumno numero " + (i + 1)+ " Calificacion final: " + cal[i]);
            }
        }
        System.out.println("Alumnos reprobados: ");
        for (i = 0; i < cal.length; i++) {
            if (cal[i] <= 5.9) {
                System.out.println("Alumno numero " + (i + 1)+ " Calificacion final: " + cal[i]);
            }
        }
        int matriza[][] = new int [3][3];
        int matrizb[][] = new int [3][3];
        int matrizc[][] = new int [3][3];
        int a, j;
        
        Scanner dato = new Scanner (System.in);
        
        System.out.println("Datos de la Matriz A :");
        
        for (a=0; a<=2; a++){
            for (j=0; j<=2; j++){
                System.out.print("Escribir valor " + a + " , " + j + " : ");
                matriza [a][j]= dato.nextInt();
               }
           }
           
           System.out.println("Datos de la Matriz B :");
           
           for (a=0; a<=2; a++){
            for (j=0; j<=2; j++){
                System.out.print("Escribir valor " + a + " , " + j + " : ");
                matrizb [a][j]= dato.nextInt();
               }
           }
           
        for (a=0; a<=2; a++){
            for (j=0; j<=2; j++){
                matrizc [a][j]= matriza[a][j]+matrizb[a][j];
            }
        }
           
           System.out.println("Matriz resultante de la suma :");
        for (a=0;a<=2;a++){
            for (j=0;j<=2;j++) {
               System.out.print(matrizc[a][j] + " ");
            }
           System.out.println("");
           
        }
    }
}