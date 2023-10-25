package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.roadrunner.DriveShim;
import com.noahbres.meepmeep.roadrunner.trajectorysequence.TrajectorySequence;

public class Noah {
    public static TrajectorySequence redRight(DriveShim drive, Pose2d startPose) {
        return drive.trajectorySequenceBuilder(startPose)
                //if TeamProp=left {
                //.lineToSplineHeading(new Pose2d(-35, -34, Math.toRadians(90)
                //else if TeamProp=center
                //.lineToSplineHeading(new Pose2d(-35, -36, Math.toRadians(0)))
                //else if TeamProp=right
                .lineToSplineHeading(new Pose2d(-35, -36, Math.toRadians(270)))
                //}
                .waitSeconds(0.5)
                .lineToLinearHeading(startPose)
                .lineToLinearHeading(new Pose2d(-56, -57, Math.toRadians(270)))
                .lineToSplineHeading(new Pose2d(-12, -58, Math.toRadians(270)))
                .waitSeconds(2)
                .lineToLinearHeading(new Pose2d(-12, 58, Math.toRadians(270)))
                .build();

    }
    public static TrajectorySequence blueLeft(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(startPose)

                //if TeamProp=left {

                //else if TeamProp=center

                //else if TeamProp=right
                .lineToSplineHeading(new Pose2d(36, -36, Math.toRadians(270)))
                //}
                .waitSeconds(0.5)
                .lineToLinearHeading(new Pose2d(56, -36, Math.toRadians(270)))
                .lineToLinearHeading(new Pose2d(56, -57, Math.toRadians(270)))
                .lineToLinearHeading(new Pose2d(12, -58, Math.toRadians(270)))
                .waitSeconds(2)
                .lineToLinearHeading(new Pose2d(12, 58, Math.toRadians(270)))

                .build();
    }
}

