package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.roadrunner.DriveShim;
import com.noahbres.meepmeep.roadrunner.trajectorysequence.TrajectorySequence;

public class Noah {
    public static TrajectorySequence blueRight(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(new Pose2d(-60, -34, 0))
                //if TeamProp=left
                    //.lineToSplineHeading(new Pose2d(-35, -34, Math.toRadians(90)))
                //else if TeamProp=center
                    //.lineToSplineHeading(new Pose2d(-35, -36, Math.toRadians(0)))
                //else if TeamProp=right
                    .lineToSplineHeading(new Pose2d(-35, -36, Math.toRadians(270)))

                .build();

    }
    public static TrajectorySequence blueLeft(DriveShim drive, Pose2d startPose){
        return drive.trajectorySequenceBuilder(new Pose2d(-60, -34, 0))

                .lineToSplineHeading(new Pose2d(-50, 34, Math.toRadians(90)))
                .build();
    }
}

