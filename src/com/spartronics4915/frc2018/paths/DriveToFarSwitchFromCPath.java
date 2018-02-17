package com.spartronics4915.frc2018.paths;

import java.util.ArrayList;
import java.util.List;

import com.spartronics4915.frc2018.paths.PathBuilder.Waypoint;
import com.spartronics4915.lib.util.control.Path;
import com.spartronics4915.lib.util.math.RigidTransform2d;
import com.spartronics4915.lib.util.math.Rotation2d;
import com.spartronics4915.lib.util.math.Translation2d;

public class DriveToFarSwitchFromCPath implements PathContainer {

    ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();

    public DriveToFarSwitchFromCPath()
    {
        sWaypoints.add(new Waypoint(18,45,0,0));
        sWaypoints.add(new Waypoint(228,45,51,60));
        sWaypoints.add(new Waypoint(228,260,10,60));
        sWaypoints.add(new Waypoint(178,290,30,60));
        sWaypoints.add(new Waypoint(178,255,0,40)); //Intentional overshoot

    }

    @Override
    public Path buildPath()
    {
        return PathBuilder.buildPathFromWaypoints(sWaypoints);
    }

    @Override
    public List<Waypoint> getWaypoints()
    {
        return sWaypoints;
    }

    @Override
    public RigidTransform2d getStartPose()
    {
        return new RigidTransform2d(new Translation2d(18, 45), Rotation2d.fromDegrees(90.0));
    }

    @Override
    public boolean isReversed()
    {
        return false;
    }
    // WAYPOINT_DATA: [{"position":{"x":18,"y":45},"speed":0,"radius":0,"comment":""},{"position":{"x":228,"y":45},"speed":60,"radius":51,"comment":""},{"position":{"x":228,"y":260},"speed":60,"radius":10,"comment":""},{"position":{"x":178,"y":290},"speed":60,"radius":30,"comment":""},{"position":{"x":178,"y":255},"speed":40,"radius":0,"comment":"Intentional overshoot"}]
    // IS_REVERSED: false
    // FILE_NAME: DriveToFarSwitchFromCPath
}