package com.evaluation.patterns.structural.bridge;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.turnOn();
    }

    public void setChannel(){
        device.changeChanel();
    }

    void setVolume() {
        device.changeVolume();
    }
}
