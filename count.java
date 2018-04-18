public static int getSize(long number) {
        int count = 0;
        while (number > 0) {
            count += 1;
            number = (number / 10);
        }
        return count;
    }
