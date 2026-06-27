You are given the lengths of three sides of a triangle. Your task is to determine the type of the triangle based on the lengths:
Equilateral Triangle: All three sides are equal
Isosceles Triangle: Exactly two sides are equal
Scalene Triangle: All three sides are different
Also, before checking the type, ensure the sides can actually form a valid triangle.
A valid triangle satisfies the triangle inequality:
a + b > c
b + c > a
c + a > b
If the sides do not form a valid triangle, print:
Not a valid triangle
Input Format

Three integers a, b, and c — lengths of the sides

Constraints

1 <= a, b, c <= 10^4

Output Format

Print one of the following messages:

Equilateral Triangle
Isosceles Triangle
Scalene Triangle
Not a valid triangle
Sample Input 0

5 5 5
Sample Output 0

Equilateral Triangle
Sample Input 1

1 2 3
Sample Output 1

Not a valid triangleYou are given the lengths of three sides of a triangle. Your task is to determine the type of the triangle based on the lengths:
Equilateral Triangle: All three sides are equal
Isosceles Triangle: Exactly two sides are equal
Scalene Triangle: All three sides are different
Also, before checking the type, ensure the sides can actually form a valid triangle.
A valid triangle satisfies the triangle inequality:
a + b > c
b + c > a
c + a > b
If the sides do not form a valid triangle, print:
Not a valid triangle
Input Format

Three integers a, b, and c — lengths of the sides

Constraints

1 <= a, b, c <= 10^4

Output Format

Print one of the following messages:

Equilateral Triangle
Isosceles Triangle
Scalene Triangle
Not a valid triangle
Sample Input 0

5 5 5
Sample Output 0

Equilateral Triangle
Sample Input 1

1 2 3
Sample Output 1

Not a valid triangle