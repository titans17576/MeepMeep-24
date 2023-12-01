package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

import org.jetbrains.annotations.NotNull;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
enum Positions
{

    BLUE_BACKDROP(new Pose2d(-60,12,Math.toRadians(0))),
    BLUE_LANDING(new Pose2d(-60,-36,Math.toRadians(0))),
    RED_BACKDROP(new Pose2d(60,12,Math.toRadians(180))),
    RED_LANDING(new Pose2d(60,-36,Math.toRadians(180)));

    private Pose2d value;
    public Pose2d value()
    {
        return this.value;
    }

    private Positions(Pose2d value)
    {
        this.value = value;
    }
}

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(700);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .setDimensions(12,16)
                .followTrajectorySequence(drive ->
                        Noah.redLeft(drive, Positions.RED_LANDING.value())
                );
        Image img = null;
        try { img = ImageIO.read(new File("./MeepMeepTesting/src/main/java/com/example/meepmeeptesting/CENTERSTAGE_OFFICIAL.png")); }
        catch (IOException e) {}

        meepMeep.setBackground(img)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}