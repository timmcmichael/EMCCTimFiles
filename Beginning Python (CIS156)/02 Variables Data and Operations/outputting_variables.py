# outputting_variables
# Tim McMichael
#
# Demonstrate concatenation and interpolation by outputting information
# about a guitarist.

guitarist = 'Dickey Betts, "The Ramblin\' Man"'
year_born = 1943
band_name = "The Allman Brothers Band"

# Solution 1, separate statements
# print(guitarist, end="")
# print(", was born in ", end='')
# print(year_born)

# Solution 2, concatenation using + symbols
# print(guitarist + str(year_born))
# print(guitarist + ", was born in " + str(year_born) + " and was in a band.")

# Solution 3, interpolation with an f-string
print(f"{guitarist}, was born in {year_born} and was a member of {band_name}.")
