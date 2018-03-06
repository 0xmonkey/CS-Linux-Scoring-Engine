#!/usr/bin/python3

##Adam Podgorny
##Method file for polling for 58{1,2} backend. Adapted from class file
##file: service_task.py

##Need OS module to run system
import os

##For port checking
import socket

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

   #Returns true iff service specified by pname is active
 q = os.system(query) ##Execute query
 if (q == 0):
  q = "TRUE";
 else:
  q = "FALSE";
 t_string = t_string + pname + ":" + str(q) + "\n" ##Return if status code is consistent with an active return code
 counter = counter + 2


print(t_string)
 
