package frc.robot.command;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class AutoDrive extends CommandBase{
    Drivetrain drivetrain;
    double leftSpeed;
    double rightSpeed;
    


    public AutoDrive(Drivetrain dt, double ls, double rS) {
        drivetrain = dt;
        leftSpeed = ls;
        rightSpeed = rS;
        
        addRequirements(drivetrain);
    }

    public void initialize() {
        drivetrain.stop();
    }

    public void execute() {
        drivetrain.drive(leftSpeed, rightSpeed);
    }

    public boolean isFinished() {
        return false;
        
    }

    public void end(boolean stop) {
        drivetrain.stop();
    }

}
