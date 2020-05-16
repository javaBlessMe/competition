package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Competitions[] participants = new Competitions[3];
            participants[0] = new Cat(3.5f,67.8f, "Барсик");
            participants[1] = new Cat(2.1f,77.1f, "Мурзик");
            participants[2] = new Cat(1.5f,88.8f, "Афоня");

      Obstacles[] obstacles = new Obstacles[3];
            obstacles[0] = new Wall(1.2f,"Стена 1");
            obstacles[1] = new Wall(2.2f,"Стена 2");
            obstacles[2] = new Wall(3.2f,"Стена 3");

        for (Competitions c: participants) {
            for (Obstacles o: obstacles) {

                if(!c.isReady()) {
                    System.out.println("Сошел с дистанции..");
                    break;
                }

                if(o.getType().equals("стена")){
                    c.jump(o);
                }
                if(o.getType().equals("дорожка")){
                    c.run(o);
                }
            }

        }
    }


}
