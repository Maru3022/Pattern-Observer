// Observed - интерфейс для объектов, которые могут быть наблюдаемыми (издатели).
public interface Observed {

    // Добавляет наблюдателя (подписчика).
    public void addObserver(Observer observer);

    // Удаляет наблюдателя (подписчика).
    public void removeObserver(Observer observer);

    // Уведомляет всех наблюдателей (подписчиков) об изменении.
    public void notifyObserver();
}
