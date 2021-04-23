#4.10 (Guess birthday)
#Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to enter the character
#Y for Yes and N for No rather than entering 1 for Yes and 0 for No.

set1 = " 1  3  5  7\n 9 11 13 15\n17 18 21 23\n25 27 29 31\n"
set2 = " 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31\n"
set3 = " 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31\n"
set4 = " 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31\n"
set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31\n"
monthSet1 = "January April July\nSeptember October December\n"
monthSet2 = "February May August\nNovember December\n"
monthSet3 = "March April May\nSeptember October December\n"
monthSet4 = "June July August\nSeptember October December\n"

day = 0
month = 0

print("I will guess your birthday based on nine questions.")
print("First the day.")
print("Is your birth day in this set of numbers?")
print(set1)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	day += 1

print("I will guess your birthday based on nine questions.")
print("Is your birth day in this set of numbers?")
print(set2)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	day += 2

print("I will guess your birthday based on nine questions.")
print("Is your birth day in this set of numbers?")
print(set3)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	day += 4
print("I will guess your birthday based on nine questions.")
print("Is your birth day in this set of numbers?")
print(set4)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	day += 8

print("I will guess your birthday based on nine questions.")
print("Is your birth day in this set of numbers?")
print(set5)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	day += 16


print("Now for the month")
print("Is your birth month in this set?")
print(monthSet1)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	month += 1

print("Is your birth month in this set?")
print(monthSet2)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	month += 2

print("Is your birth month in this set?")
print(monthSet3)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	month += 3

print("Is your birth month in this set?")
print(monthSet4)
answer = input("Enter (Y)es or (N)o: ")

if "y" in answer:
	month += 6

if month == 1:
	realMonth = "January"
elif month == 2:
	realMonth = "February"
elif month == 3:
	realMonth = "March"
elif month == 4:
	realMonth = "April"
elif month == 5:
	realMonth = "May"
elif month == 6:
	realMonth = "June"
elif month == 7:
	realMonth = "July"
elif month == 8:
	realMonth = "August"
elif month == 9:
	realMonth = "September"
elif month == 10:
	realMonth = "October"
elif month == 11:
	realMonth = "November"
elif month == 12:
	realMonth = "December"

print("You were born on", realMonth, day, "!")
