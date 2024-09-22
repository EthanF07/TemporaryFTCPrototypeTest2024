package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TestTeleOp")

public class TestTeleOp extends OpMode {

    private PayloadPrototyping17063 payloadPrototyping17063;

    @Override
    public void init() {
        payloadPrototyping17063 = new PayloadPrototyping17063(this, telemetry);
    }

    @Override
    public void loop() {
        payloadPrototyping17063.operate(gamepad1, telemetry);
    }

    @Override
    public void stop() {
        payloadPrototyping17063.shutdown();
    }
}
