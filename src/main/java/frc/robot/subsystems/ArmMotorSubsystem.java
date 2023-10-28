// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class ArmMotorSubsystem extends SubsystemBase {
  /** Creates a new ArmMotorSubsystem. */
  Joystick hatJoystickRotationArm;
  TalonFX armMotor = new TalonFX(Constants.TALON_CHANNEL);
  public ArmMotorSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    hatJoystickRotationArm = new Joystick(Constants.HAT_JOYSTICK_ARM);
   // if()
  }
}
