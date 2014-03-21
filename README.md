While-programming-language
==========================

Small programming language called While and an interpreter for it.

Compiling: java org.antlr.Tool while_language/parsing/WhileLanguage.g; javac while_language/ast/*.java while_language/parsing/*.java while_language/Environment.java while_language/VariableNotDefinedException.java while_language/WhileLanguage.java

Running: java while_language/WhileLanguage while_language/program1.while
