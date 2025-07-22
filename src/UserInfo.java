public class UserInfo{
    //make them private so that use getter and setter methods to access them
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    //consturctor
    public UserInfo(String name,int age,String email,boolean isActive){
        this.name=name;
        this.age=age;
        this.email=email;
        this.isActive=isActive;
    }
    //setters and getters methods
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }


    public void setEmail(String email){
        this.email=UserInfo.this.email;
    }
    public String getEmail(){
        return email;
    }

    public void setActive(int isActive){
        this.isActive=UserInfo.this.isActive;
    }
    public boolean getActive(){
        return isActive;
    }

public void displalyInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Email: "+email);
    System.out.println("Is Active: "+isActive);
}
public static void main(String[] args) {
UserInfo u1=new UserInfo("Mazin",25,"mazin22@gmail.com",true);
UserInfo u2=new UserInfo("Ahmed",33,"ahmedk3@gmail.com",false);
UserInfo u3=new UserInfo("Majid",20,"majidrt55@gmail.com",true);
    System.out.println("User 1");
    u1.displalyInfo();
    System.out.println("User 2");
    u2.displalyInfo();
    System.out.println("User 3");
    u3.displalyInfo();

    u1.setName("Mazin Al-Sayed");
    System.out.println("Updated User 1 Name: " + u1.getName());
    System.out.println();
    u2.setEmail("ahmedalzedjaly@gmail.com");
    System.out.println("Updated User 2 email: "+u2.getEmail());
}
}
