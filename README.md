# ArrayLesson
Lesson on arrays

The ArrayLesson class is defined, which contains the main method as the entry point of the program.

An array arr is declared and initialized with five integer values.
The System.out.println(arr) statement prints the array object's hash code, not its contents.
The System.out.println(Arrays.toString(arr)) statement prints the string representation of the array's contents.

Another array arr2 is declared, but this time it is initialized as an empty array of length 5.
Similar to before, the code prints the hash code and string representation of arr2.
The code demonstrates that setting an array equal to another array does not create a new array; it only assigns a new reference to the existing array.

Another array arr3 is declared and initialized using an array literal.
The code prints the hash code and string representation of arr3.
The Arrays.copyOf method is used to create a new array arr4 with the same values as arr3. The length of arr4 is explicitly set to 5.

The code prints the hash code and string representation of arr4.
The getMaxIdk method is defined, which takes an array as input and returns an array of two integers: the index and value of the maximum element in the input array.
The getMaxIdk method is called with arr4 as an argument, and the result is printed using Arrays.toString.
