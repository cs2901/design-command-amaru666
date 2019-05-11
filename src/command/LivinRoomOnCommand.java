package command;

public class LivingRoomOnCommand implements Command {
    LivingRoom living;

    public LightOnCommand(LivingRoom living) {
        this.living = living;
    }

    @Override
    public void execute() {
        living.on();
    }
}
