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

                  
                     Start App 
                         |
                         |
                         v
                 Display MainActivity 
             
       |                                    |
       v                                    v
                         
 Listen                                Listen for
  for   +----------(Calculate)------>    Back     
  User                                 Button   
  Input                            
                                            |
    |                                       |
    v                                       |
                  
 If "Calculate" Button 
     is Clicked        
    |
    |
    v

Retrieve temperature values entered by user

    |                  |
    v                  v
            +-------+-----------------+
Calculate average                  Open DetailScreen     
minimum and maximum +------------>+activity              
temperatures                    
                                         |              |
    |                                    |              |
    v                                    v              |
                                                        |
 Display calculated average temperatures                |
                                                        |
                                    |                   |
                                    v                   |
                             +------+---------+         |
                              Pass temperature          |
                              values to                 |
                              DetailScreen              |
                              activity                  |
                                                        |
                                    |                   |
                                    v                   |
                                                        |
                          User returns to   ---------->
                          MainActivity      
                                    |
                                    |
                                    v
                            Close DetailScreen   



![unitTestErrors](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/b3d22f4d-81b7-4961-8bc8-6d49eda25113)
![UnitTest1](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/23fcfea7-daa0-41e2-9340-3f6bba9ffce4)
![UnitTest2](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/e1eef34f-e905-4629-a4f3-50370304a6a9)
![UnitTest3](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/5bee8f6a-0e25-4399-ad71-37e6b98e2046)
![UnitTest4](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/51289eaa-9c6b-4658-9bb1-44b495edd16b)
![UnitTest5](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/15ab46ac-4d68-49b1-a455-4a36a3f061dc)
![UnitTest6](https://github.com/Christiaan-Lpt/ST10440964_Practicum/assets/164025506/df9c0776-dd78-4f6c-8381-5cffdc04a7e9)







