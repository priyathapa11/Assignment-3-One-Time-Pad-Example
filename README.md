# One-Time Pad Encryption

## Overview
This project demonstrates one-time pad encryption using Java. The program encrypts and decrypts the text:

`MY NAME IS UNKNOWN`

## Features
- Generates a random key using `SecureRandom`
- Encrypts plaintext using XOR
- Decrypts ciphertext back to the original message
- Displays the key and encrypted text using Base64

## How It Works
The key is generated with the same length as the plaintext. Each byte of the message is combined with the matching byte of the key using XOR. The same key is used again to decrypt the message.

## Security Note
For one-time pad encryption to be secure, the key must be truly random, used only once, kept secret, and be the same length as the message.

## Technology Used
- Java
