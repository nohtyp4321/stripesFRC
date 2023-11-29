package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    VictorSP armVictor;

    public Arm() {
        armVictor = new VictorSP(2);
    }  
    
    public void drive (double armSpeed) {
        armVictor.set(armSpeed);
    }

    public void stop() {
        armVictor.stopMotor();
    }

    public Object moveArm(double d) {
        return null;
    }
}

