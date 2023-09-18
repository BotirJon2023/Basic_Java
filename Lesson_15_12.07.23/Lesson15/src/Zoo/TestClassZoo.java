package Zoo;

public class TestClassZoo {

    public void main(String[] args) {

        Zoo zoo1 = new Zoo();
        zoo1.open();

        Zoo.Monkey monkey = new Zoo.Monkey()

    }
    class Zoo {
        int count;

private String phone;
        void open() {
            System.out.println("Открыт с 09.00 до 18.00 часов" +(new Monkey()).name);


        }

        class Monkey {
            String name;
            void runFood() {
                System.out.println("Обезьяны есть и улыбается одна из десятков" +count+ "Call by phone" + phone);


            }

            class Bananas {
                String sort = "Yellow";
                String getSort(){
                    return sort;
                }
                void getInfo() {
                    System.out.println(sort +"есть обезьяна по имени "+ name + " из количества животных" );
                }

                static class InClassStatic {
                    static int stInt = 25;

                    void stMethod() {


                    }

                }

            }

        }


    }

}
