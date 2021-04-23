import random

heads = 0
tails = 0
top = int(input("Enter the number of coins flipped: "))
for x in range(top):
	flip = int(random.randrange(0,2))
	if flip == 0:
		heads += 1
	else:
		tails += 1
print("Heads:",heads,"Tails:",tails)

