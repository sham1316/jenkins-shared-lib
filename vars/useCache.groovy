#!/usr/bin/env groovy

def call(String arg) {
    if (arg == "no")
        return "--no-cache"
    else
        return ""
}
