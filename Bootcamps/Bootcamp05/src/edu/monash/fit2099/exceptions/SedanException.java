/**
 * A SedanException Class which is a sub-class of VehicleException class
 * @author Lim Shir Yin
 * @version 11/04/2021
 */

package edu.monash.fit2099.exceptions;

public class SedanException extends VehicleException{

    /**
     * A SedanException Constructor with 1 parameter
     * @param message
     */
    public SedanException(String message) {
        super(message);
    }
}
