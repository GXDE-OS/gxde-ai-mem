package top.gxde.ai;

/**
 * Main entry of GXDE AI Core Memory Management
 */
public class Main {
  /**
   * Main entry of the programs
   *
   * @param args A list of parameters passed on the ELF.
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      ReplHandler replHandler = new ReplHandler();
      replHandler.kickStartRepl();
    }
  }
}
