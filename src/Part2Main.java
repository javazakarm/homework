public class Part2Main extends HumanService{
    //1. parameter stanal 2 int veradarcnel dranc gumary
    public static int sumIntNumbers(int num1,int num2){
        return num1 + num2;
    }
    //2. parameter stanal 2 double veradarcnel dranc artadryaly
    public static double multipleDoubles(double num1, double num2){
        return num1 * num2;
    }
    //3. parameter stanal 2 float tpel "Yes" ete arajiny mec e 2rdic ev "No" hakarak depkum
    public static String floatDifference(float num1, float num2){
        if (num1>num2){
            return "Yes";
        }
        return "NO";
    }
    //4. parameter stanal 3 hat long u tpel dranicic amenamecy
    public static long longDifference(long long1,long long2,long long3){
        return long1>long2?long1> long3?long1:long3:long2>long3?long2:long3;
    }
    //5. parameter stanal Human tipi obecjt u tpel "Yes" ete txa e ev "No" hakarak depkum
    public static String checkingGender(Human human){
        return (human.gender == 'm')?"yes":"no";

    }
    //6. parametet stanal 3 hat Human object u veradarcnel amenameci azganuny
    public String oldHumanLastName(Human h1, Human h2, Human h3){
        return   super.smallest(new Human[]{h1,h3,h2}).lastName;
    }
    //7. parameter stanal 2 hat Human object u tpel dranc anunnery irar koxk
    public static String twoHumanNames(Human h1,Human h2){
        return h1.firstName + " " + h2.firstName;
    }
    //8. parameter stanal mi hat boolean popoxakan ev mi hat Human, tpel human i anuny ete boolean popoxakany true e, isk ete false e tpel azganuny
    public static String nameOrLastName(boolean b,Human human){
        if (b){
            return human.firstName;
        }
        return human.lastName;
    }
    //9. parameter stanal int eri zangvac, veradarcnel zangvaci maximal elementy
    public static int maxInt(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                     max = arr[i];
                }
        }
        return max;
    }
    //10. parameter stanal float eri zangvac veradarcnel zangvaci minimal elementi INDEX-y
    public static int minElementIndex(float [] arr ){
        float min = arr[0];
        int minIndex =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        Human h1 = new Human("Darbinyan","Aram",1995);
        Human h2 = new Human("Smith","Pier",1989);
        Human h3 = new Human("Livingston","Johnathan",1998);
        HumanService service = new HumanService();
        Part2Main part2Main = new Part2Main();
        System.out.println(sumIntNumbers(4,5));
        System.out.println(multipleDoubles(5.0,6.4));
        System.out.println(floatDifference(4.6f,6.8f));
        System.out.println(longDifference(12,87,24));
        System.out.println(checkingGender(h1));
        System.out.println(part2Main.oldHumanLastName(h1,h2,h3));
        System.out.println(twoHumanNames(h1,h2));
        System.out.println(nameOrLastName(false,h2));
        System.out.println(maxInt(new int[]{4,6,50,31,-20,8,10}));
        System.out.println(minElementIndex(new float[]{4.0f,30f,-20.5f,-80.6f,-30.3f}));
        System.out.println(new Human[]{h1,h2,h3});
        }
}
