import random
#Game: heads or tails
#Write a program that lets the user guess whether
#the flip of a coin results in heads or tails.
#The program rnadomly generates and integer 0 or 1,
#which represents head or tail.
#The program prompts the user to enter a guess and
#reports whether the guess is correct of incorrect

coin = int(random.randrange(0, 10))
user = input("Heads or Tails?: ")

if coin > 4:
	face = 1
	coinFace = "Heads"
else:
	face = 2
	coinFace = "Tails"

if "h" in user:
	guess = 1
elif "H" in user:
	guess = 1
else:
	guess = 2

print("The computer flipped:",coinFace)
if(face == guess):
	print("So you guessed right")
else:
	print("So you guessed wrong")
