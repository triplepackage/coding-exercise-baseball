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
```0,1,2,0,0,0,5,1,0,0,1,1,0,1,0,0,0,0```
0 runs were scored in the top of the first inning, 1 run was scored in the bottom of 
the first inning, 2 runs were scored in the top of the second inning, 0 runs were 
scored in the bottom of the second inning, and so on. There will be a minimum of 9 
innings. Note: There does not have to be a bottom of the ninth if the home team is 
winning after the top of the ninth is over. 
 
The next nine lines will be the players from a single team and their statistics for the 
game. 
 
For example: 
```f08161f2-7d7b-11e9-8f9e-2a86e4085a59,4,1,1,0,0```
This line is the player’s id followed by the number of at bats, singles, doubles, triples, 
and home runs.  
Output: 
Please create a file for each game with the following format: 
```
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
```

Batting Average = number of hits divided by the number of at bats.  
Please order the players based on their batting averages from best to worst. 
Slugging percentage is the total number of bases hit for divided by the number of at 
bats. 

Both values are typically reported to 3 decimal places.

Sample output:
```
**********************************************
Game: 11                  
Visitor: 5
Home: 0
----------------------------------------------
Name                    Bat Avg   Slugging
Glen Baldwin              0.600      1.800
Nicolas Rivera            0.000      0.000
Seth Ballard              0.571      1.714
Scott Morales             1.000      2.800
Andres Keller             1.000      2.400
Leroy Cole                1.000      2.000
Jimmie Hogan              0.286      0.286
Luke Webb                 0.571      1.143
Rufus Bowers              1.000      1.000
**********************************************
Game: 10                  
Visitor: 0
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Pablo Hanson              0.143      0.429
Winston James             0.750      2.250
Eddie Olson               0.714      2.857
Edgar Pierce              0.286      0.714
Luke Webb                 0.571      2.286
Travis Lee                0.750      1.500
Hugh Matthews             0.571      1.857
Stuart Wood               0.667      1.333
Stephen Tate              1.000      1.400
**********************************************
Game: 12                  
Visitor: 0
Home: 6
----------------------------------------------
Name                    Bat Avg   Slugging
William Salazar           0.833      1.667
Leroy Cole                0.750      0.750
Cornelius Nguyen          0.000      0.000
Pablo Hanson              0.000      0.000
Leonard Rice              0.200      0.600
Hugh Matthews             1.000      2.500
Felipe Maldonado          0.857      1.143
Rufus Bowers              1.000      1.000
Guillermo Higgins         1.000      2.333
**********************************************
Game: 13                  
Visitor: 15
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Ricky Garcia              0.000      0.000
Jim Hoffman               0.167      0.667
Kirk Dunn                 0.750      1.250
Bernard Valdez            0.857      2.286
Lyle Schultz              0.800      2.600
Luther Patrick            0.714      0.857
Omar Andrews              0.714      2.857
Lorenzo Mason             1.000      4.000
Cornelius Nguyen          0.857      2.000
**********************************************
Game: 17                  
Visitor: 10
Home: 2
----------------------------------------------
Name                    Bat Avg   Slugging
Lawrence Reed             0.000      0.000
Micheal Gill              1.000      2.286
Garry Bailey              0.833      1.667
Louis Luna                0.167      0.500
Marco Saunders            0.833      2.500
Alonzo Parker             1.000      2.800
Timmy Romero              1.000      1.667
Gerardo Nunez             0.000      0.000
Sergio Ruiz               0.750      1.500
**********************************************
Game: 16                  
Visitor: 0
Home: 5
----------------------------------------------
Name                    Bat Avg   Slugging
Reginald Flores           0.000      0.000
Donnie Morris             0.429      0.429
Cornelius Nguyen          0.400      1.600
Alonzo Parker             1.000      1.200
Edgar Pierce              0.714      0.714
Marty Murphy              1.000      1.000
Levi Cobb                 0.000      0.000
Glen Baldwin              1.000      4.000
Wilbur Collins            0.500      0.500
**********************************************
Game: 14                  
Visitor: 2
Home: 9
----------------------------------------------
Name                    Bat Avg   Slugging
Jermaine Carson           1.000      1.857
Eddie Olson               1.000      1.000
Salvatore Reynolds        1.000      4.000
Levi Cobb                 0.714      1.571
Bernard Valdez            0.200      0.600
Seth Ballard              1.000      2.571
Marc Graham               1.000      4.000
Luis Castro               0.000      0.000
Clifton Jenkins           1.000      3.000
**********************************************
Game: 15                  
Visitor: 0
Home: 0
----------------------------------------------
Name                    Bat Avg   Slugging
Bernard Valdez            1.000      3.143
Felipe Maldonado          0.000      0.000
Luis Castro               0.750      2.250
Wayne Rios                0.200      0.800
William Salazar           0.857      2.571
Lawrence Reed             0.250      1.000
Jason Fleming             0.250      0.500
Stuart Wood               0.667      1.667
Martin Hines              0.571      1.857
**********************************************
Game: 9                   
Visitor: 1
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Otis Martin               0.250      1.000
Ignacio Carroll           0.000      0.000
Seth Ballard              0.000      0.000
Ellis Lamb                0.500      1.500
Theodore Bates            0.800      3.200
Cesar Santos              1.000      3.000
Rene Harrison             0.000      0.000
Salvatore Reynolds        0.000      0.000
Omar Andrews              0.429      1.714
**********************************************
Game: 8                   
Visitor: 2
Home: 8
----------------------------------------------
Name                    Bat Avg   Slugging
Stuart Wood               0.250      0.500
Stephen Tate              1.000      3.000
Alonzo Parker             0.250      0.250
Salvador Howard           0.750      2.750
Damon Lucas               1.000      1.429
Rodolfo Gonzales          1.000      1.000
Luke Webb                 0.167      0.167
Hugh Matthews             0.000      0.000
Tony Shelton              0.500      0.500
**********************************************
Game: 3                   
Visitor: 0
Home: 5
----------------------------------------------
Name                    Bat Avg   Slugging
Rafael Jordan             0.833      3.333
Wayne Rios                0.600      1.800
Zachary Garner            0.500      0.500
Boyd Pittman              1.000      2.000
Cody Garrett              1.000      2.500
Guillermo Higgins         1.000      1.000
Garry Bailey              0.333      0.500
Rodolfo Gonzales          1.000      1.600
Eddie Olson               0.667      1.333
**********************************************
Game: 2                   
Visitor: 0
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Clifton Jenkins           0.857      1.714
Marty Murphy              1.000      2.600
Edgar Pierce              1.000      1.600
Stuart Wood               0.500      1.500
Cody Garrett              1.000      1.571
Louis Luna                1.000      2.000
Mack Gibson               0.250      0.250
Tommy Lowe                1.000      1.500
Jason Fleming             0.000      0.000
**********************************************
Game: 0                   
Visitor: 0
Home: 6
----------------------------------------------
Name                    Bat Avg   Slugging
Otis Martin               1.000      3.333
Leroy Cole                0.600      1.800
Luther Patrick            0.000      0.000
Rene Harrison             0.750      2.000
Salvador Howard           0.833      2.667
Garry Bailey              1.000      1.000
Gerard Hall               1.000      1.000
Jeffery Ramsey            0.167      0.333
Damon Lucas               0.600      2.400
**********************************************
Game: 1                   
Visitor: 9
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Stuart Wood               0.000      0.000
Wilfred Ingram            0.500      2.000
Willard Harvey            0.000      0.000
Neal Vaughn               0.857      2.857
Andres Keller             0.667      1.000
Levi Cobb                 0.250      0.250
Courtney Graves           1.000      1.833
John Diaz                 0.000      0.000
Wilbur Collins            0.429      0.429
**********************************************
Game: 5                   
Visitor: 0
Home: 5
----------------------------------------------
Name                    Bat Avg   Slugging
Courtney Graves           0.571      1.714
Omar Andrews              0.000      0.000
Kirk Dunn                 0.333      0.667
John Diaz                 1.000      1.143
Eddie Olson               0.000      0.000
Stanley Roberts           0.600      0.600
Felipe Maldonado          1.000      1.000
Damon Lucas               0.400      0.800
Stephen Tate              0.857      1.000
**********************************************
Game: 4                   
Visitor: 2
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Damon Lucas               0.571      2.286
Clyde Farmer              0.857      2.571
Eddie Olson               0.000      0.000
Willis Ross               1.000      1.750
Gregory Leonard           0.833      1.333
Cornelius Nguyen          0.000      0.000
Salvador Howard           1.000      1.667
Ricky Garcia              0.750      1.750
Edgar Pierce              0.250      0.750
**********************************************
Game: 6                   
Visitor: 7
Home: 2
----------------------------------------------
Name                    Bat Avg   Slugging
Duane Carpenter           1.000      1.000
Stuart Wood               0.857      2.571
Jermaine Carson           0.833      1.667
Jeffery Ramsey            0.000      0.000
Marty Murphy              1.000      2.500
Toby Zimmerman            1.000      1.571
Glen Baldwin              1.000      1.167
Kirk Dunn                 1.000      1.000
Wilbert Armstrong         1.000      3.200
**********************************************
Game: 7                   
Visitor: 0
Home: 2
----------------------------------------------
Name                    Bat Avg   Slugging
Andres Keller             0.143      0.429
Duane Carpenter           0.250      1.000
Willis Ross               0.143      0.143
Glen Baldwin              0.750      0.750
Micheal Gill              0.167      0.667
Travis Lee                1.000      2.000
Mack Gibson               1.000      2.000
Willard Harvey            0.750      3.000
Alonzo Parker             1.000      2.000
**********************************************
Game: 18                  
Visitor: 0
Home: 0
----------------------------------------------
Name                    Bat Avg   Slugging
Louis Luna                1.000      3.750
Scott Morales             1.000      3.000
Tommy Lowe                1.000      1.500
Martin Hines              1.000      1.667
Glen Baldwin              0.333      1.333
Jeffery Ramsey            0.750      0.750
Ellis Lamb                1.000      1.750
Luis Castro               0.000      0.000
Noah Long                 0.714      1.571
**********************************************
Game: 19                  
Visitor: 9
Home: 3
----------------------------------------------
Name                    Bat Avg   Slugging
Winston James             0.400      1.200
Nicolas Rivera            0.333      1.333
Clyde Farmer              0.000      0.000
Sheldon Jacobs            1.000      4.000
Rene Harrison             0.800      3.000
Hugh Matthews             0.429      0.857
Marc Graham               0.400      1.200
Cesar Santos              0.000      0.000
Willis Ross               1.000      2.000
```
