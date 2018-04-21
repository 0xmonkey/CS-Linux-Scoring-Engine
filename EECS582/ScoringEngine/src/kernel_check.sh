#!/bin/bash

in_situ=$(uname -r);

if [ $in_situ == $1 ]; then
	exit 0
else
	exit 1
fi
