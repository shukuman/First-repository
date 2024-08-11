package Interface;

public abstract class Example implements Drawable, Eatable {
    private String title;
    // метод eat реализуется
    @Override
    public void eat() {
        System.out.println("Кушаем");
    }
    //метод draw не реализуется, но наследуется
}
