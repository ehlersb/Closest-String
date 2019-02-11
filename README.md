# Closest-String
Challenge #353 /r/DailyProgrammer Closest String

https://www.reddit.com/r/dailyprogrammer/comments/826coe/20180305_challenge_353_easy_closest_string/

I tried to get the input via a while(scanner.hasNext) because I initially thought I didn't need the number of lines input. 
Turns out it was helpful as if you have a Scanner of System.in hasNext() won't work properly. The scanner is perpetually waiting for input
from System.in.
