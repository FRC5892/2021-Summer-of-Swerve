// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SwerveDriveTrain;

public class DriveTrainTest extends CommandBase {
	private final SwerveDriveTrain swerveDriveTrain;

	/** Creates a new DriveWithJoysticks. */
	public DriveTrainTest(SwerveDriveTrain sdt) {
		swerveDriveTrain = sdt;
		addRequirements(swerveDriveTrain);
		// Use addRequirements() here to declare subsystem dependencies.
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
		swerveDriveTrain.setMotors(.25);
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		swerveDriveTrain.stop();
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}