# Playing Around With Grep
Thought grep was too bording? Here's some fun options to play around with in grep!
<br>
Inspired by <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com's practical unix grep command examples<a/>

## Recursive searching for matching patterns. 
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Have you ever been in a directory and needed to search for something, but didn't want to individually grep each file? Using the option `-r`, you can use grep to recursively search through your whole current directory.
<img width="1000" alt="Screenshot 2023-02-27 at 9 34 43 PM" src="https://user-images.githubusercontent.com/122554370/221768377-64e6b940-df80-419f-93e3-03cc2d6bc5ce.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 35 32 PM" src="https://user-images.githubusercontent.com/122554370/221768383-f74dc810-b286-4906-b59c-97159cfa55d3.png">

## Adding colors
Source: <a href="https://linuxcommando.blogspot.com/2007/10/grep-with-color-output.html">linuxcommando.blogspot.com<a/>
Well, the matches might be a little bit hard to find... Maybe something that changes the text color would make it easier to read. Well, you can use `export GREP_OPTIONS='--color=auto'` to do just that! You can also specify specific colors. I would highly recommend looking into bashrc and more customization options. 

<img width="1000" alt="Screenshot 2023-02-27 at 9 36 03 PM" src="https://user-images.githubusercontent.com/122554370/221768533-6f13fb6a-c4fa-4c60-9974-da9a3036440c.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 13 PM" src="https://user-images.githubusercontent.com/122554370/221768536-9581b09c-e75c-45c0-9299-d94f48f7f372.png">


## Case insensitive search
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Here's the thing. I REALLY want to find all the places this substring shows up, but it misses it if casing is not exactly how I specified. Using `-i`, you can find all occurances regardless of casing. 
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 38 PM" src="https://user-images.githubusercontent.com/122554370/221768666-28a989cf-b39e-4748-9a7d-21c525a0c6a4.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 51 PM" src="https://user-images.githubusercontent.com/122554370/221768669-03dbb928-9cf1-4109-bc61-9661bd8020d8.png">


## Checking for full words
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Well, I think I might have searched for too much. I want to make sure that only the word I search shows up, and not all substrings with it. Use the `-w` to only show occurances of the word you specified. 
<img width="1000" alt="Screenshot 2023-02-27 at 9 37 12 PM" src="https://user-images.githubusercontent.com/122554370/221768746-e3a84e34-7acf-4d5a-9280-eae566e26100.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 37 23 PM" src="https://user-images.githubusercontent.com/122554370/221768750-6c1261f4-8ae1-46cc-a578-380d83b2bb2a.png">

## Displaying files with the matching pattern
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Well, maybe I don't need the strings themselves, but just the files containing them. Using `-l` can display just that. No need for that extra text to be displayed on the screen if you don't need it!
<img width="1000" alt="Screenshot 2023-02-27 at 9 38 50 PM" src="https://user-images.githubusercontent.com/122554370/221769064-de787970-4da3-4c95-8501-2de846635afb.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 39 29 PM" src="https://user-images.githubusercontent.com/122554370/221769066-53a0ea23-de6b-4c2f-b3c3-c4f18ebd7c14.png">


## Show only the matched string
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Here's another fun one. Using `-o`, you can specify a pattern, and grep will output all the places and the word that matches the pattern.
<img width="1000" alt="Screenshot 2023-02-27 at 9 47 19 PM" src="https://user-images.githubusercontent.com/122554370/221769108-02465e32-3cb4-43a0-bba4-ddc6b2483124.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 49 09 PM" src="https://user-images.githubusercontent.com/122554370/221769112-1c4db070-7061-4b64-8722-fa5ef7653d70.png">
