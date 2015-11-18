print("Enter Total Price:")#prompts user for input
totalPrice = float(input())*100# stores the total price into the totalPrice variable
print("Enter Cash Recieved:")#prompts user for input
cashReceived = float(input())*100#stores the cash recieved into the cashRecieved variable

change = round(cashReceived-totalPrice,4)#calculates the change and rounds it to two decimal places and stores it in the change variable
print("Change: $"+str(change/100))#prints the change value

changeTypes=[2000,1000,500,200,100,25,10,5,1]#stores the value of every change type in a the changeTypes array
changeNames=["$20 bill","$10 bill","$5 bill","$2 coin","$1 coin","quarters","dimes","nickels","pennies"]#stores the name of every change type in the changeNames array

for i in range(0,9):#range is set to 0,9 because there are 9 types of change
    amountOf = int(change//changeTypes[i])#counts the amount of each change type in the change variable starting with the largest to the smallest
    change -= changeTypes[i]*amountOf#subracts the amount of each change type from the value of the change variable with each repetition
    print(amountOf,changeNames[i])#prints the amount of every type of bill and its name

