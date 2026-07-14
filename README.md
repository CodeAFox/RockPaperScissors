# RockPaperScissors

#### Explanations on what I did in this project

First and foremost, I have added jUnit as a testing package as I have used that one the most during previous projects and am most comfortable with that.
I was thinking of trying to add Mockito too, but I have not felt like it would be necessary anywhere so I left that be for now.

What I did in the project is relatively simple; I tried to keep extensibility in the focus, with creating separate entities for Rock, Paper and Scissor; given more options are added, the "wonMatch" function can be extended to include the other options too.

Similarly, game play was also something that could be extended; for now only a 1v1 PVE is available, but multiple game modes such as multiplayer or PVP (although in this case, secrecy could be an issue if players play on the same computer; I doubt a simple console application would be sufficient for that) could still be added like this.

The PVE game mode uses the Random class to get the computer's pseudo random choice, and then it is determined whether the player has won or not.
Unfortunately this does not truly constitue for the mind games two human players could and would play against each other, which makes the game the most fun, but including that would probably overcomplicate this small application by a LOT...