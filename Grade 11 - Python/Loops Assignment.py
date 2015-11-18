#comments to the right -->>         -->>        -->>         -->>               
import random                                                           #imports the 'random' module
colours = ["R","G","Y","B"]                                             #sets the four possible colors into a list
secretColour = []                                                       #creates an empty list that will hold the four random colours

for i in range(0,4):                                                    #Assigns four random colours to the secretColour list from the colours list
    secretColour.append(colours[random.randint(0,3)])                   #stores four random colours from the colours list and stores it in the secretColour list
  
while True:                                                             #loops until break when guess is correct

    print("Please guess the code:")                                     #Prompts user for input
    guess = input().upper()                                             #stores the user input into the guess variable as uppercase

    correctPos = []                                                     #creates an empty list to store the positions of the correct colors later
    amountCorrect = 0                                                   #creates the amountCorrect variable and sets it to zero for later use

    for i in range(0,4):                                                #the purpose of this loop is to fill the correctPos list and amountCorrect variable with info for each colour
        if guess[i] == secretColour[i]:                                 #checks if any of the guess and secret colours match and if they do, it stores the position of the correct colours into the correctPos list as True or False and if there is a match, it also adds one to the amountCorrect variable 
            correctPos.append(True)                                     #adds True to the correctPos list, indicating there was a match for this position
            amountCorrect += 1                                          #adds one to the amount correct if there is a match
        else:
            correctPos.append(False)                                    #if there isn't a match, it indicates the position of the false match in the correctPos list as False

    wrongSpot = 0                                                       #creates the wrongSpot variable and sets it to zero for later use counting the amount of correct letetrs in the correct positions
    for j in range(0,4):                                                #for each colour in the guess list, checks to see if it matches any of each colour in the wrong position. Each time this occurs it adds one to the wrongSpot variable
        for i in range(0,4):                                            #used for each color in the guess to be checked with all four colors of the secretColour list
            if guess[j] == secretColour[i] and correctPos[i] == False and correctPos[j] == False:
                wrongSpot += 1                                          #if there is any correct color in the spots marked False in correctPos it adds one to the wrongSpot variable
                break
                   
    if amountCorrect == 4:                                              #prints the congratulations message if every color in guess is correct
        print("Congratulations! That is the correct code.")             #prints congratulations message
        break                                                           #ends the guessing game if guess is correct
    else:                                                               #if all four colors are not correct, it prints the amount of correct colous and the amount of correct colors in the wrong position in a sentence
        print(amountCorrect, "correct, and",wrongSpot, "of the correct colors in the wrong spots")
                                                                        #continues to loop until guess is correct
