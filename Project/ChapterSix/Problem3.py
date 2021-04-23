import random
#6.32
win = 0
lose = 0
max = int(input("Enter the number of rounds: "))
for x in range(max):
	def rollAgain(sum):
		roll = 0
		while roll != sum and roll != 7:
			three = int(random.randrange(1,6))
			four = int(random.randrange(1,6))
			roll = three + four
			if roll == sum:
				return 1
			elif roll == 7:
				return 2
	one = int(random.randrange(1,7))
	two = int(random.randrange(1,7))
	sum = one + two
	outCome = 0
	if sum == 2 or sum == 3 or sum == 12:
		outCome = 2
	elif sum == 7 or sum == 11:
		outCome = 1
	else:
		outCome = rollAgain(sum)
	if outCome == 1:
		win += 1
	elif outCome == 2:
		lose += 1
print("Wins:",win,"Losses",lose)

