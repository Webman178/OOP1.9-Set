package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> q;

    public ServiceStation() {
        q = new LinkedList<>();
    }

    public void addToQ(T transport) {
        if (transport != null && transport.isNeedDiagnostic()) {
            boolean success = q.offer(transport);
            if (success) {
                System.out.println(transport.getBrand() + " " + transport.getModel() + " добавлен на тех.обслуживание");
            }
        } else {
            System.out.println("Транспорт равен null или это автобус");
        }
    }

    public void makeDiagnostic() {
        T transport = q.poll();
        if (transport == null) {
            System.out.println("Очереди нет");
        } else {
            System.out.println(transport.getBrand() + " " + transport.getModel() + " прошел техническое обслуживание");
        }
    }

    @Override
    public String toString() {
        if (q.peek() == null) {
            return "Очереди нет";
        } else {
            String total = "";
            for (T transport: q) {
                total += "{"+transport.getBrand() + " " + transport.getModel() + "} ";
            }
            return total;
        }
    }

}

