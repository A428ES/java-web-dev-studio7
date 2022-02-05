package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD newCd = new CD();
        DVD newDvd = new DVD();

        newCd.spinDisc();
        newDvd.spinDisc();

        newCd.setDiscContent("Hello World: The Movie", 500);
        newCd.setDiscContent("Hola Mundo: La Segunda Parte", 200);

        newDvd.setDiscContent("Hello World 3", 4000);
        newDvd.setDiscTitle("Hello World 3: The Best One Yet");

        System.out.println(newDvd.getDiscTitle() + " is the movie title");
    }
}
