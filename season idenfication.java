BEGIN 
   SET m to 1
   SWITCH(m)THEN
   START SWITCH
       CASE 3:
       CASE 4:
       CASE 5:
       CASE 6:
           PRINT"SEASON IS SUMMER"
           BREAK
      CASE 7:
      CASE 8:
      CASE 9:
      CASE 10:
           PRINT"SEASON IS RAINY"
           BREAK 
       CASE 11:
       CASE 12:
       CASE 1:
       CASE 2:
           PRINT"SEASON IS WINTER"
           BREAK 
      DEFAULT
          PRINT "GIVEN MONTH NUM IS INVALID"
     END SWITCH
END   
