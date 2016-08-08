package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.OI;
//import org.usfirst.frc.team1708.robot.commands.Autonomous1;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
@SuppressWarnings({"unused"})
public class AutonomousDrive extends Subsystem {
    	static AnalogGyro gyro1;
		static RobotDrive woo1;
		static Talon LeftT,RightT;
		static DoubleSolenoid autos1,can;
		static Solenoid autopan;
		static Timer timer2;
		static Solenoid canCake2;
		static boolean soul, seal=true;
		static Solenoid pancake;
		static double kp=0.003;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public AutonomousDrive(){
	
     //woo1 = new RobotDrive(rm, lm);
	autos1 = OI.getSol();
	RightT = OI.intake();
	LeftT = OI.outtake();
	gyro1 = OI.getGyro();
     
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	//setDefaultCommand(new Autonomous1());
    	
    }
    
   // @SuppressWarnings("deprecation")
	public static void moveForward(){
    	
    	woo1 = OI.getWoo();
    	
    	//woo1.drive(-0.35 , 0);  // changed at wvrox
    	woo1.drive(-1 , 0);  // changed at wvrox
    	
    	
    	Timer.delay(0.1);
    	

    	
    }
    
    public static void moveForwardShort(){
    	woo1.drive(-0.4,0);
    }
    
    
    
    public static void moveBackward(){
    	
    	woo1 = OI.getWoo();
    	woo1.drive(0.6, 0.0);
    
    	
    }
    
    public static void picktote(){
    	autos1 = OI.getSol();
    	autopan = OI.getsolenoid();
    	RightT.set(1.0);
    	LeftT.set(1.0);
    	Timer.delay(0.5);
    	autopan.set(false);
    	autos1.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(1);
    	
    	
    	autopan.set(true);
    	Timer.delay(.5);
    	autos1.set(DoubleSolenoid.Value.kForward);
    	Timer.delay(.5);
    }
    public static void droptote(){
    	autos1 = OI.getSol();
    	autopan = OI.getsolenoid();
    	autos1.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(.25);
    	autopan.set(false);
    	Timer.delay(.5);
    	
    }
    public static void stopDrive(){
    	
    	woo1.drive(0.0 , 0.0);
    	
    }
    public static void liftCan(){
    	canCake2 = OI.getcanCake();
    	can = OI.getCan();
    	canCake2.set(true);
    	//canCake2.set(false);
    	Timer.delay(1);
    	can.set(DoubleSolenoid.Value.kForward);
    	//Timer.delay(1);
    	//can.set(DoubleSolenoid.Value.kReverse);
    	//Timer.delay(.5);
    	//canCake2.set(true);
    	//Timer.delay(.5);
    	
    }
    public static void stopCan(){
    	
    	can.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(1);
    	//soul = false;D
    	canCake2.set(false);
    }
    		
    public static void poundCakesout(){
    	
    	pancake = OI.getsolenoid();
    	pancake.set(true);
    }
    
    public static void poundCakesin(){
    	
    	pancake.set(false);
    }
   
    
    public static void turnLeft(){
    	//woo1=OI.getWoo();
    	woo1.tankDrive(-0.9, 0.9);
    	
    	Timer.delay(.1);
    	
    }
    public static void turnRight(){

    	woo1.tankDrive(0.9, -0.9);
    	Timer.delay(.1);
    }
    public static void stopTurnLeft(){
    	
    	woo1.drive(0.0, 0.0);
    }
    public static void stopTurnRight(){
    	
    	woo1.drive(0.0, 0.0);
    	
    }
    public static void DropCan(){
    	
    	can.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(2);
    	canCake2.set(false);
    	
    	
    	
    }
    public static void MoveForwardLong(){
    	
    	woo1.drive(-0.4,0);
    }
    
    public static void checkSol(){
    		autopan.set(false);
    		Timer.delay(.8);
    		autos1.set(DoubleSolenoid.Value.kReverse);
    		//Timer.delay(2);
    	}
    	
    
    public static void turnWheels(){
    	RightT.set(.85);
    	LeftT.set(.85);
    	
    }
    public static void turnWheelsout(){
    	RightT.set(-0.5);
    	LeftT.set(-0.5);
    }
}

