package command;

public class LivingRoomOffCommand implements Command {
    LivingRoom living;

    public LightOffCommand(LivingRoom living) {
        this.living = living;
    }

    @Override
    public void execute() {
        living.off();
    }
}
