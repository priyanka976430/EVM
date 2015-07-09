package evm;

public class BallotButton extends Button {

	@Override
	public int buttonPressed() {
		// TODO Auto-generated method stub
		if ( state == 0)
		{
			state = 1;
			System.out.println("Ballot Button Pressed");
			return 0;
		}
		else
			
		{
			state = 0;
			System.out.println("Ballot Button Released");
			return 1;
		}
	}

}
