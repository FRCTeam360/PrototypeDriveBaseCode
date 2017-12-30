package org.usfirst.frc.team360.robot;

import com.kauailabs.navx.frc.AHRS;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;

public class RobotMap {
	public static CANTalon motorR1 = new CANTalon (0);
	public static CANTalon motorR2 = new CANTalon (1);
	public static CANTalon motorL1 = new CANTalon (2);
	public static CANTalon motorL2 = new CANTalon (3);
	
	public static Relay lights = new Relay(0);
	
	public static Compressor compressor = new Compressor(4);
	
	public static PowerDistributionPanel PDP = new PowerDistributionPanel();
	
	public static AHRS navX = new AHRS(SPI.Port.kMXP);
	public static float accelX;
	public static float accelY;
	
	public static double[] someDistance;
	public static Timer time;
	
	public static float Yaw;
	public static float Pitch;
	public static float Roll;
	
	public static double TotalYaw;
	public static double YawRate;
	
//	public static float Compass;
//	public static float Fused;
	
	public static boolean Moving;
	public static boolean Rotating;
	public static boolean Connected;
	public static boolean Calibrating;
	
//	public static float VelocityX;
//	public static float VelocityY;
	
//	public static float DisplacementX;
//	public static float DisplacementY;
	
//	public static float RawGyroX;
//	public static float RawGyroY;
//	public static float RawGyroZ;
	
//	public static float RawAccelX;
//	public static float RawAccelY;
//	public static float RawAccelZ;
	
//	public static float RawMagX;
//	public static float RawMagY;
//	public static float RawMagZ;
	
//	public static float Temperature_Celsius;
//	public static double Temperature_Fahrenheit;
	
	public static float QuaternionW;
	public static float QuaternionX;
	public static float QuaternionY;
	public static float QuaternionZ;
	
	public static DoubleSolenoid shifter = new DoubleSolenoid (0,1);
	
// 7-bit address 0x70
// 8-bit address 0xE0

public static final int RANGE_FINDER_ID = 0x70, RANGE_READ_MESSAGE = 0x51;
}
