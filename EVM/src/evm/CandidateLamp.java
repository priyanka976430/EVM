package evm;

public class CandidateLamp  extends Lamp{

	@Override
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
