#(Check substring)
#Write a program that prompts the user
#to enter two strings and reports whether
#the second string is a substring of the first string.

first = input("Enter String 1: ")
second = input("Enter string 2: ")

if second in first:
	print(second, "is a substring of", first)
else:
	print(second, "is not a substring of", first)
