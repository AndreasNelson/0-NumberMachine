# LABTASKS.md

   1. Access the starter code
   2. Use the Terminal program to complete the following steps:
      1. Navigate to the top-level folder for this lab (where `pom.xml` is
         located)
      2. Compile `Lab0Main.java` and `NumberMachine.java` using the
         command `javac -d ./target/classes/ ./src/main/java/umm2101/*.java`.
         > The `-d` option flag says I'm going to specify a directory where to place the compiled code (the files ending in `.class`). This location I specified says, "Starting here (indicated by the `.`), go to the `target` folder and then the `classes` folder." So, this command will put the compiled code in the `/target/classes`  folder. The last part says, "Starting here, navigate to the `umm2101` folder and select all of the files that end in `.java`." Since there are two such files there, it will compile them all.
      3. Run the `main` method of `Lab0Main.java` using the command `java -cp ./target/classes/ umm2101.Lab0Main`.
         > The `-cp` option flag says that I'm going to specify where the .class files can be found. The `umm2101.Lab0Main` tells us that the main method is in the umm2101 package in the Lab0Main class.
   3. Use Maven to complete the following steps:
      1. Compile all of the code for this project using the command `mvn compile`
      2. Run the main method for this project using the command `mvn exec:java`
      3. Run the JUnit tests for this project using the command `mvn test`
         * There are two tests
         * One test will fail, so it won't look too pretty
   4. Edit `NumberMachine.java` so that the method `getSum()` behaves like it should.
   5. Repeat steps 2 and 3 above to see
      what it looks like now
   6. To earn an S grade for this lab, you can turn in your
      altered `NumberMachine.java` file on Canvas. To aim for an `E`
      grade, continue.
   7. Edit `TestNumberMachine.java` to include tests that capture the behavior that
      is currently checked only in `main`. Keep running the tests to be sure it's
      working how you intend.
   8. Make sure your changes that you want to include are *staged*.
   9. Use `git commit -m "Update test file"` to commit the changes you made
   10. Use `git push` to push to the repository the changes you made
   11. Go to Canvas and add a comment to your assignment that tells me that you
       completed this task
