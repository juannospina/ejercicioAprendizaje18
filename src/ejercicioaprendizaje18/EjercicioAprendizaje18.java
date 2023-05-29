/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicioaprendizaje18;
public class EjercicioAprendizaje18 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        
        System.out.println("Matriz original:");
        llenarMatriz(matriz);
        System.out.println("La matriz traspuesta es:");
        matrizTraspuesta(matriz);
       
        
    }
    public static void llenarMatriz(int [][] matriz){
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void matrizTraspuesta(int[][]matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }
    }
}
