 Start

 Display the main screen layout with input fields for each day's minimum and maximum temperatures.

 Listen for user input:
     When the user clicks the "Calculate Average" button:
        Retrieve the temperature values entered by the user for each day.
        Calculate the average minimum and maximum temperatures for the week.
        Display the calculated averages.
    
      When the user clicks the "View Details" button:
         Open the DetailScreen activity.
         Pass the entered temperature values to the DetailScreen activity.
        
Listen for the user to go back:
    When the user presses the back button:
        Close the DetailScreen activity and return to the MainActivity.

 End


Flowchart:

                   +-----------+
                   | Start App |
                   +-----+-----+
                         |
                         v
               +---------+---------+
               | Display MainActivity |
               +----+----------+-----+
                    |          |
                    |          |
       +------------+          +------------+
       |                                    |
       v                                    v
+------+-+                            +-----+-------+
| Listen |                            | Listen for |
|  for   +----------(Calculate)------>+   Back     |
|  User  |                            |   Button   |
|  Input |                            +-----+-------+
+---+----+                                  |
    |                                       |
    v                                       |
+---+--------------------+                  |
| If "Calculate" Button +------------------->+
|     is Clicked        |
+---+--------------------+
    |
    |
    v
+---+------------------------------------------+
| Retrieve temperature values entered by user |
+---+------------------+-----------------------+
    |                  |
    v                  v
+---+------------------+-+             +-------+-----------------+
| Calculate average    |             | Open DetailScreen     |
| minimum and maximum +------------>+ activity              |
| temperatures         |             +----+--------------+-----+
+---+------------------+                  |              |
    |                                    |              |
    v                                    v              |
+---+-----------------------------------+--+             |
| Display calculated average temperatures |             |
+-----------------------------------+------+             |
                                    |                    |
                                    v                    |
                             +------+---------+          |
                             | Pass temperature|          |
                             | values to       |          |
                             | DetailScreen    |          |
                             | activity         |          |
                             +------+---------+          |
                                    |                    |
                                    v                    |
                         +----------+---------+          |
                         | User returns to   +---------->+
                         | MainActivity      |
                         +----------+---------+
                                    |
                                    v
                           +--------+--------+
                           | Close DetailScreen |
                           +-------------------+




