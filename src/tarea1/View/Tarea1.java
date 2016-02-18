package tarea1.View;

import java.util.LinkedList;
import tarea1.Controller.Tarea1Controller;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SantiagoAvila
 */
public class Tarea1 {

    static final String FILE_NAME_1 = "dataset1.txt";
    static final String FILE_NAME_2 = "dataset2.txt";
    static final String[] FILE_NAMES = {FILE_NAME_1, FILE_NAME_2};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarea1Controller controller = new Tarea1Controller();
        LinkedList<Double> currentDataList;
        for(String fileName : FILE_NAMES) {
            currentDataList = controller.loadDataList(fileName);
            System.out.println("\nPara el conjunto de datos: " + currentDataList);
            String mean = String.format("La media de los datos es: %.2f", controller.getMeanOfDataList(currentDataList));
            String standardDeviation = String.format("La desviacion estandar de los datos es: %.2f", controller.getStandardDeviationOfDataList(currentDataList));
            System.out.println(mean);
            System.out.println(standardDeviation);
        }
    }
    
}
