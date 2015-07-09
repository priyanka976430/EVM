package evm;

public class EVM {

	BallotUnit ballotUnit;
	ControlUnit controlUnit;
	int totalCandidate;
	EVM(int totalCandidate)
	{
		this.totalCandidate = totalCandidate;
		ballotUnit = new BallotUnit(totalCandidate);
		controlUnit = new ControlUnit();
		Candidate(totalCandidate);
	}
	
	
	public void ControlUnitOn(int request)
	{
		if(request == 0)
		{
			controlUnit.OnLamp.changeLampState();
			
			if(controlUnit.OnLamp.lampState == "ON")
			{
				controlUnit.BallotButton.buttonPressed();
				controlUnit.BallotButton.buttonPressed();
				
				
				if(controlUnit.BallotButton.state == 0)
				{
					controlUnit.busyLamp.changeLampState();
					
					if(controlUnit.busyLamp.lampState == "ON")
					{
						BallotUnit(0);
					}
				}
			}
		}
		
	}
	

	public void BallotUnit(int request)
	{
		if(request == 0)
		{
			ballotUnit.readyLamp.changeLampState();
			
			/*if(ballotUnit.readyLamp.lampState == "ON")
			{
				
			}*/
		}
	}
	
	public void Candidate(int totalCandidate)
	{
		for(int i=0; i<totalCandidate;i++)
		{
			ballotUnit.candidate[i] = new Candidate(i);
		}
	}
	
}
