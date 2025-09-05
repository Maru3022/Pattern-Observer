import java.util.List;

// Observer - интерфейс для наблюдателей (подписчиков), которые получают уведомления об изменениях.
public interface Observer {

    // Метод, вызываемый при получении уведомления об изменении.  Параметр - список вакансий.
    void handleEvent(List<String> vacancies);
}
