package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.roadrunner.DriveShim;
import com.noahbres.meepmeep.roadrunner.trajectorysequence.TrajectorySequence;

public class Zach {
    public static TrajectorySequence redBackdrop(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(startPose)
                .forward(24)
                .turn(Math.toRadians(90))
                .back(24)
                .back(12)
            .build();
    }
    public static TrajectorySequence blueBackdrop(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(startPose)
                .forward(24)
                .turn(Math.toRadians(-90))
                .back(24)
                .back(12)
                .build();
    }
}
