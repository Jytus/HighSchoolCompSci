#does inches to centimeters calculation and returns the value in centimeters
def inchesToCentimeters(value):
    return round((value*2.54),2)
#does centimeters to inches calculation and returns the value in inches
def centimetersToInches(value):
    return round((value/2.54),2)
#does feet to centimeters calculation and returns the value in centimeters
def feetToCentimeters(value):
    return round((value*30),2)
#does centimeters to feet calculation and returns the value in feet
def centimetersToFeet(value):
    return round((value/30),2)
#does yards to meters calculation and returns the value in meters
def yardsToMeters(value):
    return round((value*0.91),2)
#does meters to yards calculation and returns the value in yards
def metersToYards(value):
    return round((value/0.91),2)
#does miles to kilometers calculation and returns the value in kilometers
def milesToKilometers(value):
    return round((value*1.6),2)
#does kilometers to miles calculation and returns the value in miles
def kilometersToMiles(value):
    return round((value/1.6),2)

#shows user input choices
print("1. Inches to Centimeters\n2. Centimeters to Inches\n3. Feet to Centimeters\n4. Centimeters to Feet\n5. Yards to Meters\n6. Meters to Yards\n7. Miles to Kilometers\n8. Kilometers to Miles")
#prompts user for input
print("\nEnter your choice:")
#stores user choice into varible as int
choice = int(input())
#prompts user to enter the value
print("Enter value to be converted:")
#stores the input as a float
value = float(input())

#calls the appropriate function for each conversion and prints the result to the screen
if choice == 1:
    print(inchesToCentimeters(value),"centimeters")
elif choice == 2:
    print(centimetersToInches(value),"inches")
elif choice == 3:
    print(feetToCentimeters(value),"centimeters")
elif choice == 4:
    print(centimetersToFeet(value),"feet")
elif choice == 5:
    print(yardsToMeters(value),"meters")
elif choice == 6:
    print(metersToYards(value),"yards")
elif choice == 7:
    print(milesToKilometers(value),"kilometers")
elif choice == 8:
    print(kilometersToMiles(value),"miles")
else:
    #prints if an invalid choice is made
    print("Choice not recognized")


