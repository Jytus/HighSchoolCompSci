print("Enter the number of eggs purchased:") #prompts user to input the number of eggs

eggs = int(input()) #stores the user's egg number input into the variable 'eggs'
dozens = eggs // 12 #stores the amount of dozens in "eggs" into the variable "dozens"
eggsLeft = eggs % 12 #stores the amount of remaining eggs into the variabl "eggsLeft"


#uses elif and else statements instead of additional if statements to make code slightly more efficient

if dozens < 4: #if the amount of dozens is less than 4, it will set the price per dozen to $0.50 cents
    dozenPrice = .50    
elif (dozens >= 4) and (dozens < 6):
    dozenPrice = .45 #if the amount of dozens is both greater than or equal to 4 and less than 6, it will set the price per dozen to $0.45 cents
elif (dozens >= 6) and (dozens < 11):#if the amount of dozens is both greater than or equal to 6 and less than 11, it will set the price per dozen to $0.40 cents
    dozenPrice = .40
else:#if the amount of dozens is not an of the other choices, in other words, greater than or equal to 11, it will set the price per dozen to $0.35 cents
    dozenPrice = .35


# calculates the final price by multiplying the found dozenPrice by the amount of dozens and adding that value to the amount of extra eggs multiplied by 1/12 the dozenPrice 
price = str(round((dozenPrice*dozens + (1/12)*dozenPrice*eggsLeft),2)) #it then rounds that value to 2 decimal places and converts it into a string for later use


if (str(price))[len(price)-2] == ".": #this if block adds a '0' to the end of the output incase the output is a number with only two digits like '2.4'. it checks if the character to the left of the last charactor is a decimal and if it is it converts a number like '2.4' to '2.40'
    tempPrice = str(price) + "0" #stores the price into a temp variable and adds a zero to the end
    price = tempPrice #sets the price to the tempPrice variable   



print("The bill is equal to: $" + price) #prints the output with a sentence and dollar sign
