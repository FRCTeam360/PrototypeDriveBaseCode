package org.usfirst.frc.team360.robot;

import org.usfirst.frc.team360.commands.ShiftDown;
import org.usfirst.frc.team360.commands.ShiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick Rstick = new Joystick(1);
	public static Joystick Lstick = new Joystick(2);
	public static Joystick OI = new Joystick(3);
	
	public Button hiTransmission = 
            new JoystickButton(Rstick, 1);
   
    public Button lowTransmission = 
            new JoystickButton(Lstick, 1); 
	
	
	public OI(){
		hiTransmission.whenPressed(new ShiftUp());
		lowTransmission.whenPressed(new ShiftDown());
	}
}
