import msvcrt
from cryptography.fernet import Fernet

# Generate an encryption key
key = Fernet.generate_key()
cipher = Fernet(key)

print("Encryption key (save this if you want to decrypt later):")
print(key.decode())
print("\nStart typing (Esc to exit):\n")

try:
    while True:
        ch = msvcrt.getch()

        if ch == b'\x1b':
            break

        if ch in (b'\x00', b'\xe0'):
            ch2 = msvcrt.getch()
            print(f"Special key pressed (code: {ch + ch2})")
            continue

        try:
            decoded = ch.decode('utf-8')
        except UnicodeDecodeError:
            decoded = repr(ch)

        encrypted = cipher.encrypt(ch)
        print(f"Key: {decoded!r} -> Encrypted: {encrypted.decode()}")

except KeyboardInterrupt:
    pass
finally:
    print("\nExiting.")