// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class ArmMotorSubsystem extends SubsystemBase {
  double m_poseTarget;
  double power;
  double fPO;
  double theta;
  Joystick hatJoystickRotationArm;
  TalonFX armMotor = new TalonFX(Constants.TALON_CHANNEL);
  Joystick sliderJoystick = new Joystick(Constants.LEFT_JOYSTICK_CHANNEL);
  AnalogInput encoder = new AnalogInput(Constants.ARM_ENCODER_ID);
  //PIDController pid = new PIDController(0.012, 0.0, 0.001);
  
  public ArmMotorSubsystem() {}


  public void moveArm(){
    power = sliderJoystick.getThrottle()/4;
    System.out.println(power);
    armMotor.set(ControlMode.PercentOutput,power);
    System.out.println(encoder.getValue());
  }


  public void zeroArmPower(){
    armMotor.set(ControlMode.PercentOutput, 0);
  }

  // public void keepArmUp(){
  //   theta = 360.0 * (encoder.getValue() - Constants.ARM_ENCODER_OFFSET) / 4096.0;
  //   theta %= 360.0;
  //   if (theta < 0){
  //     theta += 360.0;
  //   }
  //   fPO = (theta - 90.0);
  //   fPO %= 360.0;

  //   if (fPO  < 0){
  //     fPO += 360.0;
  //   }

  //   final double gain = Constants.ARM_MOTOR_FF_GAIN;
  //   double ffMotorPower = gain * Math.sin(Math.toRadians(fPO));
  //   double fbMotorPower = MathUtil.clamp(pid.calculate(theta,theta), Constants.ARM_RETRACTED_LOWER_LIMIT, Constants.ARM_RETRACTED_UPPER_LIMIT);
  //   double motorPower = .01*(fbMotorPower-ffMotorPower);
  //   System.out.println(motorPower);
  //   armMotor.set(ControlMode.PercentOutput, motorPower);
  // }
  @Override
  public void periodic() {
    //keepArmUp();
    // This method will be called once per scheduler run
  }
}
