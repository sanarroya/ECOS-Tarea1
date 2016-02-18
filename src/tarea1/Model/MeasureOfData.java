/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.Model;

import java.util.LinkedList;

/**
 *
 * @author SantiagoAvila
 */
public class MeasureOfData {
    public static double calculateMean(LinkedList<Double> dataList) {
        double sum = 0.0;
        for(double element : dataList) {
            sum += element;
        }
        double listSize = (double)dataList.size();
        double mean = sum / listSize;
        return mean;
    }
    
    public static Double calculateStandardDeviation(LinkedList<Double> dataList) {
        double mean = calculateMean(dataList);
        double sum = 0.0;
        for(double element : dataList) {
            sum = sum + Math.pow((element - mean), 2.0);
        }
        double listSize = (double)dataList.size();
        double standarDeviation = Math.sqrt(sum / (listSize - 1.0));
        return standarDeviation;
    }
}
