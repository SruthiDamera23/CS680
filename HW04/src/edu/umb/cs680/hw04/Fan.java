package edu.umb.cs680.hw04;

public class Fan {
	private State currentState;
	
	public Fan() {
		currentState=new Off();
	}
	
	
	public State getState() {
		return this.currentState;
	}
	
	
	public void changeState(State newState) {
		this.currentState=newState;
	}
	
	public void IncreaseSpeed() {
		currentState.IncreaseSpeed(this);
	}
	public void DecreaseSpeed() {
		currentState.DecreaseSpeed(this);
	}
	public void TurnOff() {
		currentState.TurnOff(this);
	}
	
	

}
