#Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
#Write a program that displays the average speed in kilometers per hour.
#(1 mile is 1.6 kilometers)

time = [1, 40, 35]
hours, minutes, seconds = time
miles = 24

kilometersPerMile = 1.6
secondsInMinute = 60
minutesInHour = 60

kilometers = miles*kilometersPerMile
#kilometers = round(kilometers, 2)
#print(kilometers)

minutes += (seconds/secondsInMinute)
#minutes = round(minutes, 2)
#print(minutes)

hours += (minutes/minutesInHour)
#hours = round(hours, 2)
#print(hours)

kph = kilometers/hours
kph = round(kph, 2)
print ("What is the average speed in kilometers per hour, if you go 24 miles in 1 hour, 40 minutes, and 35 seconds?")
print(kph)
