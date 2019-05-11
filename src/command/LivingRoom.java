package command;

public class LivingRoom {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("LivingRoom light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("LivingRoom light is "+isOn);
    }
}
