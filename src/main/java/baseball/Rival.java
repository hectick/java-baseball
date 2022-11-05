package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Rival {
    private List<Integer> number;

    Rival(){
        createNumber();
    }

    private void createNumber(){
        number = new ArrayList<>();
        while(number.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if(!number.contains(randomNumber)){
                number.add(randomNumber);
            }
        }
    }

    public List<Integer> getNumber(){
        return number;
    }

}