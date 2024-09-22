package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class PayloadPrototyping7438 {

    DcMotorEx verticalCascade;

    public PayloadPrototyping7438 (OpMode opMode, Telemetry telemetry) {
        verticalCascade = opMode.hardwareMap.get(DcMotorEx.class, "verticalCascade");
    }


}
