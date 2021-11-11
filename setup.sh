#!/usr/bin/env bash

# Test with gradescope/base:ubuntu-15.10 plus the following:
#apt-get update
#apt-get install -y curl unzip
#apt-get clean
#rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*
#mkdir -p /autograder/source
#mkdir /autograder/results

#example test:
#docker run -it -v /Users/mcorner/docker:/tmp/docker gradescopev1 /bin/bash
#cd /autograder/submission
#unzip /tmp/docker/hamspam-student.zip
#cd /autograder/source
#unzip /tmp/docker/hamspam-gradescope.zip
# run_autograder

# Gradescope builds are based on: gradescope/auto-builds:ubuntu-15.10
apt-get update
apt-get -y install openjdk-8-jdk
apt-get -y install ant
