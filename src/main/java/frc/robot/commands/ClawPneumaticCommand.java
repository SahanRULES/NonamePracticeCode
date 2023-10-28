// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClawPneumaticSubsystem;

public class ClawPneumaticCommand extends CommandBase {
  /** Creates a new ClawPneumaticCommand. */
  ClawPneumaticSubsystem m_clawPneumaticSubsystem;
  boolean toExtend;
  public ClawPneumaticCommand(ClawPneumaticSubsystem clawPneumaticSubsystem, boolean toExtend) {
      m_clawPneumaticSubsystem = clawPneumaticSubsystem;
      this.toExtend = toExtend;

      addRequirements(m_clawPneumaticSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(toExtend == true){
      m_clawPneumaticSubsystem.openClaw();
    }
    else{
      m_clawPneumaticSubsystem.closeClaw();
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
