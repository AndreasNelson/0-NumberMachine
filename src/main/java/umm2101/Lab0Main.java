package umm2101;

public class Lab0Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("=======Exercising NumberMachine=======");
    NumberMachine machine1 = new NumberMachine();
    System.out.println("The product of the number fields for machine1 is: " + machine1.getProduct());
    System.out.println("    machine1's firstNumber is: " + machine1.getFirst());
    System.out.println("    machine1's secondNumber is: " + machine1.getSecond());
    System.out.println("    machine1's getSum() should be 8, and is actually: " + machine1.getSum());
    System.out.println();
    NumberMachine machine2 = new NumberMachine(2);
    System.out.println("The product of the number fields for machine2 is: " + machine2.getProduct());
    System.out.println("    machine2's firstNumber is: " + machine2.getFirst());
    System.out.println("    machine2's secondNumber is: " + machine2.getSecond());
    System.out.println("    machine2's getSum() should be 7, and is actually: " + machine1.getSum());
    System.out.println();
    NumberMachine machine3 = new NumberMachine(4, 6);
    System.out.println("The product of the number fields for machine3 is: " + machine3.getProduct());
    System.out.println("    machine3's firstNumber is: " + machine3.getFirst());
    System.out.println("    machine3's secondNumber is: " + machine3.getSecond());
    System.out.println("    machine3's getSum() should be 10, and is actually: " + machine1.getSum());
    System.out.println();
  }
}
