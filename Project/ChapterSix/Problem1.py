#6.5
one = float(input("Enter the first number: "))
two = float(input("Enter the second number: "))
three = float(input("Enther the third number: "))
tempOne = 0
tempTwo = 0
tempThree = 0
if one > two and one > three:
	tempThree = one
	if two > three:
		tempTwo = two
		tempOne = three
	else:
		tempOne = two
		tempTwo = three
elif one > two and one < three:
	tempOne = two
	tempTwo = one
	tempThree = three
elif one < two and one > three:
	tempOne = three
	tempTwo = one
	tempThree = two
elif one < two and one < three:
	tempOne = one
	if two < three:
		tempTwo = two
		tempThree = three
	else:
		tempTwo = three
		tempThree = two
print("In order:",tempOne,",",tempTwo,",",tempThree)
