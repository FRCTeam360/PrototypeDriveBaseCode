package org.usfirst.frc.team360.Subsystem;

import edu.wpi.first.wpilibj.command.*;
import org.usfirst.frc.team360.robot.*;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.FeedbackDeviceStatus;
import com.ctre.CANTalon.TalonControlMode;

import org.usfirst.frc.team360.commands.JoyStickTankDrive;

public class DriveTrain extends Subsystem{
	
	static CANTalon motorR1 = RobotMap.motorR1;
	static CANTalon rightSlave = RobotMap.motorR2;
	static CANTalon motorL1 = RobotMap.motorL1;
	static CANTalon leftSlave = RobotMap.motorL2;
	
	public void robotInit() {
		
		motorR1.changeControlMode(TalonControlMode.PercentVbus);
		rightSlave.changeControlMode(TalonControlMode.Follower);
		motorL1.changeControlMode(TalonControlMode.PercentVbus);
		leftSlave.changeControlMode(TalonControlMode.Follower);
		
		rightSlave.set(motorR1.getDeviceID());
		leftSlave.set(motorL1.getDeviceID());
		
		motorR1.enableBrakeMode(true);
		rightSlave.enableBrakeMode(true);
		motorL1.enableBrakeMode(true);
		leftSlave.enableBrakeMode(true);
	}
	
	public void Drive(double LMotor, double RMotor){
		motorR1.set(-RMotor);
		rightSlave.set(-RMotor);
		motorL1.set(LMotor);
		leftSlave.set(LMotor);
	}
	public static void RightDrive(double RMotor){
		motorR1.set(-RMotor);
		rightSlave.set(-RMotor);
	}
	
	public static void LeftDrive(double LMotor){
		motorL1.set(LMotor);
		leftSlave.set(LMotor);
	}
	
	public void resetEncoders(){
		motorR1.setPosition(0);
		rightSlave.setPosition(0);
		motorL1.setPosition(0);
		leftSlave.setPosition(0);
	}
	
	public void resetRightEncoders(){
		motorR1.setPosition(0);
		rightSlave.setPosition(0);
	}
	
	public void resetLeftEncoders(){
		motorL1.setPosition(0);
		leftSlave.setPosition(0);
	}
	
	public int LeftEncoderValue(){
		int leftRelative = motorL1.getEncPosition();
		return leftRelative;
	}
	
	public int RightEncoderValue(){
		int rightRelative = motorR1.getEncPosition();
		return rightRelative;
	}
	
	public int RightEncoderVelocity(){
		int rightRelSpeed = motorR1.getEncVelocity();
		return rightRelSpeed;
	}
	
	public int LeftEncoderVelocity(){
		int leftRelSpeed = motorL1.getEncVelocity();
		return leftRelSpeed;
	}
	
	public boolean RightEncoderStatus(){
		
		FeedbackDeviceStatus rightSensor = motorR1.isSensorPresent(FeedbackDevice.CtreMagEncoder_Relative);
		
		switch(rightSensor){
		case FeedbackStatusPresent:
			break;
		case FeedbackStatusNotPresent:
			break;
		case FeedbackStatusUnknown:
			break;
		}
		
		boolean rightIn = (FeedbackDeviceStatus.FeedbackStatusPresent == rightSensor);
		
		return rightIn;
	}
	
	public boolean LeftEncoderStatus(){
		
		FeedbackDeviceStatus leftSensor = motorL1.isSensorPresent(FeedbackDevice.CtreMagEncoder_Relative);
		
		switch(leftSensor){
		case FeedbackStatusPresent:
			break;
		case FeedbackStatusNotPresent:
			break;
		case FeedbackStatusUnknown:
			break;
		}
		
		boolean leftIn = (FeedbackDeviceStatus.FeedbackStatusPresent == leftSensor);
		
		return leftIn;
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new JoyStickTankDrive());
		
	}

}
