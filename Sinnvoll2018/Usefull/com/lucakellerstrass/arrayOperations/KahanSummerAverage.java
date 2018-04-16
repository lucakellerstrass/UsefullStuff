 /**
 *   Does the Average with a nice error reduction.
 */
package com.lucakellerstrass.arrayOperations;

/**
 * @author lucak
 *
 */
public class KahanSummerAverage {

	/**
	 * @param args
	 * String[]   The array of numbers you want to do the Average from
	 */
static public double kahanSumAverage(Integer[] numbers) {
		
		double sum = 0.0 ;     //running sum
		double error = 0.0;    //Running error compansation
		
		for(int i = 0 ; i < numbers.length; i++){
			double value = numbers[i] - error ;          //Error corrceted Value
			double newSum = sum + value ;                // newsum
					error = (newSum - sum ) - value ;    //New numericel error
					sum = newSum;
		}
		return sum / numbers.length;
	}

}


