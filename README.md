# 0-NumberMachine

The purpose of this lab is to allow you to see a relatively small Java program
in action. The starter code includes a folder called `src` that contains Java code
and junit test code for this lab.

`NumberMachine.java` is the definition of a class. Instances of `NumberMachine` keep
track of two private fields (two instance variables) `firstNumber` and `secondNumber`.

There are three constructors: 
   * one with no input, 
   * one that expects one input, and 
   * one that expects two input values. 

There are 4 methods: 
   * one that gets the value of the field `firstNumber`
   * one that gets the value of the field `secondNumber`
   * one that gets the product of the two fields, and
   * one that gets the sum of the two fields.

The method that gets the sum of two fields is incorrectly defined so that it
always returns 0. Since 0 is an int, this code can compile. If nothing was returned 
or if a non-int was returned, this code could not compile. The method `getSum()`
promises to return an int.

`Lab0Main.java` is the definition of a class with a very basic purpose: to allow us
to see some output that helps us understand what the NumberMachine class is 
able to do.

Both of the Java files can be compiled, and we can run the main method in `Lab0Main`
 after we compile both of them. In class, we compiled Java classes by changing 
directories until we were in the same location as the files, typing `javac *.java`,
and then typing `java Lab0Main`. This lab is set up so that you can do that OR you 
can use Maven to compile, run, and test the lab code.

"Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information."
(https://maven.apache.org/index.html)

We have a `pom.xml` file in this lab starter code that defines properties of this 
project. To use Maven to compile, run, or test code, you can use these commands from
the home directory of the project:
   * To compile, use `mvn compile`
   * To run the main method, use `mvn exec:java`
   * To run the JUnit tests (one of which is a failing test in the starter code),
     use `mvn test`

The lab also includes a license file (`LICENSE.md`), a readme file (`README.md`),
and a `.gitignore` file. The `.gitignore` file tells git what files it should not
put in the GitHub versioning repository. The `.gitignore` file in our project
includes a list of files or locations that are not necessary to put on GitHub since
they can be generated from the things we do put there. It might also include files
that should not be on GitHub if they include secrets or things that could compromise
the security or integrity of a project. In this class, I will give you files for 
managing your project like the `pom.xml` or `.gitignore`, so you can mostly ignore 
those files.

In the `src` folder, there is a `test/java/umm2101` directory that includes a very
basic JUnit test file (`TestNumberMachine.java`). In this file, there are two tests.
Each test creates an instance of NumberMachine and makes an assertion about the 
expected outcome of executing some Java code. Since we know how NumberMachine should
behave, we can test the code to verify that it behaves as we expect.

Finally, there is a `LABTASKS.md` file that explains what you should do to 
complete this lab. In general, I will put tasks in that file AND I will indicate
places in the starter code where there is work to be done using `//TODO:` to indicate
each task. This is special syntax that will make it easier to find all of the 
tasks you need to do.
