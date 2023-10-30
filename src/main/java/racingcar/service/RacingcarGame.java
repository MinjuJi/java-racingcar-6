package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;

public class RacingcarGame {
    private static final int COUNT_ONE = 1;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_NINE = 9;

    public List<String> findMaxMoveForwardCount(List<Car> cars) {
        List<String> winner = new ArrayList<>();
        int max = 0;
        for (Car car : cars) {
            if (car.getMoveForwardCount() > max) {
                max = car.getMoveForwardCount();
            }
        }
        for (Car car : cars) {
            if (car.getMoveForwardCount() == max) {
                winner.add(car.getCarName());
            }
        }
        return winner;
    }

    public void increaseMoveForwardCount(Car car) {
        if (isGreaterThanOrEqualFour()) {
            car.setMoveForwardCount(COUNT_ONE);
        }
    }

    public boolean isGreaterThanOrEqualFour() {
        return generateRandomNumber() >= NUMBER_FOUR;
    }

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(NUMBER_ZERO, NUMBER_NINE);
    }
}
