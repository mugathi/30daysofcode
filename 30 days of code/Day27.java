    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            int[] data=new int[2];
            data[0]=1;
            data[1]=2;
            return data;
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            int[] data=new int[2];
            data[0]=1;
            data[1]=1;
            return data;
        }

        public static int get_expected_result() {
            return 0;
        }
    }