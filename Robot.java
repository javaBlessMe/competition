package com.company;

public class Robot implements Competitions {
    private float heightJump, distanceRun;
    private String name;

    //Переменная, показывающая, что участник готов к новым препятствиям
    //Если участник не проходит препятствие, то она становиться fasle
    private boolean isReady;

    public Robot(float heightJump, float distanceRun, String name) {
        this.heightJump = heightJump;
        this.distanceRun = distanceRun;
        this.name = name;
        this.isReady = true;
    }

    @Override
    public void run(Obstacles obstacles) {
        if(obstacles.getValue()<=this.distanceRun){
            System.out.println("Робот "+this.name+" пробежал "+obstacles.getName());
        }
        else
        {
            System.out.println("Робот "+this.name+" не смог пробежать "+obstacles.getName());
            this.isReady = false;
        }

    }

    @Override
    public void jump(Obstacles obstacles) {

        if ( obstacles.getValue()<=this.heightJump){
            System.out.println("Робот "+this.name+" перепрыгнул "+obstacles.getName());

        }
        else  {
            System.out.println("Робот "+this.name+" не смог перепрыгнуть "+obstacles.getName());
            this.isReady = false;
        }

    }

    @Override
    public boolean isReady() {
        return isReady;
    }
}
