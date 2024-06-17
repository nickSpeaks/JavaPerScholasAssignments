# PA 303.7.1 - Practice Assignment - Array

### Objective:
In this Assignment, we test your knowledge of using arrays in Java.
In this assignment, you will create a Java program. Requirements are given below:

### Introduction
An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they are stored sequentially in memory.
Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we are going to have.


### Tasks:
## Task 1
Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(" ------- way 1 of printing arrays: -------");
        System.out.println(Arrays.toString(ints));

        System.out.println(" ------- way 2 of printing arrays: -------");
        for (int i:ints) System.out.printf(" %d ", i);
        System.out.println();

        System.out.println(" ------- way 3 of printing arrays: -------");
        for (int i = 0; i < ints.length; i++)
            System.out.printf(" %d ", ints[i]);

## Task 2
Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int[] intArray = new int[] {13, 5, 7, 68, 2};

        int middleELementIndex = 0;

        if (intArray.length % 2 != 0)
            middleELementIndex = intArray.length / 2;
        else
            middleELementIndex = intArray.length / 2 - 1;

        System.out.println(intArray[middleELementIndex]);

## Task 3
Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

        String[] arrStr = {"red", "green", "blue", "yellow"};
        System.out.println(arrStr.length);              // Print out the array length

        String[] arrStrCopy = arrStr.clone();           // Make copy using the clone( ) method
        for (int i = 0; i < arrStrCopy.length; i++) {
            System.out.printf(" %s ", arrStrCopy[i]);   // print individual elements
        }
        System.out.println(Arrays.toString(arrStrCopy)); // Use Arrays.toString( ) to verify

## Task 4
Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.

        int[] intArray = new int[]{1, 10, 2, 20, 3};
        System.out.println("A new arrray: " + Arrays.toString(intArray));

        System.out.println(intArray[0]);            // Print out the value at the first index
        System.out.println(intArray[intArray.length-1]);    // using length - 1 as the index
        // System.out.println(intArray[intArray.length]); throws ArrayIndexOutOfBoundsException
        // intArray[5] = 100;  throws ArrayIndexOutOfBoundsException

## Task 5
Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        for (int i:intArray) System.out.printf(" %d ", intArray[i]);

## Task 6
Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.

        int[] intArray = new int[5];

        for (int i =0; i < intArray.length; i++) {
            intArray[i] = i * 2;
            System.out.printf(" %d ", intArray[i]); //  0  2  4  6  8
        }

## Task 7
Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.

        int forbiddenIndex = 2;
        int[] intArray = new int[]{1, 2, 3, 4, 5};    // create an array of 5 elements
        System.out.println(intArray[0]);

        for (int i = 1; i < intArray.length; i++)
            if (i != forbiddenIndex)
                System.out.println(intArray[i]);

## Task 8
Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.

        String[] array = new String[]{"one", "two", "three", "four", "five"};
        String temp = array[2];
        array[2] = array[0];
        array[0] = temp;

        System.out.println(Arrays.toString(array));

## Task 9
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:

    Array in ascending order: 0, 1, 2, 4, 9, 13
    The smallest number is 0
    The biggest number is 13

Solution

        int[] arr = new int[]{4, 2, 9, 13, 1, 0};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // Print the array in ascending order
        System.out.printf("The smallest number is %d%n", arr[0]);   // The smallest number is 0
        System.out.printf("The biggest number is %d%n", arr[arr.length-1]); // The biggest number is 13

## Task 10
Create an array that includes an integer, 3 strings, and 1 double. Print the array.

        Object[] array = new Object[]{1, "two", "three", "four", 10.50};

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

## Task 11
Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.

Example

        How many favorite things do you have?
        7
        
        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite  things are:
        phone tv xbox wine beer sofa book

Solution

        System.out.print("How many favorite things do you have? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] array = new String[number];  // create a String array of the correct size

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter your thing: ");
            array[i] = scanner.next();

        }
        System.out.println();
        System.out.println("Your favorite things are:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ",array[i]);
        }
        scanner.close();

### Submission Instructions:
Include the following deliverables in your submission -
Submit your source code using the Start Assignment button in the top-right corner of the assignment page in Canvas.