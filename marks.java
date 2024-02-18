BEGIN 
   SET marks to 88
   IF marks is less than or equal to  26 THEN
   START IF
      PRINT "failed in the test"
   END IF
   ELSE IF marks greter or equal to 27 and marks is less than or equal to 50 THEN
   START ELSE IF
       PRINT "you got B grade in the test"
    END ELSE IF
   ELSE IF marks is greater than or equal to 51 and marks is less tha or equal to 75 THEN
   START ELSE IF
      PRINT"you got A grade in the test"
   END ELSE IF
   ELSE IF marks is graeter than or equal to 76 and marks is less than ir equal to 100 THEN
   START ELSE IF
       PRINT"you got o grade in the test"
   END ELSE IF
   ELSE
   START ELSE 
       PRINT"marks are invalid"
   END ELSE
END
