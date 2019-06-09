public class Company2 {
    String domainName;

    public Company2(){
        this.domainName = "default";
    }

    public Company2(String domainName){
        this.domainName = domainName;
    }

    public void getName(){
        System.out.println(this.domainName);
    }

    public static void main(String[] args){
        Company2 defaultObj = new Company2();
        Company2 programzObj = new Company2("programz.com");

        defaultObj.getName();
        programzObj.getName();
    }

}
