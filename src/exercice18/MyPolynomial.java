package exercice18;

import java.lang.reflect.Array;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs){
		this.coeffs = coeffs;
	}

	public int getDegree() {
		return coeffs.length - 1;

	}

	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    for (int i = coeffs.length - 1; i >= 0; i--) {
	        if (coeffs[i] != 0) {
	            if (sb.length() > 0) {
	                sb.append(" + ");
	            }
	            if (i == 0) {
	                sb.append(coeffs[i]); // Constante
	            } else if (i == 1) {
	                sb.append(coeffs[i] + "x"); // Terme x
	            } else {
	                sb.append(coeffs[i] + "x^" + i); // Terme général
	            }
	        }
	    }
	    return sb.toString();
	}
	
	public double evaluate(double x) {
	    double result = 0;
	    for (int i = 0; i < coeffs.length; i++) {
	        result += coeffs[i] * Math.pow(x, i);
	    }
	    return result;
	}



	public MyPolynomial add(MyPolynomial right) {
	    int maxDegree = Math.max(this.getDegree(), right.getDegree());
	    double[] resultCoeffs = new double[maxDegree + 1];

	    for (int i = 0; i <= maxDegree; i++) {
	        double thisCoeff = (i < this.coeffs.length) ? this.coeffs[i] : 0;
	        double rightCoeff = (i < right.coeffs.length) ? right.coeffs[i] : 0;
	        resultCoeffs[i] = thisCoeff + rightCoeff;
	    }

	    return new MyPolynomial(resultCoeffs);
	}

	
	public MyPolynomial multiply(MyPolynomial right) {
	    int newDegree = this.getDegree() + right.getDegree();
	    double[] resultCoeffs = new double[newDegree + 1];

	    // Initialiser à zéro (optionnel car Java initialise déjà à 0)
	    for (int i = 0; i <= newDegree; i++) {
	        resultCoeffs[i] = 0;
	    }

	    // Multiplication des coefficients
	    for (int i = 0; i < this.coeffs.length; i++) {
	        for (int j = 0; j < right.coeffs.length; j++) {
	            resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
	        }
	    }

	    return new MyPolynomial(resultCoeffs);
	}




}
