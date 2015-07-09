package evm;

public class TotalButton extends Button{

	int count;
	@Override
	public int buttonPressed() {
		// TODO Auto-generated method stub
		if ( state == 0)
		{
			System.out.println("Total Button Pressed");
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	
	public int count(int counter)
	{
		count = count+counter;
		return count;
	}

}
