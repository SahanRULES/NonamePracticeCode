// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmPneumaticSubsystem;

public class ArmPneumaticCommand extends CommandBase {
  /** Creates a new ArmPneumaticCommand. */
  private ArmPneumaticSubsystem m_armPneumaticSubsystem;
  private Timer m_timer;
  private boolean isArmExtended;

  public ArmPneumaticCommand(ArmPneumaticSubsystem armPneumaticSubsystem) {  
    // Use addRequirements() here to declare subsystem dependencies.
    m_armPneumaticSubsystem = armPneumaticSubsystem;
    m_timer = new Timer();

    addRequirements(m_armPneumaticSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override

  public void initialize() {
    isArmExtended = m_armPneumaticSubsystem.isArmExtended();
    if(!isArmExtended){
      m_armPneumaticSubsystem.retractArm();
    }
    else{
      m_armPneumaticSubsystem.extendArm();
    }
    m_timer.reset();
    m_timer.start();
    // m_armPneumaticSubsystem.changePosition();
    System.out.println("ArmPneumaticCommand.initialize()");

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
    if(m_timer.get()>1.0 && isArmExtended!=m_armPneumaticSubsystem.isArmExtended()){
      m_timer.stop();
      return true;
    }
    
    return false;
  }
}
