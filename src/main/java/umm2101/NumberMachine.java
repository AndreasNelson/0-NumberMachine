/**
 * An instance of NumberMachine will track two numbers in private fields.
 * The fields are named firstNumber and secondNumber and both are ints.
 * An instance of NumberMachine can be asked to do several things (methods),
 * including returning the 
 *
 * @author 	K.K. Lamberty
 * @version 	1.1, 08/29/22
 */
public class NumberMachine {
 
  private int firstNumber;
  private int secondNumber;

  /**
  * Constructs an instance of NumberMachine with the default values
  */
  public NumberMachine() {
    firstNumber = 3;
    secondNumber = 5;
  }

  /**
  * Constructs an instance of NumberMachine where the firstNumber passed as input
  * is assigned to the firstNumber field for the instance of NumberMachine 
  * created here
  *
  * @param firstNumber the integer value to put in the firstNumber field
  */
  public NumberMachine(int firstNumber) {
    // Give the fields any values from the no-argument constructor
    this();

    // Use the input to populate the value of the instance being constructed
    // Since the name of the input parameter matches the name of the field, 
    // we need to be sure to use "this" on the left side 
    // of the assignment statement to indicate that this instance's firstNumber
    // *field* should be assigned the value passed as input to the constructor
    this.firstNumber = firstNumber;
  }

  /**
  * Constructs an instance of NumberMachine where two ints passed as input
  * are assigned to the firstNumber field and secondNumber field for the 
  * instance of NumberMachine created here
  *
  * @param firstNumber the integer value to put in the firstNumber field
  */
  public NumberMachine(int firstNumber, int secondNumber) {
    // Use the two input values to populate the fields of the instance being 
    // constructed
    // Since the names match, we need to be sure to use "this" on the left side 
    // of the assignment statement to indicate that this instance's *fields*
    // should be assigned the values passed as input to the constructor
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  /**
  * Gets the value of the firstNumber field for this instance of NumberMachine
  *
  * @return 	the int assigned to firstNumber
  */
  public int getFirst() {
    return this.firstNumber;
  }

  /**
  * Gets the value of the secondNumber field for this instance of NumberMachine
  *
  * @return 	the int assigned to secondNumber
  */
  public int getSecond() {
    return this.secondNumber;
  }

  /**
  * Gets the product of the firstNumber and secondNumber 
  * fields of this numberMachine.
  *
  * @return	the product of firstNumber and secondNumber
  */
  public int getProduct() {
    return firstNumber * secondNumber;
  }

  /**
  * Gets the sum of the firstNumber and secondNumber 
  * fields of this numberMachine.
  *
  * @return	the sum of firstNumber and secondNumber
  */
  public int getSum() {
    // TODO #1: implement getSum so that it returns the sum 
    // of firstNumber and secondNumber for that instance of NumberMachine 
    // (In the starter code of this assignment, the method returns 0 
    // so that it will compile.)
    return 0;
  }

}
