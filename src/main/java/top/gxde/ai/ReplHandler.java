package top.gxde.ai;

import java.util.Scanner;

/**
 * Handler class for the REPL CLI interface.
 */
public class ReplHandler {
  private Scanner sharedScanner;
  /**
   * The default constructor of REPL handler.
   */
  public ReplHandler() {
    sharedScanner = new Scanner(System.in);
  }

  /**
   * Starter for the REPL CLI. This function handles the REPL loop and dispatches function calls.
   */
  public void kickStartRepl() {
    System.out.println("GXDE AI Core Memory management program.");
    System.out.println("REL 0.1.0-Beta");
    System.out.println("=======================================");
    System.out.println("Type 'help' for usage list.");

    boolean exit_flag = false;
    while (!exit_flag) {
      System.out.print("$ ");
      String curLine = sharedScanner.nextLine();
      switch (curLine) {
        case "exit":
          System.out.println("GXDE AI Core Memory Management CLI is exiting...");
          exit_flag = true;
          break;

        case "help":
          System.out.println("Useful commands:");
          System.out.println("\texit: Exit the CLI interface.");
          System.out.println("\thelp: Prints this screen.");
          break;

        default:
          String errMsgRaw = "Unknown command '%s'.";
          String errMsg = String.format(errMsgRaw, curLine);
          System.out.println(errMsg);
          break;
      }
    }
  }
}
