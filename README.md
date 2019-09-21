# OOD Coding Exerise

NOTE: I didn't come up with this exercise but it was fun to implement

### Exercise 
The goal of this exercise is to create a program to read in a baseball box score and 
output the result and statistics for the game. Please write an application in Java that 
will read in the input file and write out the results to a file called “Game_results.txt”. 

#### Input: 
There will be two data sets.  
The first data set will be called “players.txt”. This will contain player data in the csv 
format. 

The second data set will be a collection of games data files. Each file will contain a 
line with the scores per inning. The line will be comma delimited and will alternate 
between top of the inning and bottom of the inning. 

For example: 
<pre>0,1,2,0,0,0,5,1,0,0,1,1,0,1,0,0,0,0</pre>
0 runs were scored in the top of the first inning, 1 run was scored in the bottom of 
the first inning, 2 runs were scored in the top of the second inning, 0 runs were 
scored in the bottom of the second inning, and so on. There will be a minimum of 9 
innings. Note: There does not have to be a bottom of the ninth if the home team is 
winning after the top of the ninth is over. 
 
The next nine lines will be the players from a single team and their statistics for the 
game. 
 
For example: 
<pre>f08161f2-7d7b-11e9-8f9e-2a86e4085a59,4,1,1,0,0 </pre>
This line is the player’s id followed by the number of at bats, singles, doubles, triples, 
and home runs.  
Output: 
Please create a file for each game with the following format: 
<pre>
Visitor: <number of runs> 
Home: <number of runs> 
<player name><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
<player name ><tab><batting average for the game><tab><slugging percentage> 
</pre>

Batting Average = number of hits divided by the number of at bats.  
Please order the players based on their batting averages from best to worst. 
Slugging percentage is the total number of bases hit for divided by the number of at 
bats. 

Both values are typically reported to 3 decimal places.
