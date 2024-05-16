package Service;

import Model.AddComplexNum;
import Model.DivideComplexNum;
import Model.MultyplyComplexNum;
import Model.SubstractComplexNum;
import Model.VariablesComplexNum;

public class ComplexNumCalcServis {
    public VariablesComplexNum calculate(char op){

    if (op == '+') {
        return new AddComplexNum();
    } else if (op == '-') {
        return new SubstractComplexNum();
    }else if (op == '*') {
        return new MultyplyComplexNum();
    }else {
        return new DivideComplexNum();
        }
    }
}
    