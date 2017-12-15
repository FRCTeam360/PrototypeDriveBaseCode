package org.usfirst.frc.team360.commands;

import org.usfirst.frc.team360.Subsystem.navX;
import org.usfirst.frc.team360.robot.RobotMap;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrueLocate extends navX{
	
	double accerlationX;
	double accerlationY;
	public double X;
	public double Y;
	public double YdistancePrev;
	public double XdistancePrev;
	public double Xvelocity;
	public double Yvelocity;
	public double XvelocityPrev;
	public double YvelocityPrev;
	public double timePrev;
	public double timeCurrent;
	public double DeltaTime;
	
	public void SetPreviousData(){
		timePrev = timeCurrent;
        XdistancePrev = X;
        YdistancePrev = Y;
        XvelocityPrev = Xvelocity;
        YvelocityPrev = Yvelocity;
	}
	
	public void GetTrueLocation(){
		double[] someDistance = RobotMap.someDistance;
		
		 timeCurrent = RobotMap.time.get();
		 DeltaTime = timeCurrent - timePrev;
		 
		 //Convert from (G-Force to Feet Per Second Squared) to Inches Per Second Squared
		 accerlationX = (RobotMap.accelX * 32.17404855561) * 12;
		 accerlationY = (RobotMap.accelY * 32.17404855561) * 12;
		
		 Xvelocity = accerlationX * DeltaTime + XvelocityPrev;
	     Yvelocity = accerlationY * DeltaTime + YvelocityPrev;
	     
	     someDistance[0] = Xvelocity * DeltaTime + XdistancePrev;
	     someDistance[1] = Yvelocity * DeltaTime + YdistancePrev;
	     SmartDashboard.putNumber("The current Y-axis acceleration is ", accerlationY);
	     SmartDashboard.putNumber("The current X-axis acceleration is " , accerlationX);
	     SmartDashboard.putNumber("XVelocity", Xvelocity);
	     SmartDashboard.putNumber("YVelocity", Yvelocity);
	     SmartDashboard.putNumber("The current X-axis distance is " , someDistance[0]);
	     SmartDashboard.putNumber("The current Y-axis distance is " , someDistance[1]);
	}
	
	public void initVariables(){
		accerlationX = RobotMap.accelX;
		accerlationY = RobotMap.accelY;
	    Y= 0; YdistancePrev= 0; XdistancePrev= 0; X= 0;
	    Xvelocity= 0; XvelocityPrev= 0; Yvelocity= 0; YvelocityPrev= 0;
	    timePrev= 0; timeCurrent= 0;
	}
	
	@Override
	protected void initDefaultCommand() {
		accerlationX = RobotMap.accelX;
		accerlationY = RobotMap.accelY;
	    Y= 0; YdistancePrev= 0; XdistancePrev= 0; X= 0;
	    Xvelocity= 0; XvelocityPrev= 0; Yvelocity= 0; YvelocityPrev= 0;
	    timePrev= 0; timeCurrent= 0;
	}
	
}
