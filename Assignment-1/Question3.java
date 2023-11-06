/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;
abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the piano...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano...");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar...");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];
        instruments[0] = new Piano();
        instruments[1] = new Guitar();

        for (Instrument instrument : instruments) {
            instrument.play();
            instrument.tune();
        }
    }
}
