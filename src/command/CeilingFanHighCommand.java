package command;

public class CeilingFanHighCommand implements Command {
  CeilingFan fan;

  public CeilingFanHighCommand(CeilingFan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    fan.high();
  }

}
