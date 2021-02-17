#!/usr/bin/env groovy

def call(String arg) {
    if (arg == "no")
        return "--cache=false"
    else
        return "--cache=true"
}
