package evm;

public class ControlUnit {

	Button totalButton;
	Button BallotButton;
	Lamp OnLamp;
	Lamp busyLamp;
	
	ControlUnit()
	{
		totalButton = new TotalButton();
		BallotButton = new BallotButton();
		OnLamp = new ONLamp();
		busyLamp = new BusyLamp();
	}
	
	
	
}
