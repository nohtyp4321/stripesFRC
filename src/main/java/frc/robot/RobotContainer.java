// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import frc.robot.command.AutoDrive;
import frc.robot.command.Drive;
import frc.robot.command.FancyAuto;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Arm;
import frc.robot.command.BasicAuto;
import frc.robot.command.FancyAuto;

public class RobotContainer {
  Drivetrain dt = new Drivetrain();
  Joystick left = new Joystick(0);
  Joystick right = new Joystick(1);
  JoystickButton raiseArm = new JoystickButton(left, 2);
  JoystickButton lowerArm = new JoystickButton(right, 2);
  Arm arm = new Arm();
  Drive teleopCommand = new Drive(dt, left, right);
  BasicAuto basic = new BasicAuto(dt, arm);
  FancyAuto fancy = new FancyAuto(dt, arm);
  

  public RobotContainer() {
    dt.setDefaultCommand(teleopCommand);
    configureBindings();
  }

  private void configureBindings() {
    raiseArm.onTrue(new InstantCommand(() -> arm.moveArm(0.5)));
    lowerArm.onTrue(new InstantCommand(() -> arm.moveArm(-0.5)));
  }

  public Command getAutonomousCommand() {
   return basic;
  }

  // public Command getTeleopCommand() {
  //   return teleopCommand;
  // }
}
