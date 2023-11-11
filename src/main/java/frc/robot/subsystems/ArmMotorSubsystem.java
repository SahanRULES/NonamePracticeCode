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
  double m_poseTarget;
  double speed;
  Joystick hatJoystickRotationArm;
  TalonFX armMotor = new TalonFX(Constants.TALON_CHANNEL);
  Joystick sliderJoystick = new Joystick(Constants.LEFT_JOYSTICK_CHANNEL);
  public ArmMotorSubsystem() {}


  public void moveArm(){
    speed = sliderJoystick.getThrottle()/4;
    System.out.println(speed);
    armMotor.set(ControlMode.PercentOutput,speed);
  }


  public void zeroArmPower(){
    armMotor.set(ControlMode.PercentOutput, 0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
