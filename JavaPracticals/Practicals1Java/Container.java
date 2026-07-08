package JavaPracticals.Practicals1Java;

public interface Container<T> {

    

    public void addAnItem(T item);
    public void rmItem(int index);
    public void retItem(int idx);
}