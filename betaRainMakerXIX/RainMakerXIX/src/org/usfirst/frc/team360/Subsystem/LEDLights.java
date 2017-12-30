package org.usfirst.frc.team360.Subsystem;

import org.usfirst.frc.team360.robot.RobotMap;
import edu.wpi.first.wpilibj.Relay;

public class LEDLights {
	public static Relay lights = RobotMap.lights;
	public void on(){ 
		lights.set(Relay.Value.kForward);
	}
	public void off() {
		lights.set(Relay.Value.kReverse);
	}
    public void initDefaultCommand() {
    }
}
