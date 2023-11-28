package frc.robot.command;

import frc.robot.subsystem.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class Drive extends CommandBase { 
    Drivetrain drivetrain;
    Joystick leftJoystick;
    Joystick rightJoystick;

    public Drive(Drivetrain a, Joystick b, Joystick c) {
        drivetrain = a;
        leftJoystick = b;
        rightJoystick = c;
    }

    public void execute() {
        drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
    }
}