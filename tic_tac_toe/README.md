# Problem

Design a Tic Tac Toe game.


# Analysis

This question is a very good candidate to test how well we can come up with a object-oriented design for a popular game. 
There are likely only a few objects and minimal interaction so it is well-suited for a 30 to 1 hour interview.

1. Questions to ask

The problem statement is very short so depending if you know the game or not, you can ask several questions to understand 
more about the requirements. For example, you can ask:

- What are the size of the board? Is it 3x3 or nxn?
- What are the rules to decide the winner?

2. Entities

Try to map from the real objects related to the game to the entities. On minimal, we can come up with the following classes:

- Board (represents a tic tac toe board)
- Player (obviously represents a player)
- Game (represents a game) 

3. Implementation

Assuming after clarifications, you are asked to implement a generic tic tac toe game on the game board of size n x n. The first player always plays O, and second player always plays X. One thing to take note that the game may end without any winner. Also need to take note that a move by player may be invalid if:

- The cell is already played (No replay allowed)
- Play outside of the board
- The game is already finished

The conditions to win the game are:

- The first player forms the a row, a column or a diagonal line of the same symbol win the game.




