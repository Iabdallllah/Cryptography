RSA Encryption Project
This is a simple Java implementation of the RSA encryption and decryption algorithm.

Features
Find the largest prime numbers p and q less than user-specified limits.

Compute RSA key values: modulus n, Euler's totient m, public key exponent e, and private key exponent d.

Encrypt a plaintext message using the public key (e, n).

Decrypt the ciphertext back to the original plaintext using the private key (d, n).

How It Works
Input:

The user provides upper limits for p and q.

The user then enters the plaintext message.

Key Generation:

Find the largest prime number ≤ upper limits.

Calculate n = p × q.

Calculate m = (p-1) × (q-1).

Choose an encryption key e such that gcd(e, m) = 1.

Find the decryption key d as the modular inverse of e mod m.

Encryption:
Each character in the plaintext is encrypted individually using the formula:

ini
Copy
Edit
cipher_char = (plain_char ^ e) mod n
Decryption:
Each character in the ciphertext is decrypted individually using the formula:

ini
Copy
Edit
plain_char = (cipher_char ^ d) mod n
How to Run
Compile the program:

bash
Copy
Edit
javac RSa.java
Run the program:

bash
Copy
Edit
java RSa
Follow the console instructions to input values and see the results.

Example
text
Copy
Edit
Enter the upper limit for p:
19
Enter the upper limit for q:
23
The largest prime number (p) is: 19
The largest prime number (q) is: 23
The value of (n) is:437
The value of (m) is:396
The value of (e) is:5
The value of (d) is:317
Enter the plain text:
HELLO
The plain text is:HELLO
The cipher text is:...
The decrypted text is:HELLO
Notes
This project simplifies RSA to work character-by-character, not block-by-block, which is not secure for real-world usage.

The encryption and decryption process uses repeated multiplication for exponentiation, which can be inefficient for large values.

For educational purposes only.

License
This project is open-source and free to use.

