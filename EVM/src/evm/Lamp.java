package evm;

public abstract class Lamp {

	String lampState;
	
	Lamp()
	{
		this.lampState="OFF";
	}
	
	public abstract void changeLampState();
}

