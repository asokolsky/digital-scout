---
layout: default
title: Cryptography
---

# Cryptography

[wiki](https://en.wikipedia.org/wiki/Cryptography)

Applications for:

- [Authentication](https://en.wikipedia.org/wiki/Authentication) - who are you?
- [Authorization](https://en.wikipedia.org/wiki/Authorization) - are you allowed to do it?

[Practical Problems](problems.md)

## Hash Functions

[Hash functions](https://en.wikipedia.org/wiki/Cryptography#Cryptographic_hash_functions)
"take a variable-length input and return a fixed-length output... For a hash
function to be secure, it must be difficult to compute two inputs that hash to
the same value
([collision resistance](https://en.wikipedia.org/wiki/Collision_resistance))
and to compute an input that hashes to a given output
([preimage resistance](https://en.wikipedia.org/wiki/Preimage_attack))."

Hash function types:

- [MD4](https://en.wikipedia.org/wiki/MD4),
  [MD5](https://en.wikipedia.org/wiki/MD5)
- SHA-0, [SHA-1](https://en.wikipedia.org/wiki/SHA-1),
  [SHA-2](https://en.wikipedia.org/wiki/SHA-2),
  [SHA-3](https://en.wikipedia.org/wiki/SHA-3)
- [comparison](https://en.wikipedia.org/wiki/SHA-3#Comparison_of_SHA_functions)

## Hash Functions Applications

- [NIST Recommendations](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-107r1.pdf)
- avoid storing passwords, use password hash instead;
- calculate data signature, for the integrity verification.

## Shared Key Cryptography

[Shared (symmetric) Key](https://en.wikipedia.org/wiki/Cryptography#Symmetric-key_cryptography)
Cryptography

![Symmetric-key cryptography, where a single key is used for encryption and decryption](https://upload.wikimedia.org/wikipedia/commons/2/27/Symmetric_key_encryption.svg)

### Shared Key Cryptography Applications

- Disk encryption
- Secure Web Browsing: While public keys are used to initiate secure handshakes, SSL/TLS protocols use shared keys to encrypt the actual, ongoing web traffic between your browser and a server.
- Financial Transactions: Symmetric encryption secures sensitive data in transit—such as ATM pin numbers and banking app transactions—between point-of-sale systems and banking networks.
- Virtual Private Networks (VPNs): Protocols like IPsec use shared keys (often generated using protocols like IKE) to establish secure, encrypted tunnels for remote workers accessing corporate intranets.
- Messaging and IoT: Lightweight symmetric algorithms (such as Chacha20) are used in encrypted messaging apps and low-power smart devices where processing speed and battery life are prioritized over asymmetric methods.

## Public Key Cryptography

[Public Key](https://en.wikipedia.org/wiki/Cryptography#Public-key_cryptography)
Cryptography

![Private-key signing](https://upload.wikimedia.org/wikipedia/commons/7/78/Private_key_signing.svg)

### Public Key Cryptography Applications

- Secure Web Communications: SSL/TLS. The website’s SSL/TLS certificate proves its identity, ensuring the encrypted traffic cannot be intercepted.

- Digital Signatures & Non-Repudiation. Verifies exactly who wrote a message and ensures it hasn't been tampered with. A sender uses their private key to "sign" a digital document or email. The recipient uses the sender's public key to verify the signature. This guarantees the author’s identity and prevents them from denying they sent it (non-repudiation).

- Cryptocurrency & Blockchain. Manages asset ownership and secures transactions on decentralized networks. A user's public key acts as their publicly visible wallet address (where others can send funds). The private key functions as the password required to authorize and sign outbound transactions.

- Secure Email & File Transfer. Protects sensitive communications from interception.Tools like PGP/GPG (Pretty Good Privacy) use public keys to encrypt emails or files. Once encrypted with the intended recipient's public key, only that person's private key can unlock the message.

- Secure Remote Access (SSH Keys). Allows system administrators to securely log into remote servers. Replaces traditional passwords with key pairs. The public key is stored on the remote server, while the private key remains locally on the user's computer, validating the login through a cryptographic handshake.

- Code & Software Signing. Ensures software hasn't been altered by malicious third parties during distribution. Software developers sign their executables and patches using their private key. Operating systems or end-user devices use the developer's public key to verify the signature, confirming the software is authentic and legitimate.
