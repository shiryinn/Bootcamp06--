/**
 * A TruckException Class which is a sub-class of VehicleException class
 * @author Lim Shir Yin
 * @version 11/04/2021
 */

package edu.monash.fit2099.exceptions;

public class TruckException extends VehicleException {

    /**
     * A TruckException Constructor with 1 parameter
     * @param message
     */
    public TruckException(String message) {
        super(message);
    }
}
