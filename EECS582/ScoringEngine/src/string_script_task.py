#!/usr/bin/python3

##Adam Podgorny and Wesley Adams
##Method file for polling for 58{1,2} backend. Adapted from class file
##file: service_task.py

##Need OS module to run system
import os

##For port checking
import socket

##imports for user/sudo password checking
import re
import pwd
from spwd import getspnam
from os import getuid

##Implicitly assumed here is the behavior of systemctl -is-active QUERY
##For an active and loaded module, a return code of 0 is obtained
##So this is used as a comparator for the os.system(query) call

arg_length = len(os.sys.argv)
counter = 1
t_string = ""

while (counter < arg_length):

 s_type = int(os.sys.argv[int(counter)])
 pname = os.sys.argv[int((counter+1))]
 pname = str(pname)

 #for service checking
 if (s_type =< 3 && s_type >= 0)
     #s_type is zero in system proc calls
     if (s_type == 0):
      ##query = "systemctl is-active -q " + pname ##build the query string to be called
      query = "status " + pname
     ##In the event we have a process that must be queried by invoking ps -e
     elif (s_type == 1):
      query = "ps -e | grep -iw " + pname

     elif (s_type == 2): ##If the type is a port number
      query = "Please cla---implement me"
       ##OHWEEE THIS IS GOING TO BE A GIANT PAIN

     elif (s_type == 3): ## Checking for various file types
      query = "find /home -r *." + pname

       #Returns true iff service specified by pname is active
     q = os.system(query) ##Execute query
     if (q == 0):
      q = "TRUE";
     else:
      q = "FALSE";
     t_string = t_string + pname + ":" + str(q) + "\n" ##Return if status code is consistent with an active return code
     counter = counter + 2
 #checking user password is set
 elif (s_type == 4)

 #checking user exists
 elif (s_type == 5)

 #checking password policy
 elif (s_type == 6)

 #checking sudo user passwords
 elif (s_type == 7)

print(t_string)


def check_user_password_set(userName: str) -> bool:
	'''
	Checks if user has a set password.
	Parameters
	----------
	userName : str
		Username of user being checked for password
	Returns
	-------
	bool
		True if user has a password.
		False if user does not have a password.
	'''

	#Check for root UID.
	if(getuid() != 0):
		print("You must have root privileges to run this utility.")
		exit(1)

	encrypted_pwd = getspnam(userName)[1]

	if(encrypted_pwd == ""):
		#No password.
		return False
	elif(encrypted_pwd == "*"):
		#Password never established.
		return False
	elif(encrypted_pwd == "!"):
		#Account locked.
		return False
	elif(encrypted_pwd == "!!"):
		#Account has been created but no password is set.
		return False
	else:
		return True

def check_user_exists(userName: str) -> bool:
    '''
    Checks if user exists on the machine
    Parameters
    ----------
    userName : str
        Username of user being checked for existence
    Returns
    -------
    bool
        True if user exists
        False if user does not exist
    '''
    try:
    # Searches /etc/passwd for entry with username userName
        pwd.getpwnam(str(userName)) # Forces input to be a string
        print(True)
        return True
    except KeyError:
        print(False)
        return False


#Description: Checks if specific password policy is set based off input parameters.
#Preconditions: Password policy is enforced in /etc/login.defs
def check_password_policy(changeTries: int=None, maxDays: int=None, maxLen: int=None, minLen: int=None) -> bool:
    '''
    Checks if passwords policy is enforced

    Scrubs the /etc/login.defs file for parameters:
    [
        PASS_CHANGE_TRIES, PASS_MAX_DAYS,
        PASS_MAX_LEN, PASS_MIN_LEN
    ]

    User can set values for these parameters to match

    Parameters
    ----------
    changeTries : int
        DEFAULT = None
        Represents how many times a user may attempt to change password
        before they are locked out
    maxDays : int
        DEFAULT = None
        Represents maximum days that a password will stay valid
    maxLen : int
        DEFAULT = None
        Represents maximum length of new passwords
    minLen : int
        DEFAULT = None
        Represents minimum length of new passwords

    Returns
    -------
    bool
        True if parameters set by user match what is in /etc/login.defs
        False otherwise
    '''

    # Stores arguments in a dictionary form for comparison
    argDict = {
        'PASS_MAX_DAYS'     : maxDays,
        'PASS_CHANGE_TRIES' : changeTries,
        'PASS_MIN_LEN'      : minLen,
        'PASS_MAX_LEN'      : maxLen
    }

    # Stores all non-None arguments
    userArgDict = {}
    for key in argDict:
        if argDict[key] != None:
            userArgDict[key] = argDict[key]

    loginFile = open("/etc/login.defs", 'r')

    # List of lines containing values we are checking
    lines = []

    # Will hold translated key/value pairs from the 'lines' list
    fileDict = {}

    # Filtering lines in /etc/login.defs to only save lines with the
    # search values
    for line in loginFile:
        if (
                ('PASS_MAX_DAYS' in line or
                'PASS_CHANGE_TRIES' in line or
                'PASS_MIN_LEN' in line or
                'PASS_MAX_LEN' in line) and
                # Prevents commented lines from being included
                '#' not in line
            ):

            # Saves line to 'lines' array
            lines.append(line)

    # Closes file '/etc/login.defs'
    loginFile.close()

    '''
    Translates lines[] into a dictionary

    Example lines[] state is ['PASS_MAX_DAYS\t9999\n']

    Translated sample: {'PASS_MAX_DAYS': '9999'}
    '''
    for entry in lines:
        key = entry.split('\t')[0]

        # Ensures that the dict value is only numeric characters
        value = re.sub("\D", "", entry.split('\t')[1])
        fileDict[key] = int(value) # Must cast as int to compare properly

    # Compares the two dictionaries to see if they match
    # If they match, return True.  Else return False.
    if userArgDict == fileDict:
        return True
    else:
        return False


def check_sudo_user_password() -> bool:
  '''
  Function checks if sudo users are set to require passwords

  Searches the /etc/sudoers file for the entry 'NOPASSWD'
  If this setting exists in the file, then that means a sudo user
  will be able to execute sudo commands without having to use a password

  Parameters
  ----------
  None

  Returns
  -------
  bool
    True if sudo users must use passwords to execute sudo commands
    False if sudo users do not have to use passwords to execute sudo commands
  '''
  # String to search
  searchStr = 'NOPASSWD'

  # Storing open file object for the /etc/sudoers file
  sudoFile = open("/etc/sudoers", 'r')

  # If str exists in sudoFile, return False
  # else return True
  if searchStr in sudoFile.read():
    sudoFile.close()
    print('false')
    return False
  else:
    sudoFile.close()
    print('true')
    return True
