BEGIN
  SET week to 'mon'
  SWITCH(week)THEN
  START SWITCH
     CASE 'mon':
         PRINT"1st day"
         BREAK
     CASE 'tues':
         PRINT "2nd day"
         BREAK
    CASE 'wend':
         PRINT"3rd day"
         BREAK
    CASE 'thurs:
         PRINT"4th day"
         BREAK
    CASE 'friday':
         PRINT"5th day"
         BREAK
    CASE 'sat':
         PRINT"6th day"
         BREAK
   CASE'sun'
        print'7th day"
        BREAK
   DEFAULT
       PRINT "given day name is invalid"
  END SWITCH
END
