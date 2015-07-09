package evm;

public abstract class Button {

	int state;
	public Button() {
		
		this.state=0;
		
		// TODO Auto-generated constructor stub
	}
	public abstract int buttonPressed();
}
