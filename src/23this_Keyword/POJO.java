public class POJO {
    String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public static void main(String[] args){
        POJO pojo = new POJO();
        pojo.setName("Toshiba");
        System.out.println("pojo.name: "+pojo.getName());
    }
}
