package org.usfirst.frc.team360.Subsystem;

import org.usfirst.frc.team360.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem  {
	public static DoubleSolenoid superShift = RobotMap.shifter;
	public void open(){ 
		superShift.set(DoubleSolenoid.Value.kForward);
	}
	public void close() {
		superShift.set(DoubleSolenoid.Value.kReverse);
	}
    public void initDefaultCommand() {
    }
}
