import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class  Day12 {

    public static void main(String[] args) {

        // Elevator call
        Elevator myElevator = new Elevator("JAVA APT 507");
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security("JAVA APT 507");
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting("JAVA APT 507 / floorLamp");
        floorLamp.on();


    }
}
