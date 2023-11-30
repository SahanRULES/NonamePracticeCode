// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  //Joystick channelss
  public static final int LEFT_JOYSTICK_CHANNEL = 0;
  public static final int RIGHT_JOYSTICK_CHANNEL = 1;

  //Pneumatic Channels
  public static final int PNEUMATIC_HUB_CANID = 15;
  public static final int CLAW_OPEN_CHANNEL = 5;
  public static final int CLAW_CLOSE_CHANNEL = 1;
  public static final int ARM_OPEN_CHANNEL = 7;
  public static final int ARM_CLOSE_CHANNEL = 0;

  //arm encoder constants
  public static final int ARM_ENCODER_ID = 7;
  public static final int ARM_ENCODER_OFFSET = -349;


  //arm motor constants
  public static final int TALON_CHANNEL = 21;
  public static final double ARM_MOTOR_FF_GAIN = -0.20;
  public static final int ARM_RETRACTED_LOWER_LIMIT = 25;
  public static final int ARM_RETRACTED_UPPER_LIMIT = 335;



  //hat constants
  public static final int HAT_JOYSTICK_ARM = LEFT_JOYSTICK_CHANNEL;
  
  //hat angles
  public static final int HAT_POV_ARM_UP = 0; 
  public static final int HAT_POV_ARM_DOWN = 180;
  
  public static final double HAT_POSE_CHANGE_PER_STEP = -0.03; 

  //Button Constatns
  public static final int CLAW_PNEUMATIC_BUTTON = 3;
  public static final int ARM_PNEUMATIC_BUTTON = 1;
  public static final int ARM_MOVE_BUTTON = 2;
}
