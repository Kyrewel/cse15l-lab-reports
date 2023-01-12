# **Guide to Using UCSD's ieng6 linux server and your own Github account.**
A 15L guide for new students!

## ieng6
### Setting up VSCODE
While technically using vscode isn't necessary, it will make interacting with your linux acount a
 lot easier! 
* Go to the Visual Studio Code website https://code.visualstudio.com/
* Follow the instructions to download and install it on your computer. 

You should get something like this:
![image](https://user-images.githubusercontent.com/122554370/212139446-dd7ca208-8d41-42eb-814f-f2581f065385.png)


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
```
# Now on remote server
Last login: Sun Jan  2 14:03:05 2022 from 107-217-10-235.lightspeed.sndgca.sbcglobal.net
quota: No filesystem specified.
Hello cs15lwi23zz, you are currently logged into ieng6-203.ucsd.edu

You are using 0% CPU on this system

Cluster Status 
Hostname     Time    #Users  Load  Averages  
ieng6-201   23:25:01   0  0.08,  0.17,  0.11
ieng6-202   23:25:01   1  0.09,  0.15,  0.11
ieng6-203   23:25:01   1  0.08,  0.15,  0.11

Sun Jan 02, 2022 11:28pm - Prepping cs15lwi23
```

Now you are connected and can use it like any other linux terminal. Play around and try some 
commands like this!

// add photo here




