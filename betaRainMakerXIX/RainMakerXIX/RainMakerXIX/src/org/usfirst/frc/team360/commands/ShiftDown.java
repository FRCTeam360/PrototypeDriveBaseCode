package org.usfirst.frc.team360.commands;

import org.usfirst.frc.team360.Subsystem.Shifter;
import org.usfirst.frc.team360.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftDown extends Command{
	public ShiftDown() {
		requires(Robot.shifter);
    }

	private void requires(Shifter shifter) {
		
	}

	// Called just before this Command runs the first time
    protected void initialize(){
    	Robot.shifter.close();;
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
