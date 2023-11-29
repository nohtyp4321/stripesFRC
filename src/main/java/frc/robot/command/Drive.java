package frc.robot.command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase { 
    Drivetrain drivetrain;
    Joystick leftJoystick;
    Joystick rightJoystick;

    public Drive(Drivetrain a, Joystick b, Joystick c) {
        drivetrain = a;
        leftJoystick = b;
        rightJoystick = c;
        super.addRequirements(drivetrain);
        drivetrain.setDefaultCommand(this);
    }

    public void execute() {
        drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
    }
}