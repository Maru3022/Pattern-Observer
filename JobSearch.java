public class JobSearch {
    public static void main(String[] args) {
        // Создаем объект JavaDeveloperJobSite, который будет издателем вакансий
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        // Создаем двух подписчиков (наблюдателей)
        Observer firstSubscriber = new Subscriber("Maru");
        Observer secondSubscriber = new Subscriber("Evelone");

        // Добавляем подписчиков к издателю
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        // Добавляем вакансии
        jobSite.addVacancy("first Java position");
        jobSite.addVacancy("Second Java position");
        jobSite.addVacancy("Third Java position");

        // Уведомляем подписчиков об изменениях
        jobSite.notifySubscribers();
    }
}
