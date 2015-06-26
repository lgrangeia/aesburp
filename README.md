# BURP AES Extension

## Intro

This is a plugin to handle AES encryption / decryption in Burp.

Right now it registers an Intruder Payload Encoder Tab so you can encrypt payloads. In the future I will improve it to handle decryption and integrate it with other burp functions: scanner, repeater, etc.

Contact me via twitter at @lgrangeia for suggestions and use cases and I will try to implement them.

## Compilation

This can be compiled normally using 'javac'. I still haven't built a build.xml or pom.xml file, but there's a jardesc file to compile and package it using Eclipse. There's a precompiled jar at the dist/ folder.

## Usage

Install the burp extension as usual in burp. If you need AES 256 bits and are using Oracle JRE, you may need to install Java Cryptography Extension:

http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

