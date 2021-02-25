#Financial Application: compound value
#Suppose you save $100 each month into a savings
#account with the annual interest rate 5%.
#Thus, the monthly interest rate is 0.05/12 = 0.00417
#Write a program that propts the user to enter a monthly
#saving amount and displays the account value after the sixth month.

monthlyRate = int(input("Enter the monthly deposit amount: "))
interest = float(input("Enter the yearly interest rate (as a percentage): "))
maxRange = int(input("Enter how many months you want to see: "))
maxRange += 1
interestRate = interest/12/100
totalDue = 0
for x in range(1, maxRange):
	print("Month: ", x)
	totalDue = (totalDue + monthlyRate) * (1 + interestRate)
	totalDue = round(totalDue, 3)
	print("Account: ", totalDue)
