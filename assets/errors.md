### Errors

```text
Main.java:3: error: ';' expected
        String name = "Your Name"
                                 ^
Compiler needs to know where command ended

Main.java:7: error: cannot find symbol
        System.out.printline("Hi, " + name);
                  ^
  symbol:   method printline(String)
  location: variable out of type PrintStream
Java doesn't recognize the word printline because 
it isn't a valid method in its built-in vocabulary.

Main.java:5: error: incompatible types: String cannot be converted to int
        int b = "thirty";
                ^
You cannot force text (a String) into a container 
strictly reserved for whole numbers (an int)

