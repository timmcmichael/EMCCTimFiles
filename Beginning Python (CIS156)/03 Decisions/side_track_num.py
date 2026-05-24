side_num = int(input("Enter side number: "))

track_num = int(input("Enter track number: "))

if side_num == 1:
    if track_num == 1:
        song_title = "What's Going On"
    elif track_num == 2:
        song_title = "What's Happening Brother"
    elif track_num == 3:
        song_title = "Flyin' High (In the Friendly Sky)"
    elif track_num == 4:
        song_title = "Save the Children"
    elif track_num == 5:
        song_title = "God Is Love"
    elif track_num == 6:
        song_title = "Mercy Mercy Me (The Ecology)"
    else:
        song_title = "not found"
elif side_num == 2:
    if track_num == 1:
        song_title = "Right On"
    elif track_num == 2:
        song_title = "Wholy Holy"
    elif track_num == 3:
        song_title = "Inner City Blues (Make Me Wanna Holler)"
    else:
        song_title = "not found"
else:
    song_title = "not found"

print(f'Track #{track_num} on side {side_num} of "What\'s Going On" by Marvin Gaye is "{song_title}".')
