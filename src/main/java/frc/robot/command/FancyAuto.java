package frc.robot.command;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.command.AutoDrive;
import frc.robot.subsystems.Arm;
import frc.robot.command.MoveArm;
import frc.robot.command.TurnLeft;
import frc.robot.command.TurnRight;

public class FancyAuto extends SequentialCommandGroup{
    Drivetrain drivetrain;
    Arm arm;

    public FancyAuto(Drivetrain dt, Arm a) {
        drivetrain = dt;
        arm = a;
        addCommands(
            /* 
            //new AutoDrive(drivetrain, -0.5, -0.5).withTimeout(1),
            //new AutoDrive(drivetrain, -0.5, -0.75).withTimeout(1)
            new MoveArm(arm, 0.5).withTimeout(2),
            new AutoDrive(drivetrain, -0.5, 0.5).withTimeout(2),
            new AutoDrive(drivetrain, 0.5, 0.5).withTimeout(2),
            */
            new AutoDrive(drivetrain, 0, 0).withTimeout(4),
            new AutoDrive(drivetrain, 0.5, -0.5).withTimeout(2),
            new AutoDrive(drivetrain, 0.5, 0.5).withTimeout(1.5),
            new AutoDrive(drivetrain, -0.5, 0.5).withTimeout(3)
        );
    }

}

