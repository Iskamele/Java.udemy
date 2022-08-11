package aegis.java.basic.section99_test.Dijkstra;

import java.util.*;

import static java.lang.Integer.min;
import static java.util.Arrays.fill;

public class Task_2 {
    static int INF = 200000; // бесконечность
    static int[][] graph; //матрица смежности
    static ArrayList<String> cities = new ArrayList<>();
    static int vNum; // количество вершин
    static int s; // the number of tests

    public static int getCount(String question, int limit) { // TODO функция. прикинь, лал
        System.out.println(question);
        int value = new Scanner(System.in).nextInt();

        if (value > limit) {
            throw new java.lang.Error("Ты приёмный");
        }

        // TODO валидация
        return value;// количество вершин
    }

    public static String nameCity() {
        System.out.println("Имя города: ");
        // TODO валидация
        return (new Scanner(System.in).nextLine()); // имя города
    }

    public static int[] connection_cost() {
        System.out.println("Индекс города и стоимость: ");
        String test = new Scanner(System.in).nextLine(); // сплит - разбиение массива на части


        String[] words = test.split(" ");
        // TODO валидация
        int[] test2 = {Integer.parseInt(words[0]), Integer.parseInt(words[1])};
        return test2;
    }

    public static String taskCityName() {
        System.out.println("Откуда куда: ");
        String name = new Scanner(System.in).nextLine();
        //TODO валидация
        return name;
    }


    public static void main(String[] args) {
        s = getCount("Количество тестов ", 10);

        for (int t = 0; t < s; t++) {
            vNum = getCount("Кол-во городов: ", 10000);
            HashMap<String, Integer> map = new HashMap<>();
            graph = new int[vNum][vNum];

            for (int i = 0; i < vNum; i++) {
                fill(graph[i], INF); // элегантное заполнение массива
            }

            for (int indexCity = 0; indexCity < vNum; indexCity++) {
                map.put(nameCity(), indexCity);
                int neighbor = getCount("Его количество соседей: ", vNum);

                for (int neighborIterator = 0; neighborIterator < neighbor; neighborIterator++) {
                    int[] link = connection_cost(); // 1 10
                    graph[indexCity][link[0] - 1] = link[1];
                }
            }

            int taskCount = getCount("Количество искомых городов: ", 100);

            String[] TASKS = new String[taskCount];

            for (int i = 0; i < taskCount; i++) {
                TASKS[i] = taskCityName();
            }

            // начинаем решение

            for (int i = 0; i < taskCount; i++) {
                String[] words = TASKS[i].split(" ");
                dijkstra(map.get(words[0]), map.get(words[1]));
            }
        }
        //map.forEach((key, value) -> System.out.println(key + 1 + ": " + value));
    }

    static void dijkstra(int start, int finish) {
        boolean[] used = new boolean[vNum]; // массив пометок
        int[] dist = new int[vNum]; // массив расстояния. dist[v] = минимальное_расстояние(start, v)

        fill(dist, INF); // устанавливаем расстояние до всех вершин INF
        dist[start] = 0; // для начальной вершины положим 0

        for (; ; ) {
            int v = -1;
            for (int nv = 0; nv < vNum; nv++) // перебираем вершины
                if (!used[nv] && dist[nv] < INF && (v == -1 || dist[v] > dist[nv])) // выбираем самую близкую непомеченную вершину
                    v = nv;
            if (v == -1) break; // ближайшая вершина не найдена
            used[v] = true; // помечаем ее
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && graph[v][nv] < INF) // для всех непомеченных смежных
                    dist[nv] = min(dist[nv], dist[v] + graph[v][nv]); // улучшаем оценку расстояния (релаксация)
        }
        System.out.println(dist[finish]);
        System.out.println();
    }
}
