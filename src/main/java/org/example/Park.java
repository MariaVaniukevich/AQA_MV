package org.example;

//Создать класс Park с внутренним классом, с помощью объектов которого
// можно хранить информацию об аттракционах, времени их работы и стоимости.
public class Park {
    public class Attraction {
        private String nameAttraction;
        private String time;
        private int price;

        public Attraction(String nameAttraction, String time, int price) {
            this.nameAttraction = nameAttraction;
            this.time = time;
            this.price = price;
        }
    }
}
