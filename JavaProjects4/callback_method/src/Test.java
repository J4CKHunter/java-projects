public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        ClickHandler clickHandler = new ClickHandler();
        button.onClick(clickHandler);

        Button button2 = new Button();
        button2.onClick(new ClickEventHandler() {
            @Override
            public void handleClick() {
                System.out.println("Button clicked anonymous");
            }
        });
    }
}
