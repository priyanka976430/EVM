package evm;

public class TotalButton extends Button{

	int count;
	@Override
	public int buttonPressed() {
		// TODO Auto-generated method stub
		if ( state == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	

}
