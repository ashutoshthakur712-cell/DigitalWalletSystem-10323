# DigitalWalletSystem-10323


Digital Wallet System (Java)

A simple Digital Wallet System built in Java that simulates basic wallet operations like depositing money, transferring funds, and earning cashback.

🚀 Features
💵 Deposit money into wallet
🔄 Transfer money between wallets
🎁 Cashback system (default: 2%)
⚠️ Exception handling for:
Invalid amount
Insufficient balance
🔒 Encapsulation using private variables
⚙️ Static configuration for cashback rate
🧠 Concepts Used
Object-Oriented Programming (OOP)
Classes & Objects
Encapsulation
Static variables & methods
Exception Handling (try-catch)
Method design
📂 Project Structure
DigitalWalletSystem.java
│
├── class Wallet
│   ├── balance (private)
│   ├── cashbackRate (static)
│   ├── deposit()
│   ├── transferTo()
│   ├── getBalance()
│   └── setCashbackRate()
│
└── class DigitalWalletSystem (Main Class)
▶️ How to Run
Make sure Java is installed

Save the file as:

DigitalWalletSystem.java

Compile the code:

javac DigitalWalletSystem.java

Run the program:

java DigitalWalletSystem
🖥️ Sample Output
=== Digital Wallet System ===

Deposited: 1000

Initial Balance:
Wallet 1: 1000.0
Wallet 2: 0.0

Transferring 300...

Transaction successful!
Transferred: 300.0
Cashback received: 6.0

Final Balance:
Wallet 1: 706.0
Wallet 2: 300.0
⚙️ Customization

You can change cashback rate globally:

Wallet.setCashbackRate(0.05); // 5% cashback
⚠️ Error Handling
❌ Negative or zero amount → rejected
❌ Transfer more than balance → blocked
✅ Valid transactions → processed with cashback
📌 Future Improvements
Add user input (Scanner)
Add transaction history
Add wallet ID / user authentication
GUI version (Swing / JavaFX)
Database integration
