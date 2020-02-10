package com.evaluation.patterns.structural.bridge;

public class Domain {

    public static void main(String[] args) {
        Device tvDevice = new Tv();
        Device radioDevice = new Radio();

        RemoteControl tv = new RemoteTvControl(tvDevice);
        RemoteControl radio = new RemoteRadioControl(radioDevice);

        RemoteControl[] controls = new RemoteControl[]{tv, radio};

        for (RemoteControl control : controls) {
            control.togglePower();
            control.setChannel();
            control.setVolume();

            System.out.println("=======================");
        }

    }
}
