🔐 KeyTrack — Terminal Keystroke Encryption Demo
A lightweight Python tool that captures keystrokes typed directly into its terminal session and displays them in encrypted form in real time. Built as a hands-on learning project to explore symmetric encryption (Fernet / AES) applied to live user input.

✨ Features
Real-time Live Encryption: Reads keypresses one at a time directly from the active terminal window (no need to press Enter).

Symmetric Encryption (Fernet/AES): Encrypts each individual character on the fly before rendering output.

Key Generation: Displays a freshly generated decryption key at startup so outputs can be verified or decrypted later.

⚙️ Requirements & Dependencies
Python: 3.8+

OS: Windows (relies on the built-in msvcrt module)

Library: cryptography

🚀 Quickstart Guide
1. Installation
Install the required encryption package via pip:
   Bash
   pip install cryptography
2. Execution
Save your script as keytrack.py and run it from your terminal:
  python keytrack.py
3. Usage
Type directly into the active terminal window to see the encrypted string generated live for each keypress.

Press Esc at any time to exit the application.
