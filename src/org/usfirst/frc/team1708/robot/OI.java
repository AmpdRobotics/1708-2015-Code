package org.usfirst.frc.team1708.robot;



import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;





/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   
	
	static RobotDrive woo;
	static Joystick js;
	static DoubleSolenoid sol, canLift;
	static Solenoid pancake, clamp, canCake;
	static Talon leftMotor, RightMotor ;
	static RobotDrive woo1;
	static Joystick s2;
	static Solenoid shifters;
	static Timer timer;
	static Talon intake, outtake;
	static Compressor compress;
	static AnalogGyro gyro;
	
	public OI(){
		
		compress = new Compressor();
		woo = new RobotDrive(0 , 1);
		js = new Joystick(0);
		sol = new DoubleSolenoid(1,2);
		pancake = new Solenoid(6);
		clamp = new Solenoid(7);
		s2 = new Joystick(1);
		shifters = new Solenoid(0);
		canLift = new DoubleSolenoid(4,5);
		canCake = new Solenoid(3);
		intake = new Talon(3);
		outtake = new Talon(2);
		
		//Add the Canlifter ^
	}
	
	
	
	//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public static RobotDrive getDrive(){
		if(js.getRawButton(7)){
			woo.arcadeDrive(js.getRawAxis(1)*.5, -js.getRawAxis(2)*.5);
		}else {
			
			woo.arcadeDrive(js.getRawAxis(1), -js.getRawAxis(2));
			
		}
		return woo;
    	
	}
	
	public static Joystick returnJs(){
		
		return js;
	}
	public static DoubleSolenoid getSol(){
		
		return sol;
		
		
		
	}
public static Solenoid getsolenoid(){
		
		return pancake;
		
	}
public static Solenoid getClamp(){
	return clamp;
}
	public static RobotDrive getWoo(){
		
		return woo;
		
		
	}
	public static Talon getRightMotor(){
		return RightMotor;
		
		
		
	}
	public static Talon getLeftMotor(){
		return leftMotor;
	}
	public static Joystick getSecondS(){
		return s2;
	}
	public static Solenoid GetShifter(){
		
		return shifters;
	}
	
	public static RobotDrive driveWoo(){
		return woo;
		      
		
		
	}
	public static Timer getTimer(){
		return timer;
	}
	
	public static DoubleSolenoid getCan(){
		
		
		return canLift;
	}
	public static Solenoid getcanCake(){
		
		return canCake;
	}
	public static Talon intake(){
		return intake;
	}
	public static Talon outtake(){
		return outtake;
	}
	public static Compressor getCompressor(){
		return compress;
	}
	
	public static AnalogGyro getGyro(){
		return gyro;
	}
}

