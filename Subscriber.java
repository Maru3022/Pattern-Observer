import java.util.List;

// Subscriber - конкретный наблюдатель, который получает уведомления об изменениях вакансий
public class Subscriber implements Observer {

    String name; // Имя подписчика

    // Конструктор для создания подписчика с указанным именем
    public Subscriber(String name){
        this.name = name;
    }

    // Метод, вызываемый при получении уведомления об изменениях в списке вакансий
    @Override
    public void handleEvent(List<String> vacancies){
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n========================================================================\n");
    }
}
