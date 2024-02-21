package Instruments;

 abstract class Instrument{
    void abstract play(){

    }
}

 class Piano extends Instrument{
     @Override
     void play() {
         System.out.println("Piano is playing tan tan tan");
     }

 }
 class Flute extends Instrument{
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot");
    }

}

class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class Instruments {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Flute();
        instruments[4] = new Guitar();
        instruments[5] = new Piano();
        instruments[6] = new Guitar();
        instruments[7] = new Flute();
        instruments[8] = new Piano();
        instruments[9] = new Guitar();

        for (int i = 0; i < instruments.length; i++) {

            instruments[i].play();

            if (instruments[i] instanceof Piano) {
                System.out.println("Instrument at index " + i + " is a Piano");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Instrument at index " + i + " is a Flute");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Instrument at index " + i + " is a Guitar");
            }
        }
    }
 }

