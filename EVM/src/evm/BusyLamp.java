package evm;

public class BusyLamp extends Lamp {

	public void changeLampState() {
		// TODO Auto-generated method stub
		if(lampState == "OFF")
		{
			lampState = "ON";
			
			System.out.println("Lamp Glow");
		}
		else
		{
			lampState = "OFF";
			System.out.println("Lamp Off");
		}
	}

}
