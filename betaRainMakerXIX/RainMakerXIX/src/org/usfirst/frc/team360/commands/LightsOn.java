package org.usfirst.frc.team360.commands;

import org.usfirst.frc.team360.Subsystem.LEDLights;
import org.usfirst.frc.team360.robot.Robot;

public class LightsOn {
	public LightsOn() {
		requires(Robot.lights);
    }

	private void requires(LEDLights lights) {
		
	}

	// Called just before this Command runs the first time
    protected void initialize(){
    	Robot.lights.on();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute(){
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished(){
        return true;
    }

    // Called once after isFinished returns true
    protected void end(){
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted(){
    }
}