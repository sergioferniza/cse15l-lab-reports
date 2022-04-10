Lab report 1:

Sergio Ferniza Marquez.

# Install VScode

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-1.png)

* Go to [Link](https://code.visualstudio.com/) and click the install for windows.
* Follow the instructions of the installer and choose the defaults.
* Complete.

# Remotely Connecting

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-2.png)

* Install OpenSSH and look for your account.
* Open the terminal and type 
"$ ssh {your account}"
* If its your first time entering the server. Type yes and give your password.

# Trying Some Commands

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-3.png)

* Open the ssh terminal.
* Type your command (in this case Finger)
* Click enter to return.

# Moving Files with SCP

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-4.png)

* Chose the file you want to work with.
* Run the following command:
scp WhereAmI.java {user account}:~/
* Log into the sever and use the ls command to check that the file is there.

# Setting an SSH Key

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-5.png)

* run ssh-keygen to create a public and private key.
* Put the public key in a location of the server.
* Put the private key in a location of the client.

# Optimizing Remote Running

![image](https://github.com/sergioferniza/cse15l-lab-reports/docs/assets/cse-15l-6.png)

* Add commands to the ssh command to run them together.
* Join you commands using ";" to run them all together
* use the up-arrow to access the command.