#Financial application: calculate future investment value
#Write a program that reads in investment amount,
#annual interest rate, and number of years,
#and displays the future investment value
#using the following formula
#futureInvestmentValue = investmentAmount X (1 + monthlyInterestRate)^numberOfYears*12

investmentAmount = float(input("Enter the initial amount invested: "))
yearlyInterestRate = float(input("Enter the annual interest rate (as a percentage): "))
numberOfYears = float(input("Enter how many years you want to calculate: "))

monthlyInterestRate = yearlyInterestRate/12/100

futureInvestmentValue = investmentAmount*(1+monthlyInterestRate)**(numberOfYears*12)
futureInvestmentValue = round(futureInvestmentValue, 2)

print("Accumulated value is: $", futureInvestmentValue)

