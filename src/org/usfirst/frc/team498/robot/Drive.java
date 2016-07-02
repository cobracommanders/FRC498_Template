package org.usfirst.frc.team498.robot;

import org.usfirst.frc.team498.robot.FancyJoystick.Axis;
import org.usfirst.frc.team498.robot.FancyJoystick.FancyJoystick;

import edu.wpi.first.wpilibj.RobotDrive;

public class Drive implements IComponent{

	FancyJoystick mainController;
	RobotDrive robotDrive;
	Drive(FancyJoystick joystick, Ports ports) {
		mainController = joystick;
		//Arguments for RobotDrive are (leftMotor, rightMotor);
		robotDrive = new RobotDrive(ports.leftDrivePWM, ports.rightDrivePWM);
	}
	@Override
	public void update() {
		
		//#498 Standard Drive Example
		//robotDrive.arcadeDrive(mainController.getAxis(Axis.RightTrigger) - mainController.getAxis(Axis.LeftTrigger), mainController.getAxis(Axis.LeftX));
	}

}
