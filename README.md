# ATM-Interface-using-JAVA
### ATM Interface
This Java program simulates an ATM (Automated Teller Machine) interface with basic functionalities such as viewing balance, depositing money, withdrawing money, transferring money, viewing transaction history, and quitting the application. It is designed for educational purposes and demonstrates basic console-based input and output operations.
### Features Implemented:
1. **View Balance**: Displays the current balance of the ATM.
2. **Deposit**: Allows the user to deposit a specified amount of money into the ATM.
3. **Withdraw**: Allows the user to withdraw a specified amount of money from the ATM, provided sufficient funds are available.
4. **Transfer**: Simulates transferring money to another account by reducing the balance (actual transfer to another account would involve additional steps not covered here).
5. **View Transaction History**: Displays a list of all transactions (deposits, withdrawals, and transfers) made during the ATM session.
6. **Quit**: Exits the ATM application.
### Code Explanation:
#### Class `ATM`:
- **Attributes**:
- `balance`: Stores the current amount of money available in the ATM.
- `transactions`: ArrayList to store transaction history.
- **Constructor**:
- Initializes the ATM with an initial balance provided by the user.
- **Methods**:
- `run()`: Main method to run the ATM interface. It displays a menu of options, processes user input, and executes corresponding actions such as viewing balance, depositing money, withdrawing money, transferring money, viewing transaction history, and quitting.
- `viewBalance()`: Displays the current balance of the ATM.
- `deposit(Scanner scanner)`: Prompts the user to enter an amount to deposit, updates the balance accordingly, and logs the transaction.
- `withdraw(Scanner scanner)`: Prompts the user to enter an amount to withdraw, checks if sufficient funds are available, updates the balance, and logs the transaction.
- `transfer(Scanner scanner)`: Simulates transferring money to another account by reducing the balance (actual transfer to another account would require additional functionality).
- `viewTransactionHistory()`: Displays a list of all transactions (deposits, withdrawals, and transfers) made during the ATM session.
#### Main Method (`main`):
- Creates an instance of the `ATM` class with an initial balance of $1000.0 (this can be adjusted as needed).
- Calls the `run()` method to start the ATM interface and handle user interactions.
### Usage:
To run the ATM simulation:
- Compile the Java file (`ATM.java`).
- Execute the compiled Java class (`ATM.class`).
- Follow the on-screen instructions to perform transactions and view the transaction history.
### Note:
- This code is designed for educational purposes to demonstrate basic Java programming concepts such as classes, methods, loops, conditional statements, and ArrayLists.
- In a real-world application, additional features such as user authentication, error handling, and data persistence (using databases or file systems) would be essential for security and reliability.
### Contributing:
Contributions and feedback are welcome! If you find any issues or have suggestions for improvements, please feel free to create an issue or submit a pull request.
