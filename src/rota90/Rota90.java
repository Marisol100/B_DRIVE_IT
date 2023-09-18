package rota90;

public class Rota90 {

        public static void main(String[] args) {
         int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
         
        /*for (int i = 0; i < a.length; i++) { //filas
            for (int j = 0; j < a[i].length; j++) { //columnas
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/
           
        //Declaramos variables para almacenar el numero de filas y columnas
        int rows = a.length; //3
        int columns = a[0].length; //3
        
        //Creamos nueva matriz para para almacenar arreglo
        int[][] a_rows_columns = new int[columns][rows];
        
        // Trasladamos la matriz a a_rows_columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a_rows_columns[j][i] = a[i][j];
                System.out.print(a_rows_columns[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Creamos matríz para almacenar los elementos rotados
        int[][] a_rotar = new int[columns][rows];
        
        // Rotamos
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                a_rotar[i][j] = a_rows_columns[i][rows - 1 - j];
            }
        }
        
        // Imprimir la matriz rotada
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(a_rotar[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
