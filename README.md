# RSA Encryption Project

This is a simple Java implementation of the RSA encryption and decryption algorithm.

## ✨ Features
- Find the largest prime numbers `p` and `q` less than user-specified limits.
- Compute RSA key values:
  - Modulus `n`
  - Euler's totient `m`
  - Public key exponent `e`
  - Private key exponent `d`
- Encrypt plaintext using the public key `(e, n)`.
- Decrypt ciphertext using the private key `(d, n)`.

---

## 🛠️ How It Works

### 1. Input
- The user provides upper limits for **p** and **q**.
- The user enters the plaintext message.

### 2. Key Generation
1. Find the **largest prime number ≤ upper limits**.
2. Calculate:
n = p × q
m = (p - 1) × (q - 1)

markdown
Copy code
3. Choose an encryption key **e** such that:
gcd(e, m) = 1

vbnet
Copy code
4. Find the decryption key **d**, the modular inverse of `e mod m`.

### 3. Encryption
Each character in the plaintext is encrypted using:

cipher_char = (plain_char ^ e) mod n

csharp
Copy code

### 4. Decryption
Each character in the ciphertext is decrypted using:

plain_char = (cipher_char ^ d) mod n

yaml
Copy code

---

## 🚀 How to Run

### Compile
```bash
javac RSa.java
Run
bash
Copy code
java RSa
Follow the console instructions.

📌 Example
yaml
Copy code
Enter the upper limit for p: 19
Enter the upper limit for q: 23

The largest prime number (p) is: 19
The largest prime number (q) is: 23

The value of (n) is: 437
The value of (m) is: 396
The value of (e) is: 5
The value of (d) is: 317

Enter the plain text: HELLO
The plain text is: HELLO
The cipher text is: ...
The decrypted text is: HELLO
