package edu.daniel.forthlesson;

public class SmatTV {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        this.on = true;
    }

    void turnOff() {
        this.on = false;
    }

    public void downVolume() {
        this.volume--;
    }

    public void upVOlume() {
        this.volume++;
    }

    public void nextChannel() {
        this.channel++;
    }

    public void previusChannel() {
        this.channel--;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
