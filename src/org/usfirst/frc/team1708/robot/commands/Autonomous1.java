package org.usfirst.frc.team1708.robot.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous1 extends CommandGroup{

	public Autonomous1() {   
		//addSequential(new CheckSolenoid());
		//////////////////AUTO ONE/////////////////////////////
		addParallel(new Wheels());
		addSequential(new MoveForwardShort());
		
		addSequential(new PickupTote());
		
		addSequential(new MoveForwardShort());
		
		
		
		/*
		/////////////////////////////////////////////////////
		
		
		addSequential(new PickupTote());
		
		//addSequential(new GyroCalibration());
		
		addSequential(new DropDownTote());
		
		addSequential(new PickupTote());
		//turn the  wheels in and pick up the present tote
		addParallel(new Wheels());
		addSequential(new MoveForward());
		// Make the outward wheels to turn
		
		addSequential(new DropDownTote());
		//Drop down the compartment in the pick-up area
		addSequential(new PickupTote());
		
		addParallel(new Wheels());
		addSequential(new MoveForward());
		 Make the outward wheels to turn
		
		addSequential(new DropDownTote());
		
		addSequential(new TurnLeft());
		
		addSequential(new MoveForwardLong());
		
		
		//turn to the left approximately 90 to 100 degrees
		addSequential(new CheckSolenoid());
		
		addSequential(new MoveBack2());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		addSequential(new DropDownTote());
		
		addSequential(new MoveForward());
		
		addSequential(new PickupTote());
		
		//addSequential(new ShortTurnLeft());
		
		//addSequential(new MoveForwardShort());
		
		//addSequential(new ShortTurnRight());
		
		//addSequential(new TurnRight());
		
		//addSequential(new MoveForwardShort());
		
		addSequential(new MoveForward());
		
		addSequential(new DropDownTote());
		
		addSequential(new PoundCakesOut());
		 
		addSequential(new TurnLeft());
		*/
		
		//addSequential(new MoveForward());
		//addSequential(new MoveForward());
		//addSequential(new MoveForward());
       
     //  addSequential(new PickupTote());
       
       //addSequential(new MoveForward());
       
      // addSequential(new PickupTote());
       
      // addSequential(new MoveForward());
		
    }

   
}
