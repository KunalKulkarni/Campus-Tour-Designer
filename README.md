## To clean:
ant -buildfile campusTour/src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile campusTour/src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 

ant -buildfile campusTour/src/build.xml run 

-----------------------------------------------------------------------

## To generate javadocs 

ant -buildfile campusTour/src/build.xml doc 

-----------------------------------------------------------------------

Implementation of Builder Pattern:

An OrientationBuilder Pattern implements all the functions of the student orientation program. Basically, this class creates and combines all objects of all activities and compiles them to create the entire orientation plan. The OrientationWorkshop is used to implement this blue-print of the Orientation using the createOrientation() method. The Orientation Builder accepts Enums in the following manner/order:-
OrientationBuilder(Mode of transport for Building 1,Mode of transport for Building 1, Cafeteria , Gift Location , Lecture type)
Interfaces have been created for different activities as further extensions would be easier.


-----------------------------------------------------------------------
