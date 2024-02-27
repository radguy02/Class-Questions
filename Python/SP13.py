string = "It is what it is"

#Program to find number of letters in a string or calculate the length of a string
def number_of_letters(string):
    count = 0
    for i in string:
        if i != ' ':
            count+=1
    return count

#program to find number of vowels in a string
def vowels(string):
    count = 0
    for i in string.lower():
        if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
            count+=1
    return count

print(vowels(string))