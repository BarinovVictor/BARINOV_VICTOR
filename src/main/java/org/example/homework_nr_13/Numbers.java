package org.example.homework_nr_13;

public class Numbers {

    public void divisionBy(int x) {
        if (x == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
    }

    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Invalid range !!!");
        }

        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }

}
