import Command.impl.*;
import pojo.CeilingFan;
import pojo.GarbageDoor;
import pojo.Light;
import pojo.Stereo;

public class RemoteControlSimulator {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("LivingRoom_Light");
        Light kitchenLight = new Light("Kitchen_Light");
        CeilingFan ceilingFan = new CeilingFan();
        GarbageDoor garbageDoor = new GarbageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingroomLIghtOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingroomLIghtOff = new LightOffCommand(livingRoomLight);

        LightOnCommand KItchenmLIghtOn = new LightOnCommand(kitchenLight);
        LightOffCommand KItchenLIghtOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarbageDoorOnCommand garbageDoorOnCommand = new GarbageDoorOnCommand(garbageDoor);
        GarbageDoorOffCommand garbageDoorOffCommand = new GarbageDoorOffCommand(garbageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingroomLIghtOn,livingroomLIghtOff);
        remoteControl.setCommand(1,KItchenmLIghtOn,KItchenLIghtOff);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,garbageDoorOnCommand,garbageDoorOffCommand);
        remoteControl.setCommand(4,stereoOnCommand,stereoOffCommand);

        for(int i=0;i<5;i++){
            remoteControl.pressOn(i);
            remoteControl.undoPush();
        }
        for(int i=0;i<5;i++){
            remoteControl.pressOff(i);
        }
    }
}
