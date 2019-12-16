public class HumanService {
    public Human smallest(Human[] humans){
        Human smallest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (smallest.year< humans[i].year){
                smallest = humans[i];
            }
        }
        return smallest;
    }
}
