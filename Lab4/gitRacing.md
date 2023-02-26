# Guide to the Fastest CSE 15L Git Race Time
note: these instructions are SPECIFIC to the CSE 15L race done in lab in Winter 2023

## Set Up
Before the run, there's a few things that need to be in place in order to optimize the run.
- [ ] Set up SSH keys for ieng6. This allows for instantaneous connection without needing to type the password
- [ ] Set up .vimrc in order to use your mouse in vim
- [ ] Have the Lab 7 repo already forked so you have your own repo to push to.
- [ ] Have the git repo clone command on your clipboard prior to the run.
- [ ] Have the compile/run JUnit commands in a separate document on the side, ready to be copy pasted. Again, removing the need of more typing. (use split screen to not need to move from window to window)
- [ ] Make sure that the last command on your local terminal was the ssh login, so that you can just use the <up> arrow and enter to login. 

## Execution
These are the steps that I took when running. 
  
1. `<up><enter>`: enters into ieng6
2. `[<cmd> + v] <enter>`: clones the repo
3. `cd l<tab>`: enters into the lab7 directory
4. (Go to document and highlight commands)`[<ctrl> + c]`: (Use mouse and highlight the compile/run commands) 
5. (Click back to terminal) `[<ctrl> + v] <enter>`: runs the JUnit Tests
6. `vim L<tab>.<tab><enter>`: opens the ListExamples file in vim
7. (click on the '1' on row 43)`a<backspace>2<esc>:wq<enter>`: changes the error, writes to file, and quits
8. `[<ctrl> + v] <enter>`: runs the JUnit Tests
9. `git add .<enter>`: adds the edited files to git
10. `git commit -m "a"<enter>`: commits the files
11. `git push`<enter>: pushes edits to your repo
  
... and TIME!\
Hopefully you were able to get an extraordinary time with this strategy!
