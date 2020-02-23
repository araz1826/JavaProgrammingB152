package day41;

public class Tv_1 {
    /*TV
    attributes :
    brand , isOn , currentChannel
    Stirng , boolean , int   (range from 1-50)
    behaviours :
    turnOn turnOff
    getcurrentChannel
    setcurrentChannel (newChannelNumber)
    moveForward moveBackward*/

    String name;
    boolean isOn;  //isOn:false, java automaticallt set it
    int currentChannel;

    public int currentChannel(){

        return currentChannel;
    }
// note: you can not set channel if tv is off
    public void setCurrentChannel( int newChannelNumber){
        if(newChannelNumber<0 || newChannelNumber>50){
            System.out.println("invalid channel");
            return; //mean get out of your method.. break is for loop
        }
      if(isOn=true){
          currentChannel=newChannelNumber;
      }else {
          System.out.println("turn the TV ON");
      }
    }

    public void turnOn(){
        if(isOn==false){
            System.out.println("Turn on Tv");
            isOn=true;
        }
    }

    public void turnOff(){
        if(isOn==true){
            System.out.println("Turn off tv");
            isOn=false;
        }
    }
    public String toString(){
        return "name: "+name+" isOn: "+isOn+ " currentChannel: "+currentChannel;
    }
}
