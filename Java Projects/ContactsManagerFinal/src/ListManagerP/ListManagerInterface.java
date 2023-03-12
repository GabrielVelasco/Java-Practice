package ListManagerP;

public interface ListManagerInterface {
    public void addElement(String key, Object elem) throws Exception;
    public void removeElement(String phoneNumber) throws Exception;
    public Object getElement(String phoneNumber) throws Exception;
    public int getListSize();
    public Object[] union(ListManager list1, ListManager lsit2);
    public Object[] intersec(ListManager list1, ListManager lsit2);

}
