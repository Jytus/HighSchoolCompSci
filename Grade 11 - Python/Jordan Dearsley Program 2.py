# This portion finds the current year for the age calulation
import datetime # imports the module for date and time
now = datetime.datetime.now() # Stores the date and time into the 'now' variable
currentYear = now.year #Sets the variable 'currentYear' to the actual current year

print("What is your name?") #asks the user to input name
userName = input() # stores user's name into 'userName' variable
print("What year were you born?") # asks the use to input birth year
userBirthYear = int(input()) # stores user's name into the 'userBirthYear' variable as an integer for calculations

currentYear = now.year #sets the 'currentYear' variable to the current year

userAge = currentYear - userBirthYear # Calculates the user's current age by subtracting the current year by the user's birth year 

print(userName,"is",userAge,"years old") #prints the user's name and age in a sentence
