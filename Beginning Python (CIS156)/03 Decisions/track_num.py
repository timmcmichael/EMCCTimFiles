track_num = int(input("Enter track number: "))

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

print(f'Track #{track_num} on side one of "What\'s Going On" by Marvin Gaye is "{song_title}".')
