package se.sics.hop.exception;

/**
 * @author Salman <salman@sics.se>
 */
public class LockUpgradeException extends TransactionContextException {

  public LockUpgradeException() {
  }

  public LockUpgradeException(String message) {
    super(message);
  }

  public LockUpgradeException(String message, Throwable cause) {
    super(message, cause);
  }

  public LockUpgradeException(Throwable cause) {
    super(cause);
  }
}
