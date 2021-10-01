# Bubble, Merge and Quick Sorters
This sort manager project is about sorting a list of random numbers, in ascending order, requested by the Product Owner.
It works by prompting users to input the number of numbers they would like to be sorted in the array.
Users will also be prompted to choose which sorting method they would like the numbers to be arranged by.
Their choices are between Bubble, Merge and Quick sort.
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
### ```QuickSort``` Class
- This class implements the ```AllSortsInterface``` interface.
- It is responsible for sorting an array of numbers using the Quick sorting algorithm.
### ```AllSorts``` Class
- This class contains all the instances made from each sort's classes, so their objects produced could have methods applied to them.
### ```AllSortsInterface``` Interface
- This interface is inherited by the ```UsersChoicesInterface``` interface.
- It is responsible for calculating the amount of nanoseconds spent, sorting the array of numbers.
- The ```nanoEnd()``` method is used to print out the total number of nanoseconds taken, for the user to see.
- This also stores the user's sort and number choice.
### ```UsersChoicesInterface``` Interface
- This interface inherits the ```BothSortsInterface``` interface.
- It is responsible for printing out the instruction to the user, for them to type in which sort they want to use to rearrange their array of random numbers.
- It also consists of switch statement, which utilises the Factory method.
- This switch statement allows users to select either the Bubble or Merge sort class and view the array of numbers arranged with their chosen sort.

## Testing
### ```Main``` Class
- #
### ```BubbleSort``` Class
- #
### ```MergeSort``` Class
- #
### ```QuickSort``` Class
- #
### ```AllSorts``` Class
- #
### ```AllSortsInterface``` Interface
- #
### ```UsersChoicesInterface``` Interface
- #

## Deployment
The following procedures can be taken to deploy this project:
1. First enter the repository section of GitHub to deploy the project link that contains the name of this project.
2. Then, click the settings tab underneath the 'spartaGlobalProject1' heading, to enter its settings.
3. Next, scroll down the settings page until the sub-title “GitHub Pages” is found.
4. Later, locate the sub-title called “Source”, under “GitHub Pages”.
5. Under the “Source” sub-title, click on the 'None' button to reveal its dropdown menu.
6. Then, select the dropdown menu the option called 'master branch'.
7. Refresh the page to automatically deploy the project.
8. Finally, access the link to the project in the 'GitHub Pages' section.

## Running the code locally
In order to locally run this code, this project would have to be cloned from GitHub using the following steps:
1. First enter the list of repositories section of GitHub.
2. Then, under the repository name of the project, click on the “Clone or download” button.
3. Next, when in the dropdown “Clone with HTTPS” section click the clipboard button next to the URL to copy the repository's clone URL.
4. Afterwards, enter into the local IDE and open Git Bash.
5. Then, change the current working directory into the location of where the cloned directory is to be made.
6. Next, type in “git clone” and paste in the URL that was copied earlier from the “Clone with HTTPS” section i.e.:git clone: https://github.com/VioletViolaVi/spartaGlobalProject1.git
7. Lastly, tap the enter button on the keyboard to create the local clone.

## Credits
- [Generating a random array of integers](https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java)
- [Creating a Bubble Sort algorithm](https://www.geeksforgeeks.org/bubble-sort/)
- [Creating a Merge Sort algorithm](https://www.geeksforgeeks.org/merge-sort/)
- [Creating a Quick Sort algorithm](https://www.geeksforgeeks.org/quick-sort/)
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
- [x] Use maven

- [] Complete readme file

- [] Add testing to project
- [] Add exception handling try/catch code blocks

- [] Use log4
- [] Use jUnit

- [] Complete all parts of assignment based on word docs on teams

- [] Incorporate MVC - & label/comment
- [] Incorporate SOLID principles - & label/comment
- [] Implement OOP principles - & label/comment
- [] Implement Facade pattern - & label/comment
- [] Implement factory method - & label/comment
