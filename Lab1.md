# **Guide to Using UCSD's ieng6 linux server and your own Github account.**
A 15L guide for new students!

## ieng6
### Setting up VSCODE
While technically using vscode isn't necessary, it will make interacting with your linux acount a
 lot easier! 
* Go to the Visual Studio Code website https://code.visualstudio.com/
* Follow the instructions to download and install it on your computer. 

You should get something like this:
![image](https://user-images.githubusercontent.com/122554370/212159355-3f6efdb4-41b6-4cdf-9ea6-19b2ded8c34e.png)


### SSH connect
Open a terminal in VScode. (Ctrl or Command + `, or use the Terminal → New Terminal menu option).
In the terminal, enter the following, replacing the zz with your UCSD 
```
$ ssh cs15lwi23zz@ieng6.ucsd.edu
```

After succesfully connecting, you should receive a message like this:
```
⤇ ssh cs15lwi23zz@ieng6.ucsd.edu
The authenticity of host 'ieng6.ucsd.edu (128.54.70.227)' can't be established.
RSA key fingerprint is SHA256:ksruYwhnYH+sySHnHAtLUHngrPEyZTDl/1x99wUQcec.
Are you sure you want to continue connecting (yes/no/[fingerprint])? 
```
When you access new server for the first time, you will usually see something like this. 
However if you see this on a server you access often, it could mean that someone is trying to 
access your connection, so be careful! However in this case you probably can just say 'Yes' with
no repercussions!

After a successful login, you should have something like this!
![image](https://user-images.githubusercontent.com/122554370/212159353-209562e8-be36-4b7a-a76d-4bd5f338910a.png)

Now you are connected and can use it like any other linux terminal. Play around and try some 
commands like this!

![image](https://user-images.githubusercontent.com/122554370/212159351-1c189b33-2f57-45e7-a7e0-07f867efc092.png)

ls    - list files\
cd    - change directory\
mkdir - make directory\
..    - go up a level\
~     - root directory
 
Play around with more linux commands! 




