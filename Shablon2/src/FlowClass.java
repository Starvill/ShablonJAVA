import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FlowClass {

    public static<T> Stream<T> addToBeg(Stream<T> stream, T element) {
        return Stream.concat(Stream.of(element), stream);
    }

    public static void main(String... args) {
        List<P> input = new ArrayList<>();
        input.add(new P("Ivan Ivanov", 2003, 72));
        input.add(new P("Sasha Ivanov", 1997, 54));
        input.add(new P("Grigory Melnick", 1954, 103));
        input.add(new P("Petr Michalich", 1948, 89));
        input.add(new P("Igor Sidorov", 1962, 45));
        input.add(new P("George Sidorov", 1862, 72));
        Stream<P> stream = Stream.of();
        for(int i = 0; i< 5; i++)
        {
            stream = addToBeg(stream, input.get(i));
        }
        stream.filter(P -> P.weight > 60)
                .sorted(Comparator.comparingInt(P -> P.birthDate))
                .forEach(P -> P.printFio());
    }


}
