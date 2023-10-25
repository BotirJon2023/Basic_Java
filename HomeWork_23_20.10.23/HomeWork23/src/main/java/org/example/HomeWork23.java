package org.example;

import java.util.List;

public class HomeWork23 {

    public class Cat {
        private String name;
        private boolean isHungry;

        public Cat(String name, boolean hungry) {
            this.name = name;
            this.isHungry = hungry;
        }

        public void setHungry(boolean hungry) {
            this.isHungry = hungry;
        }

        public boolean isHungry() {
            return isHungry;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", hungry=" + isHungry +
                    '}';
        }
    }
}
