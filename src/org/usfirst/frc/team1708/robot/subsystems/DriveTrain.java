package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.OI;
import org.usfirst.frc.team1708.robot.commands.driver;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    static RobotDrive woo;
    static Joystick js;
    static Talon leftMotor;
    static Talon RightMotor;

    public DriveTrain(){
   // 	leftMotor = new Talon(0);
    //	RightMotor = new Talon(1);
    	
    	
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
  
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new driver());
    	
    }
    public static void arcadeDrive(){
    	OI.getDrive();
    
    	
    	
    }
    
    public static void driveForward( ){
		
    	//leftMotor.setRaw(5);
    	//RightMotor.setRaw(5);
    	
    	
    	//woo.drive(.5, 0);
    }
    public static void driveBackward(){
    	//leftMotor.setRaw(-5);
    	//RightMotor.setRaw(-5);
    }
}

