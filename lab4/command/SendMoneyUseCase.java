package breaking_bad_simulation.command;

public class SendMoneyUseCase {
 public void submit(SendMoney command) {
    command.execute();
  }
}
