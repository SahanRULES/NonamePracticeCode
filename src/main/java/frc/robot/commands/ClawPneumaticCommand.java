// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClawPneumaticSubsystem;

public class ClawPneumaticCommand extends CommandBase {
  /** Creates a new ClawPneumaticCommand. */
  private ClawPneumaticSubsystem m_clawPneumaticSubsystem;
  private boolean isClawClosed;
  private Timer m_timer;
  public ClawPneumaticCommand(ClawPneumaticSubsystem clawPneumaticSubsystem) {
      m_clawPneumaticSubsystem = clawPneumaticSubsystem;  
      m_timer = new Timer();

      addRequirements(m_clawPneumaticSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    isClawClosed = m_clawPneumaticSubsystem.isClawClosed(); 
    if(isClawClosed){
      m_clawPneumaticSubsystem.closeClaw();
      System.out.println("close claw");
    }
    else{
      m_clawPneumaticSubsystem.openClaw();
      System.out.println("open claw");

    }
    m_timer.reset();
    m_timer.start();
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
    if(m_timer.get()>1.5){
      m_timer.stop();
      return true;
    }
    return false;
  }
}
