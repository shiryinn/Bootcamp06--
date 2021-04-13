/**
 * A BidException Class which is a sub-class of Exception class
 * @author Lim Shir Yin
 * @version 11/04/2021
 */
package edu.monash.fit2099.exceptions;

public class BidException extends Exception {

    /**
     * A BidException Constructor
     * @param message
     */
    public BidException(String message) {
        super(message);
    }
}
