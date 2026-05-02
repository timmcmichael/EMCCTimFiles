# Iteration 1
# Prompt user for ten names

# name1 = input("Enter participant 1: ")
# name2 = input("Enter participant 2: ")
# name3 = input("Enter participant 3: ")
# name4 = input("Enter participant 4: ")
# name5 = input("Enter participant 5: ")
# name6 = input("Enter participant 6: ")
# name7 = input("Enter participant 7: ")
# name8 = input("Enter participant 8: ")
# name9 = input("Enter participant 9: ")
# name10 = input("Enter participant 10: ")


# Iteration 2
# Prompt user for number of participants, then collect that many names

# count = int(input("How many people are signing up? "))
# i = 1
# while i <= count:
#     name = input(f"Enter participant {i}: ")
#     i = i + 1


# Iteration 3
# Store names in a list

# count = int(input("How many people are signing up? "))
# names = []
# i = 1
# while i <= count:
#     name = input(f"Enter participant {i}: ")
#     names.append(name)
#     i = i + 1


# Iteration 4
# Output numbered list of participants

count = int(input("How many people are signing up? "))
names = []

i = 1
while i <= count:
    name = input(f"Enter participant {i}: ")
    names.append(name)
    i = i + 1

print("----------------------------------------")
print("Great! Here's your list of participants:")

i = 0
while i < len(names):
    print(f"{i + 1}: {names[i]}")
    i = i + 1
