/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author hartmann
 */
public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR; 
    }

public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) *1.5; 
return result; 
}
}
