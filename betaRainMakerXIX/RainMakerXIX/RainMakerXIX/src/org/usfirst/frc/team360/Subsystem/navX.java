package org.usfirst.frc.team360.Subsystem;

import org.usfirst.frc.team360.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class navX extends Subsystem{
	
	
	public void getAcceleration(){
    	RobotMap.accelX = RobotMap.navX.getRawAccelX();
    	RobotMap.accelY = RobotMap.navX.getRawAccelY();
    	
    	SmartDashboard.putNumber("accelX", RobotMap.accelX);
    	SmartDashboard.putNumber("accelY", RobotMap.accelY);
    }

	protected void initDefaultCommand() {

	}
}
