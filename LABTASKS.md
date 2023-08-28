# LABTASKS.md

   1. Access the starter code
   2. Use the Terminal program to complete the following steps:
      1. Navigate to the folder that has `Lab0Main.java` 
         and `NumberMachine.java` (You might use `cd [dirname]`, `ls`, or `pwd` to
         help you get there.y)
      2. Compile `Lab0Main.java` and `NumberMachine.java` using the
         command `javac *.java`
      3. Run the `main` method of `Lab0Main.java` using the 
         command `java NumberMachine`
      4. Navigate back up to the top-level folder for this lab (where `pom.xml` is
         located)
   3. Use Maven to complete the following steps:
      1. Compile all of the code for this project using the command `mvn compile`
      2. Run the main method for this project using the command `mvn exec:java`
      3. Run the JUnit tests for this project using the command `mvn test`
         * There are two tests
         * One test will fail, so it won't look too pretty
   4. Use a text editor (I suggest Nano) to edit `NumberMachine.java` so that the
      method `getSum()` behaves like it should. 
   5. Repeat steps 2 and 3 above to see
      what it looks like now
   6. To earn an S grade for this lab, you can turn in your 
      altered `NumberMachine.java` file on Canvas. To aim for an `E` 
      grade, continue.
   7. Edit `TestNumberMachine.java` to include tests that capture the behavior that
      is currently checked only in `main`. Keep running the tests to be sure it's 
      working how you intend.
   8. Use `git commit -m "Update test file"` to commit the changes you made
   9. Use `git push` to push to the repository the changes you made
   10. Go to Canvas and add a comment to your assignment that tells me that you
       completed this task
