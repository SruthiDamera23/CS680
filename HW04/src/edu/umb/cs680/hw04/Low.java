package edu.umb.cs680.hw04;

public class Low implements State {
	public void IncreaseSpeed(Fan fan) {
		fan.changeState(new Medium());
	}
	
	public void DecreaseSpeed(Fan fan) {
		fan.changeState(new Off());
	}
	
	public void TurnOff(Fan fan) {
		fan.changeState(new Off());
	}
}
