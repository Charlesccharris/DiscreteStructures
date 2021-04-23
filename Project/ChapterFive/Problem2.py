import random

difference = 0
while difference < 2 and difference > -2:
	cHand = int(random.randrange(0,3))
	if cHand == 0:
		computer = "Rock"
	elif cHand == 1:
		computer = "Paper"
	elif cHand == 2:
		computer = "Scissors"

	guess = input("Rock, Paper, Scissors, Shoot: ")
	if "k" in guess:
		pHand = 0
	elif "p" in guess:
		pHand = 1
	elif "s" in guess:
		pHand = 2

	if cHand == pHand:
	 	print("Both you and the computer threw", guess)
	if cHand == 0:
		print("The computer threw rock", end =' ')
		if pHand == 1:
			print("so you win")
			difference += 1
		elif pHand == 2:
			print("so you lose")
			difference -= 1
	elif cHand == 1:
		print("The computer threw paper", end = ' ')
		if pHand == 0:
			print("so you lose")
			difference -= 1
		elif pHand == 2:
			print("so you win")
			difference +=1
	elif cHand == 2:
		print("The computer threw scissors", end = ' ')
		if pHand == 0:
			print("so you win")
			difference += 1
		elif pHand == 1:
			print("so you lose")
			difference -= 1
