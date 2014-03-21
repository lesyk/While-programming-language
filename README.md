While-programming-language
==========================

Small programming language called While and an interpreter for it.

List of files:
ast (have all statements and expressions)
parsing (have grammar of language and parser/lexer to it)
WhileLanguage (main method which runs everything)
Environment (get all data from folders)
VariableNotDefinedException (checks for undefined vars)

Usage:
Compile grammar using ANTLR (java org.antlr.Tool while_language/parsing/WhileLanguage.g;)
Compile all program (javac while_language/ast/.java while_language/parsing/.java while_language/Environment.java while_language/VariableNotDefinedException.java while_language/WhileLanguage.java)
Running: java while_language/WhileLanguage while_language/program1.while
