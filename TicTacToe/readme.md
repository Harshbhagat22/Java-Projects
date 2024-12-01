# Tic-Tac-Toe

## Description

The **Tic-Tac-Toe** game is a simple and interactive command-line application built in Java. It allows two players to compete in the classic Tic-Tac-Toe game, where the goal is to align three of their marks (either X or O) in a row, column, or diagonal on a 3x3 grid. The game alternates between the two players, and it provides a user-friendly interface to make moves and check for the winner after each turn.

This project serves as a great demonstration of basic game logic, turn-based interaction, and implementing a two-player console game in Java.

## Features

- Two-player gameplay: Each player alternates between marking "X" and "O".
- Win conditions: The game checks for three aligned marks (horizontally, vertically, or diagonally).
- Draw condition: The game recognizes when there is no winner and the grid is full, resulting in a draw.
- User-friendly command-line interface to enter moves.

## How It Works

The game uses a 3x3 grid, represented by a 2D array. Players take turns entering their moves, with each move being placed in an empty spot on the grid. After each move, the game checks if either player has won, or if the game has ended in a draw (if the grid is full and there is no winner).

### Gameplay Flow:
1. The program starts by displaying an empty grid.
2. Player 1 is prompted to choose a cell for their "X".
3. Player 2 is prompted to choose a cell for their "O".
4. After each move, the grid is updated, and the game checks for a win or draw.
5. The game continues until there is a winner or a draw.

## Example

```
Player 1 (X), enter your move (row and column): 1 1
Player 2 (O), enter your move (row and column): 0 1
Player 1 (X), enter your move (row and column): 2 2
Player 2 (O), enter your move (row and column): 0 2
Player 1 (X), enter your move (row and column): 0 0
Player 1 wins!
```

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/tic-tac-toe.git
   ```

2. Navigate to the project directory:
   ```bash
   cd tic-tac-toe
   ```

3. Compile and run the program:
   ```bash
   javac TicTacToe.java
   java TicTacToe
   ```

4. Follow the on-screen prompts to start the game and make your moves.







