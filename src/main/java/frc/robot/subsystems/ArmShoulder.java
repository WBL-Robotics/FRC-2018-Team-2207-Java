/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ArmShoulder extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX motor = new WPI_TalonSRX(RobotMap.armMotors.shoulderMotor);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  /**
   * This is a method to move up the Arm's elbow.
   * @param speed
   * This parameter is a value between -1.0 and 1.0
   */
  //TODO: Make this use a freaking actual sensor, and hook it up to Arm Subsys.
  public void moveUp(double speed) {
    motor.set(speed);
  }
  public void moveDown(double speed){
    motor.set(-speed);
  }
  public void stopMoving(){
    motor.set(0);
  }
}
