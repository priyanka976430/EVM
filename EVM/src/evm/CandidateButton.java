package evm;

public class CandidateButton extends Button {

	@Override
	public int buttonPressed() {
		// TODO Auto-generated method stub
		if(state == 0 )
		{
			System.out.println("Candidate Button Pressed");
			return 0;
		}
		else
		{
			return 1;
		}
		
	}
	
	
	public int userRequest(int candidateId)
	{
		return candidateId;
		
	}

}
