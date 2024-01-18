package JavaPrograms_51to60;

public class Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction {
	
	
	double real;
    double imag;

    public Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public static Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction add(Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction n1, Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction n2)
    {
    	Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction temp = new Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }

    public static void main(String[] args) {
    	
    	Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction n1 = new Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction(2.3, 4.5),
                n2 = new Problem_52_AddTwoComplexNumbersbyPassingClasstoFunction(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }
}
