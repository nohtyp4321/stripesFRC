package frc.robot.subsystem;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    VictorSP rightMotor;
    VictorSP leftMotor;
 //   VictorSP motorArm = new VictorSP(2);

    public Drivetrain() {
        leftMotor = new VictorSP(0);
        rightMotor = new VictorSP(1);
        leftMotor.setInverted(true);
    }


    public void drive (double leftSpeed, double rightSpeed) {
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    }

    public void stop() {
        leftMotor.set(0);
        rightMotor.set(0);
    }


}