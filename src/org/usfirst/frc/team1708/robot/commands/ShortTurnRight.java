package org.usfirst.frc.team1708.robot.commands;

import org.usfirst.frc.team1708.robot.Robot;
import org.usfirst.frc.team1708.robot.subsystems.AutonomousDrive;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShortTurnRight extends Command {

    public ShortTurnRight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.autos);
    	setTimeout(.28);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	AutonomousDrive.turnRight();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return  isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
