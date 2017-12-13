package org.usfirst.frc.team360.Subsystem;

import org.usfirst.frc.team360.commands.Pressurize;
import org.usfirst.frc.team360.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	Compressor compressor = RobotMap.compressor;

	public void pressurize() {
		compressor.start();
	}

    public void stop() {
    	compressor.stop();
    }

	protected void initDefaultCommand() {
		setDefaultCommand(new Pressurize());
	}
}
