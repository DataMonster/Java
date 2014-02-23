/*Find number of pairs such that x^y > y^x
Given two arrays X[] and Y[] of positive integers, find number of pairs such that x^y > y^x where x is an element from X[] and y is an element from Y[].

Examples:

  Input: X[] = {2, 1, 6}, Y = {1, 5}
  Output: 3 
  // There are total 3 pairs where pow(x, y) is greater than pow(y, x)
  // Pairs are (2, 1), (2, 5) and (6, 1)


  Input: X[] = {10, 19, 18}, Y[] = {11, 15, 9};
  Output: 2
  // There are total 2 pairs where pow(x, y) is greater than pow(y, x)
  // Pairs are (10, 11) and (10, 15)
*/

//http://www.geeksforgeeks.org/find-number-pairs-xy-yx/

/*mathmatical analysis:
x^y = y^x
take natural log on both sides.
=> yln(x)=xln(y)
=> ln(x)/x = ln(y)/y

now differentiate ln(x)/x wrt x and compare it with zero.

=> d/dx(ln(x)/x) 
=> 1/x^2 - ln(x)/x^2
=> (1-ln(x))/x^2 

for all real x, x^2 >=0
therefore : (1-ln(x)) >=0 for x<=e (~ 2.71 )

1-ln(x) < 0 for x>e
So ln(x)/x is increasing in range <=e, i.e. for integers, its increasing for 1,2
and decreasing else where.

(1) x<3, y<3: x need > y
(2) x<3 (x =2): y > 4  because 2^3 < 3^2, 2^4 = 4^2, 2^5>5^2
(3) x>=3, y>=3: x need > y
(4) x>=3, y <3 (y=1): all
              (y=2): x need =3
*/
