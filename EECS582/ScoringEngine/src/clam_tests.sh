#!/bin/bash


#Test to see if clamd is installed
clamd_status=$(clamd --version)
if [ "$?" != "0" ]; then
	ret=1 #clamd not installed
else if [ $clamd_status == "$(1)" ]; then
	ret=0
else
	ret=2

fi

