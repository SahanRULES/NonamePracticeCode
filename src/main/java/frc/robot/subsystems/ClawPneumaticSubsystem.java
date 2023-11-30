// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClawPneumaticSubsystem extends SubsystemBase {
  /** Creates a new ClawPneumaticSubsystem. */
  private DoubleSolenoid doubleSolenoid;

  public ClawPneumaticSubsystem() {
    doubleSolenoid = new DoubleSolenoid(
      Constants.PNEUMATIC_HUB_CANID,  //Pneumatic Hub CANID
      PneumaticsModuleType.CTREPCM,    //Type of Pneumatic Module
      Constants.CLAW_CLOSE_CHANNEL,        // Close Channel
      Constants.CLAW_OPEN_CHANNEL);        //Open Channel
  }

  public boolean isClawClosed(){
    return doubleSolenoid.get() == Value.kForward; //Gets true or false value on whether claw is open or not
  }

  public void openClaw(){
    doubleSolenoid.set(Value.kForward);
  }

  public void closeClaw(){
    doubleSolenoid.set(Value.kReverse);
  }

  public void changePosition(){
    doubleSolenoid.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
