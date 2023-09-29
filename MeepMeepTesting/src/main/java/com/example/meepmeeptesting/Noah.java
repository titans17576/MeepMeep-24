package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.roadrunner.DriveShim;
import com.noahbres.meepmeep.roadrunner.trajectorysequence.TrajectorySequence;

public class Noah {
    public static TrajectorySequence path1(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(startPose)
                .turn(Math.toRadians(45))
                .build();
    }
}
