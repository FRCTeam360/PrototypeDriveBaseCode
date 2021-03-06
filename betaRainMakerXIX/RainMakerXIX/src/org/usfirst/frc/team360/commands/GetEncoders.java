package org.usfirst.frc.team360.commands;

import org.usfirst.frc.team360.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class GetEncoders extends Command{
	public GetEncoders() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("LftencPos", Robot.drivetrain.LeftEncoderValue());
    	SmartDashboard.putNumber("RgtencPos", Robot.drivetrain.RightEncoderValue());
    	SmartDashboard.putNumber("LftencVel", (-1* Robot.drivetrain.LeftEncoderVelocity()));
    	SmartDashboard.putNumber("RgtencVel", Robot.drivetrain.RightEncoderVelocity());
    	//SmartDashboard.putBoolean("RgtStatus", Robot.drivetrain.RightEncoderStatus());
    	//SmartDashboard.putBoolean("LftStatus", Robot.drivetrain.LeftEncoderStatus());
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
    }
}
