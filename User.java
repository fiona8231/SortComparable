
public class User implements Comparable<User>
{
    private String name;
    private Integer order;
    public String getName(){ return name; }

    public void setName(String newName){
        this.name = newName;
    }
    public Integer getOrder(){ return order; }

    public void setOrder(Integer newOrder){
        this.order = newOrder;
    }



    @Override
    public int compareTo(User o) {
        return this.getOrder().compareTo(o.getOrder());
    }
}
