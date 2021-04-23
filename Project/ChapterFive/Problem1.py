import random
import time
#(Repeat additions)
#Listing 5.4, SubtractionQuizLoop.java, generates
#five random subtraction questions.
#Revise the program to generate ten random addition
#questions for two integers between 1 and 15.
#Display the correct count and test time.

def timeConvert(sec):
	mins = sec // 60
	sec = sec % 60
	hours = mins // 60
	mins = mins % 60
	print("Time elapsed = {0}:{1}:{2}".format(int(hours),int(mins),int(sec)))
correct = 0
start = time.time()
for x in range(0,10):
	one = int(random.randrange(1,16))
	two = int(random.randrange(1,16))
	three = int(random.randrange(1,16))
	answer = one + two + three
	print("What is: ", one, "+", two, "+", three, "=", end =' ')
	guess = int(input())
	if guess == answer:
		correct+= 1
stop = time.time()
endTime = stop - start
print("You got",correct,"right.")
timeConvert(endTime)
