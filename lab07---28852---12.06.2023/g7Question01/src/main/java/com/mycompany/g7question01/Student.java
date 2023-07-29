package com.mycompany.g7question01;
final class Student 
{
    final int marks = 100;
    final void display();
}

/*The Student class is marked as final, so it cannot be subclassed.
Therefore, the Undergraduate class extending Student will result
in a compilation error. You cannot extend a final class.*/

/*The display() method is marked as final, which means it cannot be
overridden. If there was no compilation error due to the class extension,
trying to override the display() method in the Undergraduate class 
would also result in a compilation error.*/

/*So, the code provided will not compile successfully due to the attempt
to subclass a final class, and if we ignore that and remove the final
from the Student class, it would still fail to compile due to the
attempt to override the final method display().*/