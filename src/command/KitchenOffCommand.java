package command;

public class KitchenOffCommand implements Command {
    Kitchen kitchen;

    public KitchenOffCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.off();
    }
}
