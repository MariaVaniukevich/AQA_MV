package org.example.lesson9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class StudentList {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        double averageAge = students.stream()
                .filter(student -> student.getGender() == Gender.MAN) // Фильтрация по полу
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Средний возраст студентов мужского пола: " + averageAge);

        System.out.println("Студенты, которым грозит получение повестки:");

        int currentYear = 2023; // Текущий год
        int conscriptionAgeMin = 18; // Минимальный возраст для призыва
        int conscriptionAgeMax = 27; // Максимальный возраст для призыва

        students.stream()
                .filter(student -> student.getGender() == Gender.MAN) // Фильтрация по полу
                .filter(student -> student.getAge() >= conscriptionAgeMin && student.getAge() <= conscriptionAgeMax)
                .forEach(student -> {
                    int yearOfBirth = currentYear - student.getAge();
                    System.out.println(student.getName() + ", год рождения: " + yearOfBirth);
                });
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
