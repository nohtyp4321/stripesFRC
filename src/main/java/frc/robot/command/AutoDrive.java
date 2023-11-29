package frc.robot.command;


import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.Drivetrain;

public class AutoDrive {
    Drivetrain drivetrain;
    Timer timer;
    double leftSpeed;
    double rightSpeed;
    double time;


    public AutoDrive(Drivetrain dt, double ls, double rS, double t) {
        drivetrain = dt;
        leftSpeed = ls;
        rightSpeed = rS;
        timer = new Timer();
        time = t;
  
    }

    public void initialize() {
        timer.reset();
        timer.start();
    }

    public void execute() {
        drivetrain.drive(leftSpeed, rightSpeed);
    }

    public boolean isFinished() {
        return timer.get() > time;
    }

    public void end(boolean stop) {

    }

}
