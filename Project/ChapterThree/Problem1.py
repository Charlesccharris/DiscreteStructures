import random
#Game: add three numbers
#The program in Listing 3.1, AdditionQuiz.java
#generates two intgers and prompts the user to
#enter the sum of thses two integers.
#Revise the program to generate three single-digit
#integers and propt the user to enter the sum
#of these three integers.

numberOne = int(random.randrange(1, 9))
numberTwo = int(random.randrange(1, 9))
numberThree = int(random.randrange(1, 9))
totalNumber = numberOne + numberTwo + numberThree

print("What is", numberOne,"+",numberTwo,"+",numberThree,"=",end = ' ')
guess = int(input())

if guess == totalNumber:
	print("You got it right")
else:
	print("Sorry, but the correct answer was",totalNumber)
