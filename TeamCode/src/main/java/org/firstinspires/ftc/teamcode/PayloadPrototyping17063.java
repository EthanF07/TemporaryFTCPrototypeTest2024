package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;


public class PayloadPrototyping17063 {
    DcMotor leftPivot;
    DcMotor rightPivot;

    public void init(OpMode opMode, Telemetry telemetry){
        leftPivot = opMode.hardwareMap.get(DcMotorEx.class, "leftPivot");
        rightPivot = opMode.hardwareMap.get(DcMotorEx.class, "rightPivot");

        leftPivot.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        rightPivot.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);

        leftPivot.setPower(0);
        rightPivot.setPower(0);
    }

    public void operate(Gamepad gamepad, Telemetry telemetry){
        double power = gamepad.left_stick_y;
        leftPivot.setPower(power);
        rightPivot.setPower(power);

        telemetry.addData("Power: ", power);
        telemetry.update();
    }

    public void shutdown() {
        leftPivot.setPower(0);
        rightPivot.setPower(0);
    }
}
