import java.lang.reflect.Array;

public class Part1Main {
    public static void main(String[] args) {
        //1. Հայտարարել զանգված եւ տպել այն
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //2. Հայտարարել int -երի զանգված եւ լցնել 0-րով
        int[][] array = new int[5][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        //3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։
        int[] arr3 = new int[1000];
        for (int i = 0; i < arr3.length; i++) {
            System.out.print((arr3[i] = i + 1) + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //4. Հայտարարել byte-երի զանգված եւ լցնել [-30;30] միջակայքի զույգ թվերով։
        byte[] bytes = new byte[31];
        for (int i = 0, j = -30; i < bytes.length; i++, j += 2) {
            if (j == 0) {
                continue;
            }
            bytes[i] = (byte) j;
            System.out.print(bytes[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //5. Հայտարարել short-երի զանգված եւ լցնել [1;300] միջակայքի կենտ թվերով
        short[] shorts = new short[150];
        for (int i = 0, j = 1; i < shorts.length; i++, j += 2) {
            shorts[i] = (short) j;
            System.out.print(shorts[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։
        int[] arr5 = new int[31];
        for (int i = 0, j = 0; i < arr5.length; i++, j++) {
            arr5[i] = j;
            if (arr5[i] % 5 == 0) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
        //7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։
        double[] doubles = new double[]{10.2, 20.3, 14.8, 60.3, 51.2, 24.8};
        double num = 24.56;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > num) {
                System.out.print(doubles[i] + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
        //8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։
        float[] floats = new float[]{-130.2f, 60.3f, -24.8f, 0.3f, 11.2f, 33.8f};
        float inputNum1 = -34.655f;
        float inputNum2 = 35.56f;
        for (int i = 0; i < doubles.length; i++) {
            if (floats[i] > inputNum2 || floats[i] < inputNum1) {
                System.out.print(floats[i] + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------");
        //9. Հայտարարել double-երի զանգված եւ լցնել այն։Դասավորել ըստ աճման / նվազման կարգով։
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles.length - i - 1; j++) {
                if (doubles[j] > doubles[j + 1]) {
                    double temp = doubles[j];
                    doubles[j] = doubles[j + 1];
                    doubles[j + 1] = temp;
                }
            }
            System.out.print(doubles[i] + " ");
        }
        System.out.println();
        for (int k = 0; k < doubles.length; k++) {
            for (int j = k + 1; j < doubles.length; j++) {
                if (doubles[k] < doubles[j]) {
                    double temp = doubles[k];
                    doubles[k] = doubles[j];
                    doubles[j] = temp;
                }
            }
            System.out.print(doubles[k] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        //10. Հայտարարել String փոփոխական եւ տպել նրանում եղած 'a' տառերի քանակը։
        String s = "sbanana";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------------------------------------");
        //11. Հայտարարել String փոփոխական եւ տպել Yes եթե նրանում կա 'b' տառ եւ 'no' հակառակ դեպքում:
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                System.out.println("Yes");
                break;
            }
            else if(s.charAt(i) != 'b')continue;
            System.out.println("no");
        }
        System.out.println("------------------------------------");
        //12. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել 2-ի աստիճան հանդիսացող էլեմենտների քանակը։
        int [] ints = new int[]{2,4,6,8,14,16};
        int countTwoPowers = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < 32; j++) {
                if (ints[i] == Math.pow(2, j)) {
                    countTwoPowers++;
                }
            }
        }
        System.out.println(countTwoPowers);
        System.out.println("------------------------------------");
    }
}

