/**
 * AutoShowroom Driver Class
 * A Driver Class to run AutoShowroom
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see {@link AutoShowroom}
 */

import java.text.ParseException;

public class AutoShowroomDriver {
    public static void main(String[] args) throws ParseException {
        AutoShowroom autoShowroom = new AutoShowroom();
        autoShowroom.printStatus(true);
    }
}
