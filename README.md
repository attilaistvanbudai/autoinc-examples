autoinc-examples
================
Add your own excercise here to a file called
   yourname.java

The file *must* contain a docblock with the title of the excercise, and a short
description with test cases if applicable.

This *must* be followed by a working implementation.
The file *should not* contain class declaration or main method declaration.
The file *must* mark lines that should be locked with the *//LOCK* comment 
so the code can be deterministically arranged.

The file *should* look somethink like:

	/*
	  Find an Element in an int array

	  Description: 
	  Given a function, which checks the existence of a given number in a given array.
	  Examples:
	  1)
	    input:null,5
	    output: false
	  2)
	    input:[1,2,3,4],5
	    output: false
	  3)
	    input:[5,4,3],5 5
	    output: true
	*/

	public SomeType implementation() {
	    //...your implementation goes here
	    //[...]
	    int something = 123; //LOCKED
	    //[...]
	}