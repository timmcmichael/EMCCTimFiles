# input_demo
# Tim McMichael
#
# Prompts the user for the name of a band, their concert budget, and the ticket price.
# Uses that input to calculate the number of tickets the user can afford.
#
# Demonstrates user input and basic type conversion.

# Initialize variables (get input)
print("Enter the artist or band: ", end="")
artist_name = input()
budget = float(input("Enter your budget for tickets: "))
ticket_price = float(input("Enter the price of each ticket: "))

# Process data (calculations)
num_tickets = budget // ticket_price
total_cost = num_tickets * ticket_price
extra_money = budget - total_cost

# Output results
print(f"You have ${budget} to see {artist_name}.")
print(f"At ${ticket_price} per ticket, you can afford {num_tickets} tickets.")
print(f"After spending ${total_cost}, you would have ${extra_money} left.")
