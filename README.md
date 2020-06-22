# java-coq-astmanip

An experimental Coq Parser and Pretty Printer without Notation support using the [ANTLR 4](https://www.antlr.org/index.html) Framework. 

## How to use?

Open the project in Intellij and add the antlr-4.8-complete.jar in the lib/ folder to the dependencies of the project.
Run the InitLibraryTests class found in the test directory which parses the Coq Files found in the
[Init](https://github.com/coq/coq/tree/master/theories/Init) library of Coq and validates the correctness of the parse trees.
