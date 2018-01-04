package org.usfirst.frc.team360.robot;

import org.usfirst.frc.team360.Subsystem.DriveTrain;
import org.usfirst.frc.team360.Subsystem.Pneumatics;
import org.usfirst.frc.team360.Subsystem.Shifter;
import org.usfirst.frc.team360.commands.GetEncoders;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static DriveTrain drivetrain;
	public static Pneumatics pneumatics;
	public static Compressor compressor;
	public static Shifter shifter;
	public static OI oi;
	Command getEncoders;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		drivetrain = new DriveTrain();
		shifter = new Shifter();
		pneumatics = new Pneumatics();
		compressor = new Compressor();
		oi = new OI();
		getEncoders = new GetEncoders();
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		getEncoders.start();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

    	SmartDashboard.putNumber("right stick", OI.Rstick.getRawAxis(1));
    	SmartDashboard.putNumber("left stick", OI.Lstick.getRawAxis(1));
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}

}
