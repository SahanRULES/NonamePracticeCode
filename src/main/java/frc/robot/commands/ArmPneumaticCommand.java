// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmPneumaticSubsystem;

public class ArmPneumaticCommand extends CommandBase {
  /** Creates a new ArmPneumaticCommand. */
  private ArmPneumaticSubsystem m_armPneumaticSubsystem;
  boolean toExtend; //boolean tells want position they want the arm to be in
  public ArmPneumaticCommand(ArmPneumaticSubsystem armPneumaticSubsystem, boolean toExtend) {  
    // Use addRequirements() here to declare subsystem dependencies.
    m_armPneumaticSubsystem = armPneumaticSubsystem;
    this.toExtend = toExtend;

    addRequirements(m_armPneumaticSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(toExtend==true){  //If user wanted the arm to extend toExtend would be true and it would extend
      m_armPneumaticSubsystem.extendArm();
    }
    else{                //If toExtend is false user wants arm to retract so it would retract
      m_armPneumaticSubsystem.retractArm();
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
