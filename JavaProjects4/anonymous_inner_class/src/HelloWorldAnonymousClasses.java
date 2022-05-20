public class HelloWorldAnonymousClasses {

    public static void main(String[] args) {
        HelloWorldAnonymousClasses classObject = new HelloWorldAnonymousClasses();
        classObject.sayHello();
    }
    public void sayHello(){


        class EnglishGreeting implements HelloWorld{

            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();


        HelloWorld frenchGreeting = new HelloWorld() {

            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };


        englishGreeting.greet();
        englishGreeting.greetSomeone("Jack");

        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Juliette");

        spanishGreeting.greet();
        spanishGreeting.greetSomeone("Isabella");


    }
}