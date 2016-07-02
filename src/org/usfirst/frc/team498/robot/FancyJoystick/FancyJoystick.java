package org.usfirst.frc.team498.robot.FancyJoystick;

import edu.wpi.first.wpilibj.Joystick;

public class FancyJoystick {
	Joystick thisStick;
	public FancyJoystick(int USBChannel) {
		thisStick = new Joystick(USBChannel);
	}
	
	public boolean getButton(Button button) {
		return thisStick.getRawButton(button.buttonIndex);
	}
	
	public double getAxis(Axis axis) {
		return thisStick.getRawAxis(axis.axisIndex);
	}
}
