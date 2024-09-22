package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class ClawPrototyping {
    Servo claw;

    public ClawPrototyping(OpMode opMode, Telemetry telemetry) {

        claw = opMode.hardwareMap.get(Servo.class, "claw");

        claw.setPosition(-1);
    }


    public void operate (Gamepad gamepad) {
        if (gamepad.a) {
            claw.setPosition(0);
        }
        else if (gamepad.b) {
            claw.setPosition(-1);
        }
    }
}
