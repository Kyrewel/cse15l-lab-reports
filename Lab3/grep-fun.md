# Playing Around With Grep
Thought grep was too bording? Here's some fun options to play around with in grep!
<br>
Inspired by <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com's practical unix grep command examples<a/>

## Recursive searching for matching patterns. 
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Have you ever been in a directory and needed to search for something, but didn't want to individually grep each file? Using the option `-r`, you can use grep to recursively search through your whole current directory.
```
  grep -r "hello"
./written_2/travel_guides/berlitz1/WhereToItaly.txt:        (or Ca’ Grande), while gondoliers claim Othello’s Desdemona lived in
./written_2/travel_guides/berlitz1/WhereToHongKong.txt:        the local people smile “hello” and, if you’re lucky, point you to a
```
<img width="1000" alt="Screenshot 2023-02-27 at 9 34 43 PM" src="https://user-images.githubusercontent.com/122554370/221768377-64e6b940-df80-419f-93e3-03cc2d6bc5ce.png">
<br>
Here I wanted to try to find files of where people say hello. And it went through all the subdirectories of written_2 to search for this substring.
  
```
  grep -r "huh"
Binary file ./.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.pack matches
./written_2/non-fiction/OUP/Berk/ch2.txt:Child: Uh-huh. Dad made cuts in it with a razor. He made a face too. That was funny.66
./written_2/travel_guides/berlitz1/WhereToJapan.txt:        The superbly landscaped Shuhekein pond garden is a
./written_2/travel_guides/berlitz1/WhereToHongKong.txt:        Special Economic Zone of Zhuhai, is becoming something like a boomtown

```
<br>
<img width="1000" alt="Screenshot 2023-02-27 at 9 35 32 PM" src="https://user-images.githubusercontent.com/122554370/221768383-f74dc810-b286-4906-b59c-97159cfa55d3.png">
  <br>
Here, I was curious to see where "huh" would appear, as you would think it's just a colloquial phrase you hear in english a lot. 
  <br>

## Adding colors
Source: <a href="https://linuxcommando.blogspot.com/2007/10/grep-with-color-output.html">linuxcommando.blogspot.com<a/>
Well, the matches might be a little bit hard to find... Maybe something that changes the text color would make it easier to read. Well, you can use `export GREP_OPTIONS='--color=auto'` to do just that! You can also specify specific colors. I would highly recommend looking into bashrc and more customization options. 

<img width="1000" alt="Screenshot 2023-02-27 at 9 36 03 PM" src="https://user-images.githubusercontent.com/122554370/221768533-6f13fb6a-c4fa-4c60-9974-da9a3036440c.png">
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 13 PM" src="https://user-images.githubusercontent.com/122554370/221768536-9581b09c-e75c-45c0-9299-d94f48f7f372.png">
<br>
  While not a flag, it still comes incredibly helpful when using grep for stuff like debugging an output
  <br>


## Case insensitive search
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Here's the thing. I REALLY want to find all the places this substring shows up, but it misses it if casing is not exactly how I specified. Using `-i`, you can find all occurances regardless of casing. 
```
  grep -r -i "hello"
./written_2/non-fiction/OUP/Berk/CH4.txt:Children’s earliest efforts at make-believe also reveal how challenging they ﬁnd the task of detaching thought from reality. Initially, object substitutions are closely tied to the real things they represent. Toddlers between ages 1 1/2 and 2 generally use only realistic-looking objects while pretending—a toy telephone to talk into or a cup to drink from.9 Once, I handed a 21-month-old a small wooden block, put another to my ear, and called her on the phone: “Ring! Ring! Hello, Lynnay!” She responded by throwing down the block and turning to another activity. Yet when given a plastic replica of a push-button phone, Lynnay readily put the receiver to her ear and pretended to converse.
./written_2/non-fiction/OUP/Berk/CH4.txt:As children engage in play talk, they not only build their vocabularies but correct one another’s errors, either directly or by demonstrating the acceptable way to speak. In one instance, a kindergartner enacting a telephone conversation said, “Hello, come to my house, please.” Her play partner quickly countered with appropriate telephone greeting behavior: “No, ﬁrst you’ve got to say ‘How are you? What are you doing?’”28
./written_2/travel_guides/berlitz1/WhereToItaly.txt:        (or Ca’ Grande), while gondoliers claim Othello’s Desdemona lived in
./written_2/travel_guides/berlitz1/WhereToFrance.txt:        Saint-Wandrille, Le Bec-Hellouin, and Caen, culminating in their
./written_2/travel_guides/berlitz1/WhereToHongKong.txt:        the local people smile “hello” and, if you’re lucky, point you to a
```
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 38 PM" src="https://user-images.githubusercontent.com/122554370/221768666-28a989cf-b39e-4748-9a7d-21c525a0c6a4.png">
  <br>
  Here, I was like, "There's got to be more people who say hello". And making it case insensitive indeed showed more substrings of it!
  <br>
  
```
  grep -r -i "huh"  
Binary file ./.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.pack matches
./written_2/non-fiction/OUP/Berk/ch2.txt:Child: Uh-huh. Dad made cuts in it with a razor. He made a face too. That was funny.66
./written_2/travel_guides/berlitz1/WhereToJapan.txt:        The superbly landscaped Shuhekein pond garden is a
./written_2/travel_guides/berlitz1/WhereToHongKong.txt:        Special Economic Zone of Zhuhai, is becoming something like a boomtown
./written_2/travel_guides/berlitz2/China-WhereToGo.txt:Hohhot (Huhehot)
```
  
<img width="1000" alt="Screenshot 2023-02-27 at 9 36 51 PM" src="https://user-images.githubusercontent.com/122554370/221768669-03dbb928-9cf1-4109-bc61-9661bd8020d8.png">
  <br>
  And I might as well repeat it with 'huh' to see if we can make this word more popular than it already is. 
  <br>


## Checking for full words
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Well, I think I might have searched for too much. I want to make sure that only the word I search shows up, and not all substrings with it. Use the `-w` to only show occurances of the word you specified. 
  ```grep -r -w "hello"
./written_2/travel_guides/berlitz1/WhereToHongKong.txt:        the local people smile “hello” and, if you’re lucky, point you to a
  ```
<img width="1000" alt="Screenshot 2023-02-27 at 9 37 12 PM" src="https://user-images.githubusercontent.com/122554370/221768746-e3a84e34-7acf-4d5a-9280-eae566e26100.png">
  <br>
  I'm pretty sure that 'Bec-Hellouin' isn't a common greeting, but hey we can make it a thing right? Well, for now I want to exclude this. However, notice how it also got rid of the entries with punctuation, as the delimiters for what is a word may not be what you expect!
  <br>
  ```
  grep -r -w "huh"
./written_2/non-fiction/OUP/Berk/ch2.txt:Child: Uh-huh. Dad made cuts in it with a razor. He made a face too. That was funny.66
  ```
  <br>
<img width="1000" alt="Screenshot 2023-02-27 at 9 37 23 PM" src="https://user-images.githubusercontent.com/122554370/221768750-6c1261f4-8ae1-46cc-a578-380d83b2bb2a.png">
  <br>
  You see that previously, 'huh' matched to things like 'zhuhai' which isn't what I'm looking for. This clarifies that, leaving only the superior substring left. 

## Displaying files with the matching pattern
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Well, maybe I don't need the strings themselves, but just the files containing them. Using `-l` can display just that. No need for that extra text to be displayed on the screen if you don't need it!
  <br>
  ```
  grep -r -l "water bottle"
./written_2/travel_guides/berlitz1/WhereToIndia.txt
./written_2/travel_guides/berlitz2/Nepal-WhatToDo.txt
  ```
  <br>
<img width="1000" alt="Screenshot 2023-02-27 at 9 38 50 PM" src="https://user-images.githubusercontent.com/122554370/221769064-de787970-4da3-4c95-8501-2de846635afb.png">
  <br>
  I lost my water bottle somewhere on my journey! At least I can search through my "diary entries" to know where I last remembered to write about it. Here you can see I use the flag to find where in my diary (ahem I mean files) I have "water bottle" as a substring. Oh nvm. Ah there it is. It was on my desk this whole time.
<br>
```
grep -r -l "Taiwan"
./written_2/non-fiction/OUP/Berk/ch2.txt
./written_2/non-fiction/OUP/Abernathy/ch1.txt
./written_2/non-fiction/OUP/Abernathy/ch15.txt
./written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
./written_2/travel_guides/berlitz2/China-WhereToGo.txt
./written_2/travel_guides/berlitz2/China-History.txt
./written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
```
<br> 
  
<img width="1000" alt="Screenshot 2023-02-27 at 9 39 29 PM" src="https://user-images.githubusercontent.com/122554370/221769066-53a0ea23-de6b-4c2f-b3c3-c4f18ebd7c14.png">
  <br>
I kinda wanna learn more about Taiwan. Let's see which texts have anything remotely related. I guess using '-l' can be pretty helpful in cases like these where you just need to find what files to read. 
  <br>

## Show only the matched string
Source: <a href="https://www.thegeekstuff.com/2009/03/15-practical-unix-grep-command-examples/"> thegeekstuff.com<a/>\
Here's another fun one. Using `-o`, you can specify a pattern, and grep will output all the places and the word that matches the pattern. For the sake of not having the code block being super long, I've just included screenshots of these. 
<img width="1000" alt="Screenshot 2023-02-27 at 9 47 19 PM" src="https://user-images.githubusercontent.com/122554370/221769108-02465e32-3cb4-43a0-bba4-ddc6b2483124.png">
  <br>
  Here, I wanted to find out what 5 letter words that end with "ello" appear to see if I can say hello with a twist. And to my surprise there's quite a lot besides hello! You can see that only the words that matched the pattern are shown alongside the file. 
  <br>
<img width="1000" alt="Screenshot 2023-02-27 at 9 49 09 PM" src="https://user-images.githubusercontent.com/122554370/221769112-1c4db070-7061-4b64-8722-fa5ef7653d70.png">
  <br>
  Here, I have no excuses. I was literally curious to see what some random substring I could think of would match. And I guess 'zaci' is my answer. 
