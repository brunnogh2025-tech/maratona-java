package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final String name;

    private final Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }
    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }
}
