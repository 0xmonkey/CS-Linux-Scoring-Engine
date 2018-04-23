#!/bin/bash

if [ -z $(apt-get -u upgrade --assume-no) ] then
	exit 0
else
	exit 1
fi

