package org.example;

import java.util.Objects;

    public abstract class Pet implements Playable {

        private String name;
        private int age;
        private boolean isHungry;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            org.example.Pet pet = (org.example.Pet) o;

            if (age != pet.age) return false;
            if (isHungry != pet.isHungry) return false;
            return Objects.equals(name, pet.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + (isHungry ? 1 : 0);
            return result;
        }

        public Pet() {
        }

        public Pet(String name, int age) {
            this.name = name;
            this.age = age;
            this.isHungry = true;
        }

        public void feed(){
            isHungry = false;
            System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }

        public abstract void sayHello();

        @Override
        public void play() {
            System.out.println("Pet " + name + " plays");
        }

        @Override
        public String toString() {
            return "Pet {" + "name='" + name + '\'' + '}';
        }
    }



}
