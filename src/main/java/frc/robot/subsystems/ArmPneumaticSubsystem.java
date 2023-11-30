// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmPneumaticSubsystem extends SubsystemBase {
  /** Creates a new ClawPneumaticSubsystem. */
  private DoubleSolenoid doubleSolenoid;

  public ArmPneumaticSubsystem() {
    doubleSolenoid = new DoubleSolenoid(
      Constants.PNEUMATIC_HUB_CANID,  //Pneumatic Hub CANID
      PneumaticsModuleType.CTREPCM,    //Type of Pneumatic Module
      Constants.ARM_CLOSE_CHANNEL,        // Close Channel
      Constants.ARM_OPEN_CHANNEL);        //Open Channel
  }

  public boolean isArmExtended(){
    System.out.println("isArmExtended");
    return doubleSolenoid.get() == Value.kForward; //Gets true or false value on whether arm is extended or not
  }

  public void extendArm(){
    doubleSolenoid.set(Value.kReverse);  //retracts arm
    System.out.println("Retract Arm");
  }
  

  public void retractArm(){
    doubleSolenoid.set(Value.kForward); //extends arm
  }

  public void changePosition(){       //Goes to opposite possition of current position
    doubleSolenoid.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
