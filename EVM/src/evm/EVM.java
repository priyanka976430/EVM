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
	
	

	public void Candidate(int totalCandidate)
	{
		for(int i=0; i<=totalCandidate;i++)
		{
			ballotUnit.candidate[i] = new Candidate(i);
		}
	}
	
}
