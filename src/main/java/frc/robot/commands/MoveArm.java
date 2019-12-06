/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveArm extends Command {
  XboxController controller = Robot.controller;
  public MoveArm() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_ArmElbow);
    requires(Robot.m_ArmShoulder);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.m_ArmElbow.moveUp(controller.getY(Hand.kRight)*.35);
    //Terenary operators store values depending on the bool prior.
    //After question mark, you get two potential values, (value if true) : (value if false)
    //This is a chained terenary, meaning it's (value if true) : (another terenary if false)
    //I generally don't like to chain terenary's, but this is honestly nicer in my opinion.
    double speed = controller.getBumper(Hand.kLeft) ? -1 : controller.getBumper(Hand.kRight) ? 1 : 0;
    Robot.m_ArmShoulder.moveUp(speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
