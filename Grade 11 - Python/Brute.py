import sys

    
def numbers():
    print("Trying Numbers...")

    numbers = []
    for i in range(48,58):
        numbers.append(chr(i))
    array = numbers
    for a in range(0,9):
        for b in range(0,9):
            for c in range(0,9):
                for d in range(0,9):
                    for e in range(0,9):
                        guess = array[a] + array[b] + array[c] + array[d] + array[e]
                        if guess == password:
                            return(guess) 
        print(str(round((a/10)*100))+"% complete")
    return(False)

def lowerCase():
    lowerCase = []
    for i in range(97,123):
        lowerCase.append(chr(i))
    array = lowerCase
    for a in range(0,26):
        for b in range(0,26):
            for c in range(0,26):
                for d in range(0,26):
                    for e in range(0,26):
                        guess = array[a] + array[b] + array[c] + array[d] + array[e]
                        if guess == password:
                            return(guess)
        print(str(round((a/26)*100))+"% complete")                                  
    return(False)

def numbersAndLowercase():

    numbers = []
    lowerCase = []
    for i in range(48,58):
        numbers.append(chr(i))
    for i in range(97,123):
        lowerCase.append(chr(i))
        
    numbersAndLowercase = numbers + lowerCase
    array = numbersAndLowercase
    for a in range(0,36):
        for b in range(0,36):
            for c in range(0,36):
                for d in range(0,36):
                    for e in range(0,36):
                        guess = array[a] + array[b] + array[c] + array[d] + array[e]
                        if guess == password:
                            return(guess)                        
        print(str(round((a/34)*100))+"% complete")
    return(False)
                       
def uppercaseAndLowercase():
    lowerCase = []
    upperCase = []
    for i in range(97,123):
        lowerCase.append(chr(i))
    for i in range(65,91):
        upperCase.append(chr(i))
        
    array = upperCase + lowerCase
    for a in range(0,51):
        for b in range(0,51):
            for c in range(0,51):
                for d in range(0,51):
                    for e in range(0,51):
                        guess = array[a] + array[b] + array[c] + array[d] + array[e]
                        if guess == password:
                            return(guess)                       
        print(str(round((a/51)*100))+"% complete")
    return(False)

def allTypes():

    numbers = []
    lowerCase = []
    upperCase = []
    for i in range(48,58):
        numbers.append(chr(i))

    for i in range(97,123):
        lowerCase.append(chr(i))

    for i in range(65,91):
        upperCase.append(chr(i))

        
    array = numbers + lowerCase + upperCase
    for a in range(0,62):
        for b in range(0,62):
            for c in range(0,62):
                for d in range(0,62):
                    for e in range(0,62):
                        guess = array[a] + array[b] + array[c] + array[d] + array[e]
                        if guess == password:
                            return(guess)
        print(str(round((a/62)*100))+"% complete")
    return(False)
                   

print("Input a five character password:")
password = input()   


print("Press Enter to Begin:")

choice = input()
print("\n" * 100)

numberTry = numbers();
if numberTry == False:
    print("100% complete")
    print("\nNumbers Failed, Trying LowerCase...")
else:
    print("\nPassword Found! Password: "+numberTry)
    sys.exit()
    
       
lowerTry = lowerCase();
if lowerTry == False:
    print("100% complete")
    print("\nLowerCase Failed, Trying Numbers and Lowercase...")
else:
    print("\nPassword Found! Password: "+lowerTry)
    sys.exit()
       
tryThree = numbersAndLowercase();
if tryThree == False:
    print("100% complete")
    print("\nNumbers and LowerCase Failed, Trying UpperCase and LowerCase...")
else:
    print("\nPassword Found! Password: "+tryThree)
    sys.exit()

tryFour = uppercaseAndLowercase();
if tryFour == False:
    print("100% complete")
    print("\nUpperCase and LowerCase Failed, Trying Numbers, LowerCase, and UpperCase...")
else:
    print("\nPassword Found! Password: "+tryFour)
    sys.exit()

tryFive = allTypes();
if tryFive == False:
    print("100% complete")
    print("\nAll has Failed :(")
else:
    print("\nPassword Found! Password: "+tryFive)
    sys.exit()




