import random

secretColour1 = random.randint(1,4)
if secretColour1 == 1:
    secretColour1 = "R"
elif secretColour1 == 2:
    secretColour1 = "G"
elif secretColour1 == 3:
    secretColour1 = "Y"
elif secretColour1 == 4:
    secretColour1 = "B"

secretColour2 = random.randint(1,4)
if secretColour2 == 1:
    secretColour2 = "R"
elif secretColour2 == 2:
    secretColour2 = "G"
elif secretColour2 == 3:
    secretColour2 = "Y"
elif secretColour2 == 4:
    secretColour2 = "B"

secretColour3 = random.randint(1,4)
if secretColour3 == 1:
    secretColour3 = "R"
elif secretColour3 == 2:
    secretColour3 = "G"
elif secretColour3 == 3:
    secretColour3 = "Y"
elif secretColour3 == 4:
    secretColour3 = "B"

secretColour4 = random.randint(1,4)
if secretColour4 == 1:
    secretColour4 = "R"
elif secretColour4 == 2:
    secretColour4 = "G"
elif secretColour4 == 3:
    secretColour4 = "Y"
elif secretColour4 == 4:
    secretColour4 = "B"

while True:

    correct = 0
    wrongspot = 0

    print("Please guess the code")
    guess = input()

    if secretColour1 == guess[0]:
        correct += 1
    elif secretColour1 == guess[1]:
        wrongspot += 1
    elif secretColour1 == guess[2]:
        wrongspot += 1
    elif secretColour1 == guess[3]:
        wrongspot += 1
        
    if secretColour2 == guess[1]:
        correct += 1
    elif secretColour2 == guess[0]:
        wrongspot += 1
    elif secretColour2 == guess[2]:
        wrongspot += 1
    elif secretColour2 == guess[3]:
        wrongspot += 1
  
    if secretColour3 == guess[2]:
        correct += 1
    elif secretColour3 == guess[0]:
        wrongspot += 1
    elif secretColour3 == guess[1]:
        wrongspot += 1
    elif secretColour3 == guess[3]:
        wrongspot += 1
  
    if secretColour4 == guess[3]:
        correct += 1
    elif secretColour4 == guess[0]:
        wrongspot += 1
    elif secretColour4 == guess[1]:
        wrongspot += 1
    elif secretColour4 == guess[2]:
        wrongspot += 1

    if correct == 4:
        break
    print(correct,"correct, and",wrongspot,"of the correct colours in the wrong spots.")


print("Congratulations! That is the correct code.")



        
