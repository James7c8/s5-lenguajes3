package src.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccionHandler {

    private AccionHandler() {}

    private static final List<Accion> listaDeAcciones =
            List.of(new AccionCrear(),
                    new AccionLeer(),
                    new AccionActualizar(),
                    new AccionBuscar(),
                    new AccionEliminar());

    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : listaDeAcciones) {
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }

//    // TODO: INVESTIGATE FINAL in this case. Change the reference once and that's it?
//    private static final Map<Integer, Accion> strategy =
//            List.of(new AccionCrear(),
//                    new AccionLeer(),
//                    new AccionActualizar(),
//                    new AccionEliminar())
//            .stream()
//            .collect(Collectors.toMap(Accion::getOpcion, Function.identity()));

//    public static Map<Integer, Accion> getStrategy() {
//        return strategy;
//    }
}
