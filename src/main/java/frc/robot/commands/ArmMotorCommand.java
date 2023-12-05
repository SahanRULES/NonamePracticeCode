// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmMotorSubsystem;

public class ArmMotorCommand extends CommandBase {
  /** Creates a new ArmMotorCommand. */
  private ArmMotorSubsystem m_armMotorSubsystem;
  public ArmMotorCommand(ArmMotorSubsystem armMotorSubsystem) {
    m_armMotorSubsystem = armMotorSubsystem;

    addRequirements(m_armMotorSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_armMotorSubsystem.moveArm();
    System.out.println(m_armMotorSubsystem.getEncoderCounts());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_armMotorSubsystem.zeroArmPower();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
