# Guide to the Fastest CSE 15L Git Race Time
note: these instructions are SPECIFIC to the CSE 15L race done in lab in Winter 2023

## Set Up
Before the run, there's a few things that need to be in place in order to optimize the run.
- Set up SSH keys for ieng6. This allows for instantaneous connection without needing to type the password
- Set up .vimrc in order to use your mouse in vim
- Have the Lab 7 repo already forked so you have your own repo to push to.
- Have the git repo clone command on your clipboard prior to the run.
- Have the compile/run JUnit commands in a separate document on the side, ready to be copy pasted. Again, removing the need of more typing. (use split screen to not need to move from window to window)
- Make sure that the last command on your local terminal was the ssh login, so that you can just use the <up> arrow and enter to login. 

## Copy paste page:
  <img src = "https://user-images.githubusercontent.com/122554370/221446146-20d33d27-659e-4786-bc29-b352663f780f.png" alt="altText" width="400px"/>

## Execution
These are the steps that I took when running. If you are not on a mac, use `<ctrl>` instead of `<cmd>`
  
1. `<up><enter>`: enters into ieng6\
  <img src = "https://user-images.githubusercontent.com/122554370/221446178-6a2796d7-6f1d-40ec-9877-da56b1480853.png" alt="altText" width="400px"/>
  
2. `[<cmd> + v] <enter>`: clones the repo\
  <img src = "https://user-images.githubusercontent.com/122554370/221446201-575c3a65-67ef-40e6-a975-7966ab049b89.png" alt="altText" width="400px"/>
  
3. `cd l<tab>`: enters into the lab7 directory\
  <img src = "https://user-images.githubusercontent.com/122554370/221446210-9d8a2b04-b12d-4eb6-a5e3-a4123ffa2907.png" alt="altText" width="400px"/>
  
4. (Go to document and highlight commands)`[<cmd> + c]`: (Use mouse and highlight the compile/run commands) \
  <img src = "https://user-images.githubusercontent.com/122554370/221446538-bbcaed35-0b4d-487f-a4b5-8e209764b5d4.png" alt="altText" width="400px"/>
  
5. (Click back to terminal) `[<cmd> + v] <enter>`: runs the JUnit Tests\<img src = "https://user-images.githubusercontent.com/122554370/221446323-a2117d54-c3fb-46a3-a691-2f91dcf65c5d.png" alt="altText" width="400px"/>
  
6. `vim L<tab>.<tab><enter>`: opens the ListExamples file in vim\
  <img src = "https://user-images.githubusercontent.com/122554370/221446378-809c42d3-79b3-4726-bc7c-6a6d71f0b0fe.png" alt="altText" width="400px"/>
  
7. (click on the '1' on row 43)`a<backspace>2<esc>:wq<enter>`: changes the error, writes to file, and quits \
  <img src = "https://user-images.githubusercontent.com/122554370/221446397-bd18ba02-56fc-47ca-a536-22af18df0588.png" alt="altText" width="400px"/>
  
8. `[<cmd> + v] <enter>`: runs the JUnit Tests\
  <img src = "https://user-images.githubusercontent.com/122554370/221446408-323551d6-e0e7-4d71-bbd7-e166d145a08d.png" alt="altText" width="400px"/>
  
9.  `git add .<enter>`: adds the edited files to git
10. `git commit -m "a"<enter>`: commits the files
11. `git push`<enter>: pushes edits to your repo\
  Image has add, commit, and push:\
<img src = "https://user-images.githubusercontent.com/122554370/221446418-a89a73c1-1b1d-4b61-a618-01bc20b3e5ce.png" alt="altText" width="400px"/>
  
... and TIME!\
Hopefully you were able to get an extraordinary time with this strategy!
