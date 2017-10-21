package ameedf.jb8223.assignments;

/**
 * INTRODUCTION:
 * Take a look at this number which is composed from 4 digits
 * +----+----+----+----+
 * | x1 | x2 | x3 | x4 |
 * +----+----+----+----+
 * Performing a rotation means moving the last digit (x4) to be the first one:
 * +----+----+----+----+
 * | x4 | x1 | x2 | x3 |
 * +----+----+----+----+
 * For example, the result of performing a rotation on 269 is 926, because "6" is the last digit
 * and it will move to be the first digit, so we put it before the first digit (2).
 * The result of performing a rotation on 926 is 692.
 * Performing a rotation for the third time will get us back to the original number: 269.
 * Another example: if we take the number 1218:
 * Rotation 1: 8121 ("8" is now the first digit, and the other digits moved to the right by one place)
 * Rotation 2: 1812
 * Rotation 3: 2181
 * Rotation 4: 1218 -- back to the original number
 *
 * YOUR MISSION:
 * You will write a program that will ask the user for 2 numbers.
 * It will then check if we can perform several rotations to get from the first number to the second number.
 * Example #1: if the first number is 1439 and the second number is 3914, the program will print
 * 'The number 1439 can be rotated 2 time(s) to get the number 3914'.
 * Example #2: if the first number is 41412 and the second number is 14124, the program will print
 * 'The number 41412 can be rotated 4 time(s) to get the number 14124'.
 * Example #3: if the first number is 312 and the second number is 321, the program will print
 * 'We cannot get from 312 to 321 by performing any number of rotations'.
 *
 * 1. The only mathematical operations allowed are "/" and "%"
 * 2. You should use arrays
 * 3. The user can't insert 2 identical numbers as an input
 * 4. The range of the input is 0..1,000,000,000
 * 5. The program should input the lowest number of rotations that will get us from one number to the other.
 *     For example, you can get from 1212 to 2121 by performing 1 or 3 rotations. The program should print
 *    'The number 1212 can be rotated 1 time(s) to get the number 2121'.
 *
 * Good luck !
 */
public class RotationCheck {
    public static void main(String[] args) {
        // TODO: enter your code here :)
    }
}
