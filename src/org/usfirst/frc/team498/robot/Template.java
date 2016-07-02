package org.usfirst.frc.team498.robot;

import org.usfirst.frc.team498.robot.FancyJoystick.FancyJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SampleRobot;


//TODO Change class name to Robot.java
public class Template extends SampleRobot {
	Ports ports;
	FancyJoystick mainController;
	Drive drive;
	AutonomousController auto;
	//TODO Change constructor name to Robot()
    Template() {
    	ports = new Ports();
    	//Argument for FancyJoystick(Driver Station USB Port)
    	mainController = new FancyJoystick(0);
    	//Arguments for RobotDrive(leftDriveMotor, rightDriveMotor)
    	drive = new Drive(mainController, ports);
    	//No Argument for AutonomousController()
    	auto = new AutonomousController(drive, ports);
    }
    
    public void autonomous() {
    	//TODO Select an autonomous
    	auto.currentAuto = AutonomousType.Option1;
    	while(isAutonomous() && isEnabled()) {
    		auto.update();
    	}
    }
    
    public void operatorControl() {
    	
    	while (isOperatorControl() && isEnabled()) {
    		//Add all update functions
    		drive.update();
    	}
    }
    
    
}
