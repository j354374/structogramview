#initialize application
# sdfsdf
#sfsd#s f ##fs 
IF: everything OK?
  play some tone
ELSE:
  output error message
ENDIF:
FOR: from 1 to 10
  add counter to sum
  SELECT: index
  CASE: 1
    print "first"
  CASE: 5
    print "center"
  CASE: 10
    print "last"
  DEFAULT:
    print index
  ENDSELECT:
  
ENDFOR:

print current sum

LOOP: 
  IF: current sum is odd
    add 1 to sum
  ENDIF:
  devide sum by 2
ENDLOOP:: sum &lt; 10
RETURN:calculated result
