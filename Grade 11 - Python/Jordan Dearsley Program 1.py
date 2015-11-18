#final mark values are stored into variables
course = 87
finalProject = 75
exam = 82

firstFinalMark = (course*.6) + (finalProject*.2) + (exam*.2) #calculates the first final mark method
secondFinalMark = (course*.7) + (finalProject*.1) + (exam*.2) # calculates the alternative final mark method
bestFinalMark = max(firstFinalMark,secondFinalMark) # Stores the highest possible mark into the 'bestFinalMark' variable

print("Final Mark:",bestFinalMark)# Prints the highest possible final grade
print("Final Mark (Rounded):",round(bestFinalMark)) # prints the mark rounded to the nearest integer
