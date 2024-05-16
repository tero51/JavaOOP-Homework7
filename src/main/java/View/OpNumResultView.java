package View;

import java.util.Scanner;

import Controller.ComplexNumCalcController;
import Model.ComplexNumber;
import Model.Numbers;
import Model.VariablesComplexNum;


public class OpNumResultView {
    Scanner scanner = new Scanner(System.in);
    
    public Double getNumber() {
        Double number =  scanner.nextDouble();
        return number;
    }
    public char getOperation() {
        char op = scanner.next().charAt(0);
        scanner.close();
        return op;
    }  

    public Numbers getResult(char op, ComplexNumber a, ComplexNumber b) {
            VariablesComplexNum operation = ComplexNumCalcController.calculate(op);
            Numbers result = new ComplexNumber(operation.getReal(a, b), operation.getImagine(a, b));
            return result;
        }
    
}