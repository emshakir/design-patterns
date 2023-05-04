package com.mycompany.designpatterns.optional;

import com.mycompany.designpatterns.optional.dto.Car;
import com.mycompany.designpatterns.optional.dto.Insurance;
import com.mycompany.designpatterns.optional.dto.Person;
import java.util.Optional;
import java.util.Properties;

public class OptionalDesignPatterns {

    public static void main(String[] args) {
        System.out.println(getName());
    }

    private static int readDuration(String s) {
        Properties properties = getProperties();
        return Optional.ofNullable(properties.get(s))
                .flatMap(e -> stringToInt(s))
                .filter(e -> e > 0)
                .orElse(0);
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("a", "5");
        properties.setProperty("a", "true");
        properties.setProperty("a", "-1");
        return properties;
    }

    private static Optional<Integer> stringToInt(String value) {
        try {
            return Optional.of(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person
                .filter(p -> p.getAge() >= minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UNKNOWN!!");
    }

    public static void withFilter(String insuranceName) {
        Optional<Insurance> optInsurance = Optional.ofNullable(new Insurance());
        optInsurance
                .filter(insurance -> insuranceName
                .equalsIgnoreCase(insurance.getName()))
                .ifPresent(status -> System.out.println("OK!!"));

    }

    public static Optional<Insurance> nullSafeFindCheapestInsurance(
            Optional<Person> person,
            Optional<Car> car) {
        return person.flatMap(p -> car.map(c -> findCheapestInsuarance(p, c)));
    }

    private static Insurance findCheapestInsuarance(Person person, Car car) {
        return new Insurance();
    }

    public static void withFlatMap(Person person) {
        // below syntax is not possible because it will wrap Optional<Optional<Car>>,
        // which will have compile time exception
        //person.getCar().getInsuarance().getName();

        Optional<Person> personOpt = Optional.ofNullable(new Person());
        personOpt.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UNKNOWN");

    }

    public static void withMap() {
        Optional<Insurance> insuaranceOpt = Optional.ofNullable(new Insurance());
        Optional<String> insuaranceName = insuaranceOpt.map(Insurance::getName);
    }

    private static void createInstance() {
        Optional<Car> emptyOpt = Optional.empty();

        // if car ref is null it will throw null pointer exception
        Optional<Car> carOpt = Optional.of(new Car());

        // even if it is null it won't throw any exception
        Optional<Car> _carOpt = Optional.ofNullable(new Car());
    }

    private static Optional<String> getName() {
        if (Math.random() > 0.5) {
            return Optional.of("JOE");
        }
        return Optional.empty();
    }
}
