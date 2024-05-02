package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едет по маршруту");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Максимальная вместимость: " + count + " человек");

    }

    @Override
    public double fill(double fillAmount) {
        return fillAmount;
    }
}
