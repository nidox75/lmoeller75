package com.techelevator;

public class Television {
    private boolean tvOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public void turnOff() {
        tvOn = false;
    }
    public void turnOn() {
        tvOn = true;
        currentChannel = 3;
        currentVolume = 2;
    }
    public void changeChannel(int newChannel) {
        if(tvOn == true) {
            if(newChannel > 2 && newChannel < 19) {
                currentChannel = newChannel;
            }
        }
    }
    public void channelDown() {
        if(tvOn == true) {
            currentChannel--;
            if(currentChannel < 3) {
                currentChannel = 18;
            }
        }
    }
    public void raiseVolume() {
        if(tvOn == true) {
            if(currentVolume < 10) {
                currentVolume++;
            }
        }
    }
    public void lowerVolume() {
        if(tvOn == true) {
            if (currentVolume > 0) {
                currentVolume --;
            }
        }
    }

    public boolean isTvOn() {
        return tvOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
