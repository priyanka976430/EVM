package evm;

public class ReadyLamp extends Lamp {

	public void changeLampState() {
		// TODO Auto-generated method stub
		if(lampState == "OFF")
		{
			lampState = "ON";
			
			System.out.println("Ready Lamp Glow");
		}
		else
		{
			lampState = "OFF";
			System.out.println("Ready Lamp Off");
		}
	}

	
}
