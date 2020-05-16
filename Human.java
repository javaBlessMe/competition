package com.company;

public class Human implements Competitions {
    private float heightJump, distanceRun;
    private String name;

    //Переменная, показывающая, что участник готов к новым препятствиям
    //Если участник не проходит препятствие, то она становиться fasle
    private boolean isReady;
    private Gender gender;

    public Human(float heightJump, float distanceRun, String name, Gender gender) {
        this.heightJump = heightJump;
        this.distanceRun = distanceRun;
        this.name = name;
        this.gender = gender;
        this.isReady = true;
    }

    @Override
    public void run(Obstacles obstacles) {
        if(this.gender == Gender.GIRLS && obstacles.getValue()<=this.distanceRun){
            System.out.println("Девушка "+this.name+" пробежала "+obstacles.getName());
        }
        else if (this.gender == Gender.GIRLS && obstacles.getValue()>this.distanceRun){
            System.out.println("Девушка "+this.name+"не смогла пробежать "+obstacles.getName());
            this.isReady = false;
        }
        else if (this.gender == Gender.BOYS && obstacles.getValue()<=this.distanceRun){
            System.out.println("Молодой человек "+this.name+" пробежал "+obstacles.getName());

        }
        else if (this.gender == Gender.BOYS && obstacles.getValue()>this.distanceRun){
            System.out.println("Молодой человек "+this.name+"не смог пробежать "+obstacles.getName());
            this.isReady = false;
        }
    }

    @Override
    public void jump(Obstacles obstacles) {
        if(this.gender == Gender.GIRLS && obstacles.getValue()<=this.heightJump){
            System.out.println("Девушка "+this.name+" перепрыгнула "+obstacles.getName());
        }
        else if (this.gender == Gender.GIRLS && obstacles.getValue()>this.heightJump){
            System.out.println("Девушка "+this.name+"не смогла перепрыгнуть "+obstacles.getName());
            this.isReady = false;
        }
        else if (this.gender == Gender.BOYS && obstacles.getValue()<=this.heightJump){
            System.out.println("Молодой человек "+this.name+" перепрыгнул "+obstacles.getName());

        }
        else if (this.gender == Gender.BOYS && obstacles.getValue()>this.heightJump){
            System.out.println("Молодой человек "+this.name+" не смог перепрыгнуть "+obstacles.getName());
            this.isReady = false;
        }

    }

    @Override
    public boolean isReady() {
        return isReady;
    }
}
