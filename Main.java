package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Массив участников
      Competitions[] participants = new Competitions[8];
            participants[0] = new Cat(3.5f,87.8f, "Барсик");
            participants[1] = new Cat(2.1f,77.1f, "Мурзик");
            participants[2]= new Human(3.1f,73.0f,"Павел", Gender.BOYS);
            participants[3] = new Cat(1.5f,88.8f, "Афоня");
            participants[4] = new Human(2.3f,60.f,"Юля",Gender.GIRLS);
            participants[5] = new Human(3.3f,90.f,"Алина",Gender.GIRLS);
            participants[6] = new Robot(10.1f,100.0f,"Железяка");
            participants[7] = new Robot(11.0f,60.9f,"Амиго");

            //Массив преград
      Obstacles[] obstacles = new Obstacles[7];
            obstacles[0] = new Wall(1.2f,"Стена 1");
            obstacles[1] = new Wall(2.2f,"Стена 2");
            obstacles[2] = new Treadmill(53.2f,"Дорожка 1");
            obstacles[3] = new Wall(3.2f,"Стена 3");
            obstacles[4] = new Treadmill(73.2f,"Дорожка 2");
            obstacles[5] = new Treadmill(80.2f,"Дорожка 3");
            obstacles[6] = new Wall(1.9f,"Стена 4");

            //Проводим соревнования
        for (Competitions c: participants) {
            for (Obstacles o: obstacles) {

                //Проверям, что участник говтов к новому препятствию
                // (если он не сошел с предыдущего)
                if(!c.isReady()) {
                    System.out.println("Сошел с дистанции..");
                    break;
                }
                 //если тип препятствия стена, то прыгаем
                if(o.getType().equals("стена")){
                    c.jump(o);
                }
                // если тип препятствия дорожка, бежим
                if(o.getType().equals("дорожка")){
                    c.run(o);
                }
            }

        }
    }


}
