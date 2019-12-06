/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.*;
public class Robot extends TimedRobot {

  public static Drivetrain m_Drivetrain = new Drivetrain();
  public static ArmElbow m_ArmElbow = new ArmElbow();
  public static XboxController controller = new XboxController(RobotMap.ControllerPort);
  public static ArmShoulder m_ArmShoulder = new ArmShoulder();

  private Scheduler scheduler = Scheduler.getInstance();
  @Override  public void robotInit() {
  }
  @Override
  public void autonomousInit() {
  }
  @Override
  public void autonomousPeriodic() {
  }
  @Override
  public void teleopInit() {
  
  }
  //Use subsystems and command classes whenever applicable, a lot cleaner.
  @Override
  public void teleopPeriodic() {
    //This function updates Command Queue,
    //This Queue is made up of Commands that are queued up by 
    //various parts of the program.
    scheduler.run();
  }
  @Override  public void testPeriodic() {

  }
}