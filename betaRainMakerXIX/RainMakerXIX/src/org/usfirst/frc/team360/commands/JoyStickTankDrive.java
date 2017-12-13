package org.usfirst.frc.team360.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team360.Subsystem.DriveTrain;
import org.usfirst.frc.team360.robot.OI;
import org.usfirst.frc.team360.robot.Robot;

/**
 *
 */
public class JoyStickTankDrive extends Command {
	
    public JoyStickTankDrive() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	DriveTrain.RightDrive(OI.Rstick.getRawAxis(1));
    	DriveTrain.LeftDrive(OI.Lstick.getRawAxis(1));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
