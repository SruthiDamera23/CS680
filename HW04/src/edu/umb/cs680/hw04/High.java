package edu.umb.cs680.hw04;

public class High implements State  {
	public void IncreaseSpeed(Fan fan) {
		
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.changeState(new Medium());
	}
	
	public void TurnOff(Fan fan) {
		fan.changeState(new Off());
	}
}
