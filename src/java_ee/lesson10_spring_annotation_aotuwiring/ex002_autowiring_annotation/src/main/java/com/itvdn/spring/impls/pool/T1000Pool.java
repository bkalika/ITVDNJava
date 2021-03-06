package com.itvdn.spring.impls.pool;

import com.itvdn.spring.interfaces.Robot;
import com.itvdn.spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection){
        this.robotCollection = robotCollection;
    }

    public Collection<Robot> getRobotCollection(){
        return robotCollection;
    }

    public void action(){
        for(Robot robot : robotCollection){
            robot.action();
        }
    }
}
