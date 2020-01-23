# BusinessHouseGame
Business House Game - Data Modeling

Business house is a board game which require minimum 2 players. Players uses a random number b/w 2-12 and move on the board accordingly.

Each player has some amount at start.

The board cell may be one of the following types.

1.Jail: When user lands on it, a defined amount, for eg. Rs.150 will be deducted from user's money

2.Treasure: When user lands on it, a defined amount, for eg. Rs.200 will be added to user's money

3.Hotel: This is a special type of entity
  a. A hotel is of defined worth, for eg. Rs.200
  b. When user lands on it and has required money, he has to buy it
  c. If any other user lands on a pre owned hotel, user needs to pay Rs.50 to hotel owner
  
  ### How to play
  
  1. Two+ users will start from starting point with initial money
  2. They have to move as per random number b/w 2-12
  3. Every move has to follow cell type rules defined above
  4. Max ten chances will be awarded to each player
  5. After 10 chances, player with max money will be considerd as winner
  
  ### Inputs:
  
  #### Number of players: 3
  #### Cell Position and types: EEJHETJTEEHJTHEEJHETJTEEHJTHJEEJHETJTEEHJTEHE
  
  . E -> Empty 
  . J -> Jail
  . T -> Treasure
  . H -> Hotel
  
  #### Dice o/p: 4,4,4,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12
  
  #### Hard coded values:
  . Initial money for each player: 1000
  . Hotel worth: 200
  . Hotel rent: 50
  . Jail fine: 150
  . Treasure value: 200
  
### Desired o/p:

We need to print total worth of each players in decreasing order.
Total worth =  money reamining at end + value of all hotel bought by player

. Player 1 - 1200
. Player 2 - 1200
. Player 3 - 1050
