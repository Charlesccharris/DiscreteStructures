import random
#6.30
def rollAgain(sum):
	roll = 0
	while roll != sum and roll != 7:
		three = int(random.randrange(1,6))
		four = int(random.randrange(1,6))
		roll = three + four
		print("You rolled",roll)
		if roll == sum:
			print("You win")
		elif roll == 7:
			print("You lose")

one = int(random.randrange(1,7))
two = int(random.randrange(1,7))
sum = one + two
print("You rolled",sum)
if sum == 2 or sum == 3 or sum == 12:
	print("You lose")
elif sum == 7 or sum == 11:
	print("You win")
else:
	rollAgain(sum)


