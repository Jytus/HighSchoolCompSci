print("Enter each word of coded message one at a time:")#prompts user for input

decodedMessage = ""#creates the variable as an empty string

for i in range(1,6):#range is set to 1,6 because there are 5 words to be inputted
    print("Word",str(i)+":")#Prompts user to enter word with the word number
    codedMessage = input()#accepts user input into codedMessage variable
    middleLetter = codedMessage[int(len(codedMessage)/2)]#finds the middle letter of input by finding the length of the word divided by two and finding the charater with the value.
    decodedMessage += middleLetter#each repitition of the loop adds the middle of each input to the decodedMessage string

print("The decoded message is:")#prints sentence before the decoded message is printed
print(decodedMessage)#prints the decoded message on its own line
