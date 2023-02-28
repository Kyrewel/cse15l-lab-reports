# Playing Around With Grep
Thought grep was too bording? Here's some fun options to play around with in grep!

## Recursive searching for matching patterns. 
Have you ever been in a directory and needed to search for something, but didn't want to individually grep each file? Using the option `-r`, you can use grep to recursively search through your whole current directory.

## Adding colors
Well, the matches might be a little bit hard to find... Maybe something that changes the text color would make it easier to read. Well, you can use `export GREP_OPTIONS='--color=auto'` to do just that! You can also specify specific colors. I would highly recommend looking into bashrc and more customization options. 

## Case insensitive search
Here's the thing. I REALLY want to find all the places this substring shows up, but it misses it if casing is not exactly how I specified. Using `-i`, you can find all occurances regardless of casing. 

## Checking for full words
Well, I think I might have searched for too much. I want to make sure that only the word I search shows up, and not all substrings with it. Use the `-w` to only show occurances of the word you specified. 

## Show only the matched string
Here's another fun one. Using `-o`, you can specify a pattern, and grep will output all the places and the word that matches the pattern.
