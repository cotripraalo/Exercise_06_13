/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_06_13;

/**
 *
 * @author alumno
 */
public class Exercise_06_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra los datos de la serie de tablas entre 1,0 a 20,0
        double serie_comienza = 1.0 ; //Inicio de rango
        double n_filas = 20.0; // Intervalo final
        
        //Mostrar encabezado
        System.out.println("\ni           m(i)      ");
        System.out.println("-------------------");
        
        //Mostrar datos
        for(double i = serie_comienza; i<=n_filas;i++){
            System.out.printf("%-10.0f",i);
            System.out.printf("% 7.4f\n",Sumseries(i));
        }
    }
    
    //Metodo Sumseries: calcula la serie */
    public static double Sumseries (double n){
     double suma = 0;    //Suma de la serie
    for (double i=1; i <=n;i++){
    suma+=i/(i+1);
        }
    return suma;
    }
}
        
        
        
        
    