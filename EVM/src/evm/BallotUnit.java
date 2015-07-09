package evm;

public class BallotUnit {

	Candidate []candidate;
	int count;
	Lamp readyLamp;
	CandidateButton canButton;
	Lamp candidateLamp;
	
	
	
	public BallotUnit(int totalCandidate) {
		// TODO Auto-generated constructor stub
		candidate = new Candidate[totalCandidate];
		readyLamp = new ReadyLamp();
		canButton = new CandidateButton();
		candidateLamp = new CandidateLamp();
	}
	
	
	
}
