package edu.umb.cs680.hw04;

public class Medium implements State  {
	public void IncreaseSpeed(Fan fan) {
		fan.changeState(new High());
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.changeState(new Low());
	}
	
	public void TurnOff(Fan fan) {
		fan.changeState(new Off());
	}
}
