#!/bin/bash

q=$(diff -w $2 --to-file=$1)

if [ -z "$q" ]; then
	exit 0
else
	exit 1
fi


