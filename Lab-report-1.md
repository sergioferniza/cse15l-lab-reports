Lab report 1:

Sergio Ferniza Marquez.

# Install VScode

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/cse-15l-1.png)

* Go to [Link](https://code.visualstudio.com/) and click the install for windows.
* Follow the instructions of the installer and choose the defaults.
* Complete.

# Remotely Connecting

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-1.png)

* Install OpenSSH and look for your account.
* Open the terminal and type:
 ```$ ssh {your account}```
* If its your first time entering the server. Type yes and give your password.

# Trying Some Commands

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-2.png)

* Open the ssh terminal.
* Type your command (in this case ```Finger```)
* Click enter to return.

# Moving Files with SCP

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-4.png)

* Chose the file you want to work with.
* Run the following command:
```scp {file name} {user account}:~/```
* Log into the sever and use the ls command to check that the file is there.

# Setting an SSH Key

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-6.png)

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-5.png)

* run ```ssh-keygen``` to create a public and private key.
* Put the public key in a location of the server.
* Put the private key in a location of the client.

# Optimizing Remote Running

![image](https://raw.githubusercontent.com/sergioferniza/cse15l-lab-reports/main/docs/assets/15l-7.png)

* identify your 3 command youll need:

    ```git add .```, ```git commit {name}```, ```git push```
* Join you commands using ```;``` to run them all together
* use the up-arrow to access the command.
* it should look as follows:

    ```git add .; git commit {name}; git push```