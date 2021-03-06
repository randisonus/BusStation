# BusStation
Information retrieval system to work with the ticket office of the bus station. The system includes:
Bus routes table: flight number, departure time, number of vacant seats. Route table: flight number (selected from the flights table), stopping point (selected from the directory; the selected value must be checked for duplication, i.e. for the same flight, the stopping point cannot be specified twice),
travel time in minutes (real number) to the given stop from the previous stop, serial number (1 - the place of the first stop, 2 - the place of the second stop, ..., n - the final destination of the route; automatically generated by the system when choosing a flight).
System functions:

1) when choosing an entry in the table of flights for a given flight, its route should be displayed with an indication of the total duration of movement and the number of intermediate stops;

2) displaying a list of flights with which you can get to a given point, sorted in ascending order of departure time;
the list includes only those flights, the departure time of which is later than the current time and for which there are free seats; implement it as a filter for the flights table;

3) displaying a list of flights sorted at the user's choice by the total duration of the movement or the number of intermediate stops;
4) export of flight data with indication of their routes.
