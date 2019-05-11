package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
/*1*/   Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
/*2*/   CeilingFan fan = new CeilingFan();
        CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
        CeilingFanLowCommand fanLow = new CeilingFanLowCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
/*3*/   Garage garage = new Garage();
        GarageOpenCommand garageOpen = new GarageOpenCommand(garage);
        GarageCloseCommand garageClose = new GarageCloseCommand(garage);
/*4*/   Kitchen kitchen = new Kitchen();
        KitchenOnCommand kitchenOn = new KitchenOnCommand(kitchen);
        KitchenOffCommand kitchenOff = new KitchenOffCommand(kitchen);
/*5*/   LivingRoom living = new LivingRoom();
        LivingRoomOffCommand livingOff = new LivingRoomOffCommand(living);
        LivingRoomOnCommand livingOn =   new LivingRoomOnCommand(living);
/*6*/   Stereo stereo = new Stereo();
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(fanHigh);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

        remote.setCommand(kitchenOn);
        remote.buttonWasPressed();

        remote.setCommand(livingOn);
        remote.buttonWasPressed();

        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
    }
}
