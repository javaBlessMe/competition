package com.company;

public class Cat implements Competitions {
    private float heightJump, distanceRun;
    private String name;

   //Переменная, показывающая, что участник готов к новым препятствиям
    //Если участник не проходит препятствие, то она становиться fasle
    private boolean isReady;

    public Cat(float heightJump, float distanceRun, String name) {
        this.heightJump = heightJump;
        this.distanceRun = distanceRun;
        this.name = name;
        this.isReady = true;
    }

    @Override
    public void run(Obstacles obstacles) {
        if(obstacles.getValue()>this.distanceRun){
            System.out.println("Кот "+this.name+" не смог пробежать "+obstacles.getName());
            this.isReady = false;
        }
        else {
            System.out.println("Кот "+this.name+"  пробежал "+obstacles.getName());

        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        if(obstacles.getValue()>this.heightJump){
            System.out.println("Кот "+this.name+" не смог перепрыгнуть "+obstacles.getName()+" ...");
            this.isReady = false;
        }
        else {
            System.out.println("Кот "+this.name+"  перепрыгнул "+obstacles.getName()+"!!!!");

        }
    }

    @Override
    public boolean isReady() {
        return isReady;
    }
}



