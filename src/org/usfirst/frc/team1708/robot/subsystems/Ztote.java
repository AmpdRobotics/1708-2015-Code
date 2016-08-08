package org.usfirst.frc.team1708.robot.subsystems;

import org.usfirst.frc.team1708.robot.OI;
import org.usfirst.frc.team1708.robot.commands.lift2;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Ztote extends Subsystem {
    
	static boolean balance = false;
	
		static	DoubleSolenoid j;
		static Joystick s;
		static Solenoid p;
		static Solenoid c;
		static Joystick ts;
		static Solenoid shift2;
		static Talon intake2, outtake2;
		static Compressor ce;
public static void lift(){
		s = OI.returnJs();
		j = OI.getSol();
		p = OI.getsolenoid();
		c= OI.getClamp();
		ts= OI.getSecondS();
		ce= OI.getCompressor();
		shift2 = OI.GetShifter();
		intake2 = OI.intake();
		outtake2 = OI.outtake();
		ce.setClosedLoopControl(true);
		SmartDashboard.putBoolean("Compressing", ce.enabled());
		if(ts.getRawButton(4)){
			 p.set(true);
			j.set(DoubleSolenoid.Value.kForward);
		 SmartDashboard.putBoolean("lift", true);
		c.set(false);
		 
		}if(ts.getRawButton(2)){
			 p.set(false);
			j.set(DoubleSolenoid.Value.kReverse);
			 SmartDashboard.putBoolean("lift", false);
			c.set(false);
		}if(ts.getRawButton(5) && c.get()== true){
			
			c.set(false);
			p.set(false);
			Timer.delay(.5);
			
			
		} if(ts.getRawButton(5)){
			
			c.set(true);
			p.set(true);
			Timer.delay(.5);
		} /*if(s.getRawButton(3)){
			shift2.set(true);
		}else {
			
			shift2.set(false);
			
		}*/if(ts.getRawButton(8) && p.get()){
			p.set(false);
			Timer.delay(.5);
			
		}else {
			if(ts.getRawButton(8)){
			p.set(true);
			Timer.delay(.5);
			}
		} if(ts.getRawButton(1)&& balance== false){
			
			j.set(DoubleSolenoid.Value.kForward);
			Timer.delay(.5);
			balance = true;
		}else if(ts.getRawButton(1)){
			j.set(DoubleSolenoid.Value.kReverse);
			Timer.delay(.5);
			balance = false;
		}if(ts.getRawButton(6) && c.get() == false){
			c.set(true);
			Timer.delay(.5);
		}else if(ts.getRawButton(6) && c.get() == true){
			c.set(false);
			Timer.delay(.5);
			
		}
				
		if(s.getRawButton(6)){
			
			intake2.set(.85);
			outtake2.set(-.85);
		}else{
			if(s.getRawButton(5)){
				intake2.set(-0.2);
				outtake2.set(0.2);
				c.set(false);
				p.set(false);
				
			}
			else{
				intake2.set(0);
				outtake2.set(0);
			}
		}
			/*if(s.getRawButton(5)){
				
				intake2.set(-1);
				
			}
			if(s.getRawButton(6)){
				
				outtake2.set(-1);
				
			}*/
			/*if(s.getRawButton(7)){
				
				intake2.set(1);
				
			}
			if(s.getRawButton(8)){
	
				outtake2.set(1);
	
}*/
	}
	
	public static void intake(){
		
		
		
		
		
		
		/*if(s.getRawButton(2)){
			j.set(DoubleSolenoid.Value.kReverse);
			 Timer.delay(.5);
			 SmartDashboard.putBoolean("lift", false);
			}
				
		*/
	}
	
	public static void pushlift(){
		p = OI.getsolenoid();
		
		
		if(s.getRawButton(3)){
			
			p.set(false);
			
		}
	}
	
	public static void pulllift(){
		
		if(s.getRawButton(4)){
			p.set(true);
		}
		
		
	}
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
      
    	setDefaultCommand(new lift2());
    	
    }
    
    
    
}

