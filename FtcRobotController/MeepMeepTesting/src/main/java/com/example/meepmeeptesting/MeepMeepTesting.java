package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.MeepMeep.Background;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {

    public MeepMeepTesting() {
    }

    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);
        RoadRunnerBotEntity myBot = (new DefaultBotBuilder(meepMeep)).setConstraints(60.0D, 60.0D, Math.toRadians(180.0D), Math.toRadians(180.0D), 15.0D).followTrajectorySequence((drive) -> {
            return drive.trajectorySequenceBuilder(new Pose2d(34.5D, 60.0D, 0.0D)).strafeRight(30.0D).lineToLinearHeading(new Pose2d(34.0D, 0.0D, Math.toRadians(180.0D))).forward(1.0D).back(1.0D).turn(Math.toRadians(180.0D)).strafeLeft(12.5D).forward(26.0D).lineToLinearHeading(new Pose2d(34.0D, 12.5D, Math.toRadians(180.0D))).strafeLeft(12.5D).forward(1.0D).back(1.0D).turn(Math.toRadians(180.0D)).strafeLeft(12.5D).forward(26.0D).lineToLinearHeading(new Pose2d(34.0D, 12.5D, Math.toRadians(180.0D))).strafeLeft(12.5D).forward(1.0D).back(1.0D).turn(Math.toRadians(180.0D)).strafeLeft(12.5D).forward(26.0D).lineToLinearHeading(new Pose2d(34.0D, 12.5D, Math.toRadians(180.0D))).strafeLeft(12.5D).forward(1.0D).back(1.0D).strafeRight(35.0D).forward(30.0D).build();
        });
        meepMeep.setBackground(Background.FIELD_POWERPLAY_OFFICIAL).setDarkMode(true).setBackgroundAlpha(0.95F).addEntity(myBot).start();
    }

}
