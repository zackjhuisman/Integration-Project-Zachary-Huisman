import java.util.*;

public class randomRange {
    private final List<Integer> range = new ArrayList<>();

    randomRange(int min, int max) {
        addRange(min, max);
    }

    final void addRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
    }

    int getRandom() {
        return range.get(new Random().nextInt(range.size()));
    }
}