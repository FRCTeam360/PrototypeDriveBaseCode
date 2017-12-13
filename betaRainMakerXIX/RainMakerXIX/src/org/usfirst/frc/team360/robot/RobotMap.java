package org.usfirst.frc.team360.robot;

import com.kauailabs.navx.frc.AHRS;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SPI;

public class RobotMap {
	public static CANTalon motorR1 = new CANTalon (0);
	public static CANTalon motorR2 = new CANTalon (1);
	public static CANTalon motorL1 = new CANTalon (2);
	public static CANTalon motorL2 = new CANTalon (3);
	
	public static Compressor compressor = new Compressor(4);
	
	public static PowerDistributionPanel PDP = new PowerDistributionPanel();
	
	public static AHRS navX = new AHRS(SPI.Port.kMXP);
	public static DoubleSolenoid shifter = new DoubleSolenoid (0,1);
	
// 7-bit address 0x70
// 8-bit address 0xE0

public static final int RANGE_FINDER_ID = 0x70, RANGE_READ_MESSAGE = 0x51;
}
