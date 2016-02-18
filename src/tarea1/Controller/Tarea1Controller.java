/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.Controller;

import java.util.LinkedList;
import tarea1.Model.LoadData;
import tarea1.Model.MeasureOfData;

/**
 *
 * @author SantiagoAvila
 */
public class Tarea1Controller {
    
    
    public double getMeanOfDataList(LinkedList<Double> dataList) {
        return MeasureOfData.calculateMean(dataList);
    }
    
    public Double getStandardDeviationOfDataList(LinkedList<Double> dataList) {
        return MeasureOfData.calculateStandardDeviation(dataList);
    }
    
    public LinkedList<Double> loadDataList(String fileName) {
        return LoadData.loadDataFromFile(fileName);
    }
}
