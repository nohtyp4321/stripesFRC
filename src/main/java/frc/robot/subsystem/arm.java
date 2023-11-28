package frc.robot.subsystem;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class arm extends SubsystemBase {
    VictorSP armVictor;


    public arm() {

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

