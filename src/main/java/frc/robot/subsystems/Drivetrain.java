/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;
import frc.robot.RobotMap;
/**
 * This is the Drivetrain representation of the robot.
 */
public class Drivetrain extends Subsystem {
    SpeedControllerGroup leftMotors  = new SpeedControllerGroup(
        new WPI_VictorSPX(RobotMap.driveMotors.leftMotor1),
        new WPI_TalonSRX(RobotMap.driveMotors.leftMotor2)
    );
    SpeedControllerGroup rightMotors  = new SpeedControllerGroup(
        new WPI_VictorSPX(RobotMap.driveMotors.rightMotor1),
        new WPI_TalonSRX(RobotMap.driveMotors.rightMotor2)
    );
    
    DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);

    public void drive(double Speed, double Rotation){
        robotDrive.arcadeDrive(Speed, Rotation);
    }

    //This method makes Drive(); the default command. 
    //The command just allows you to drive around w/ Controller, as definde in Drive
    //Command. 
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

}