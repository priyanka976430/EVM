package evm;

public class BusyLamp extends Lamp {

	public void changeLampState() {
		// TODO Auto-generated method stub
		if(lampState == "OFF")
		{
			lampState = "ON";
			
			System.out.println("Busy Lamp Glow");
		}
		else
		{
			lampState = "OFF";
			System.out.println("Busy Lamp Off");
		}
	}

}
