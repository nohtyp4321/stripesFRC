package frc.robot.command;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.command.AutoDrive;
import frc.robot.subsystems.Arm;
import frc.robot.command.MoveArm;

public class BasicAuto extends SequentialCommandGroup{
    Drivetrain drivetrain;
    Arm arm;

    public BasicAuto(Drivetrain dt, Arm a) {
        drivetrain = dt;
        arm = a;
        addCommands(
            //new AutoDrive(drivetrain, -0.5, -0.5).withTimeout(1),
            //new AutoDrive(drivetrain, -0.5, -0.75).withTimeout(1)
            //new MoveArm(arm, 0.5).withTimeout(2),
            //new AutoDrive(drivetrain, -0.5, 0.5).withTimeout(2),
            //new AutoDrive(drivetrain, 0.5, 0.5).withTimeout(2),
            new AutoDrive(drivetrain, 0.5, 0.5).withTimeout(5),
            new MoveArm(arm, 0.5).withTimeout(2)    
        );
    }

}
