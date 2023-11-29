package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class MoveArm extends CommandBase {
    Arm a;
    double speed;
    
    public MoveArm(Arm Arm, double S) {
        a = Arm;
        speed = S;

        super.addRequirements(a);
    }

    public void execute() {
        a.drive(speed);
    }

    public boolean isFinished () {
        return false;
    }
    public void end(boolean stop) {
        a.stop();
    }
}
