package Controller;

import Model.VariablesComplexNum;
import Service.ComplexNumCalcServis;

public class ComplexNumCalcController {

    
    public static VariablesComplexNum calculate(char op){
        ComplexNumCalcServis calcServis = new ComplexNumCalcServis();
        return  calcServis.calculate(op);
    }
}
