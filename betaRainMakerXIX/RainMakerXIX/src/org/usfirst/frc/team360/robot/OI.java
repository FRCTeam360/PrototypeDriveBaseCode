package org.usfirst.frc.team360.robot;

import org.usfirst.frc.team360.commands.ShiftDown;
import org.usfirst.frc.team360.commands.ShiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick Rstick = new Joystick(1);
	public static Joystick Lstick = new Joystick(0);
	
	public static Button hiTransmission = new JoystickButton(Rstick, 1);
   
    public static Button lowTransmission = new JoystickButton(Lstick, 1); 
	
	
	public OI(){
		hiTransmission.whenPressed(new ShiftUp());
		lowTransmission.whenPressed(new ShiftDown());
	}
}
