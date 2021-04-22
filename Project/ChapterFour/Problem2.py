#(Decimal to Hex)
#Write a program that prompts the user to enter
#an integer between 0 and 15 and displays its
#corresponding hex number.

number = int(input("Enter an integer between 0 and 15: "))

if number < 0 or number > 15:
	print("You must enter an integer between 0 and 15")
	exit(1)

if number > 0 and number < 10:
	print("The Hex number is", number)
else:
	ch = hex(number)
	print("The Hex number is", ch)

