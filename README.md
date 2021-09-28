# Bubble and Merge Sorters
This Bubble and Merge sorter project is about sorting a list of random numbers, in ascending order, requested by the Product Owner.
It works by prompting users to input the number of numbers they would like to be sorted in the array.
Users will also be prompted to choose which sorting method they would like the numbers to be arranged by.
Their choices are between Bubble and Merge sort.
Using the information provided by the users, they will be shown their number array arranged in ascending order.
They will also be shown how long it took the respective sort type to sort the array, using the nanoTime() method.
This product is for users who want to input a certain number of numbers and see them get arranged in ascending order, as well as how long it took. 

## Features
### ```Main``` Class 
- This contains the main method where the entire project's code is run, to be compiled.
- The main method in this class contains ```UsersChoicesInterface.loopedUserAnswers();``` which is used to call the ```loopedUserAnswers()``` method in the ```UsersChoicesInterface``` interface; responsible for displaying the results of the user's input. 
### ```BubbleSort``` Class 
- This class implements the ```BubbleSortInterface``` interface which is responsible for sorting the random numbers using the Bubble method.
- It is responsible for ensuring its instance variable is accessible to the rest of the project using a getter.
- It also has a method which overrides the abstract signature in the ```BubbleSortInterface``` file.
### ```MergeSort``` Class
- This class implements the ```MergeSortInterface``` interface which is responsible for sorting the random numbers using the Merge method.
### ```BubbleSortInterface``` Interface
- This interface extends from the ```BothSortsInterface``` interface.
- It is responsible for generating a random array of numbers, with the number of numbers decided by the user included.
- It contains the method responsible for sorting the array of numbers, following the conventional Bubble procedure.
- It also prints out the array before and after the sorting process as well as how long it took, using the ```nanoTime()``` method.
### ```MergeSortInterface``` Interface
- This interface extends from the ```BothSortsInterface``` interface.
- It is responsible for dividing and merging 2 sub arrays, from the array of numbers generated.
- It also prints out the array before and after the sorting process as well as how long it took, using the ```nanoTime()``` method.
### ```BothSortsInterface``` Interface
- This interface is inherited by the ```UsersChoicesInterface``` interface.
- It is responsible for calculating the amount of nanoseconds spent, sorting the array of numbers.
- The ```nanoEnd()``` method is used to print out the total number of nanoseconds taken, for the user to see.
### ```UsersChoicesInterface``` Interface
- This interface inherits the ```BothSortsInterface``` interface.
- It is responsible for printing out the instruction to the user, for them to type in which sort they want to use to rearrange their array of random numbers.
- It also consists of switch statement, which utilises the Factory method.
- This switch statement allows users to select either the Bubble or Merge sort class and view the array of numbers arranged with their chosen sort.

## Testing
(testing goes here)

## Deployment
(deployment goes here)

## Credits
- [Generating a random array of integers](https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java)
- [Creating a Merge Sort algorithm](https://www.geeksforgeeks.org/merge-sort/)
- [Creating a Bubble Sort algorithm](https://www.geeksforgeeks.org/bubble-sort/)
- [Scanner class information](https://www.w3schools.com/java/java_user_input.asp)
- [Utilising the Scanner class](https://www.w3schools.com/java/showjava.asp?filename=demo_api_scanner)

## Link to previous version of this project
- This project is a continuation of the discontinued GitHub repository:
[(Old) Bubble & Merge Sort Project](https://github.com/VioletViolaVi/bubbleAndMergeSort)

## To do list:
- [x] Create merge sort function
- [x] Include nano time function
- [x] Create bubble sort function
- [x] Use separate GitHub for project
- [x] Combine bubble and merge sort
- [x] Create separate packages for each sort method/interface
- [x] Include ability for users to choose how many numbers in array
- [x] Create interface file for both sorting methods
- [x] Move all main method contents into own files
- [x] Put users choice making in an interface
- [x] Use demo repo for the factory method (switch statements)
- [x] Remove repetitive code from main method

- [] Complete readme file

- [] Incorporate MVC - & label/comment (all but 'UsersChoices' are pretty much the M in MVC)
- [] Incorporate SOLID principles - & label/comment
- [] Implement OOP principles - & label/comment
- [] Implement Facade pattern - & label/comment

- [] Add testing to project
- [] Add exception handling try/catch code blocks
- [] Complete part 2 of assignment
