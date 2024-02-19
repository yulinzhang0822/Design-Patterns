public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

    Light livingRoomLight = new Light("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOnCommand(livingRoomLight);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();
    
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();
  }
}
