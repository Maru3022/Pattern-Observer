import java.util.ArrayList;
import java.util.List;

// JavaDeveloperJobSite - конкретный наблюдаемый объект (издатель), который хранит список вакансий и уведомляет подписчиков
public class JavaDeveloperJobSite implements Observed {

    List<String> vacancies = new ArrayList<>(); // Список вакансий
    List<Observer> subscribers = new ArrayList<>(); // Список подписчиков (наблюдателей)

    // Добавляет список новых вакансий и уведомляет подписчиков об изменениях.
    public void addVacancies(List<String> newVacancies) {
        this.vacancies.addAll(newVacancies); // Добавляем новые вакансии к существующему списку
        notifyObserver(); // Уведомляем подписчиков об изменениях
    }

    // Добавляет одну вакансию в список.
    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        // УБИРАЕМ автоматическое уведомление здесь!
        // notifyObserver(); // ← эту строку нужно закомментировать или удалить
    }

    // Удаляет вакансию из списка.
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        // notifyObserver(); // ← и здесь тоже
    }

    //  Уведомляет всех подписчиков об изменении в списке вакансий.
    public void notifySubscribers() {
        notifyObserver();
    }

    // Добавляет наблюдателя (подписчика) в список подписчиков.
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    // Удаляет наблюдателя (подписчика) из списка подписчиков.
    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    // Уведомляет всех наблюдателей (подписчиков) об изменениях в списке вакансий.
    @Override
    public void notifyObserver() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies); // Вызывает метод handleEvent у каждого подписчика
        }
    }
}
