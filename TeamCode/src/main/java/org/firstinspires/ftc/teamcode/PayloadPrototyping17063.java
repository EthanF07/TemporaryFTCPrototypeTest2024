package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;


public class PayloadPrototyping17063 {
    DcMotor leftPivot;
    DcMotor cascade;

    public PayloadPrototyping17063(OpMode opMode, Telemetry telemetry) {
        leftPivot = opMode.hardwareMap.get(DcMotorEx.class, "leftPivot");
        cascade = opMode.hardwareMap.get(DcMotorEx.class, "cascade");

        leftPivot.setDirection(DcMotorEx.Direction.REVERSE);
        cascade.setDirection(DcMotorEx.Direction.FORWARD);

        leftPivot.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftPivot.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);
        cascade.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);

        leftPivot.setPower(0);
        cascade.setPower(0);
    }

    /*
    * Currently set to have the pivot and cascade operate on different joysticks
    */
    public void operate(Gamepad gamepad, Telemetry telemetry){
        double powerPivot = gamepad.left_stick_y;
        double powerCascade = gamepad.right_stick_y;

        leftPivot.setPower(powerPivot);
        cascade.setPower(powerCascade);

        telemetry.addData("Pivot Power: ", leftPivot.getPower());
        telemetry.addData("Cascade Power", cascade.getPower());
        telemetry.update();
    }

    public void shutdown() {
        leftPivot.setPower(0);
        cascade.setPower(0);
    }
}
