print("Enter the percentage:") #prompts user to input percentage

percentage = int(input()) # stores user input as an integer into the 'percentage' variable


#uses elif statements instead of additional if statements to make code slightly more efficient

if (percentage >= 90) and (percentage <= 100): #if the percentage is between 90-100 it sets the 'grade' variable to A
    grade = "A"
elif (percentage >= 80) and (percentage <= 89): #if the percentage is between 80-89 it sets the 'grade' variable to B
    grade = "B"
elif (percentage >= 70) and (percentage <= 79): #if the percentage is between 70-79 it sets the 'grade' variable to C
    grade = "C"
elif (percentage >= 50) and (percentage <= 69): #if the percentage is between 50-69 it sets the 'grade' variable to D
    grade = "D"
elif (percentage < 50): #if the percentage is less than 50, it sets the 'grade' variable to F
    grade = "F"

print("The corresponding letter grade is:",grade) #prints the corresponding letter grade in a sentence 

