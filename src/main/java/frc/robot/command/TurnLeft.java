package frc.robot.command;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.command.Drive;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class TurnLeft extends SequentialCommandGroup {
    Drivetrain drivetrain;
    public TurnLeft(Drivetrain TR) {
        drivetrain = TR;
        addRequirements(drivetrain);
        addCommands(
            new AutoDrive(drivetrain, -0.5, 0.5).withTimeout(1)
            

        );
    } 

}