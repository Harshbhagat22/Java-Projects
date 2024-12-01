# Password Generator

## Description

The **Password Generator** is a Java-based application designed to generate random, secure passwords. It allows the user to customize the password length, and ensures that each password contains a mixture of uppercase letters, lowercase letters, digits, and special characters. This randomization of characters helps in creating strong passwords, making them more resistant to common password-guessing attacks.

This tool is perfect for those looking to quickly generate secure passwords for online accounts, applications, or other purposes where strong passwords are required. With its simple and intuitive user interface, you can easily generate passwords of any length within seconds.

## Features

- Generates random passwords with a combination of uppercase letters, lowercase letters, digits, and special characters.
- Allows the user to specify the length of the password.
- Uses the `Random` class for secure randomization of characters.
- Command-line interface for easy interaction.

## How It Works

The program randomly selects characters from a predefined character set that includes:
- Uppercase letters (`A-Z`)
- Lowercase letters (`a-z`)
- Digits (`0-9`)
- Special characters (`!@#$%^&*()-_+=<>?`)

Once the user specifies the desired length of the password, the program generates and displays a random password based on that length.

## Example

```
Enter password length: 12
Generated password: L9$k3Z@p1Qf2
```

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/password-generator.git
   ```

2. Navigate to the project directory:
   ```bash
   cd password-generator
   ```

3. Compile and run the program:
   ```bash
   javac PasswordGenerator.java
   java PasswordGenerator
   ```

4. Enter the desired password length when prompted, and the program will generate a random password for you.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
