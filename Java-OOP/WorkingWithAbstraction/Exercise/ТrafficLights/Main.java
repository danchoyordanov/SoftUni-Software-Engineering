package ТrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialTrafficLightStates = scanner.nextLine().split("\\s+");
        int numberOfUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (int i = 0; i < initialTrafficLightStates.length; i++) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(initialTrafficLightStates[i]));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < numberOfUpdates; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
