package ContactsPkg;

//Nome,Idade,Sexo,Profissão,Telefone,Email
public class Contact implements Comparable<Contact>{
    private final String name;
    private final String sex;
    private String profession, phoneNumber, email;
    private int age;

    public Contact(String name, String sex, String profession, String phoneNumber, String email, int age){
        this.name = name;
        this.sex = sex;
        setPhoneNumber(phoneNumber);
        setAge(age);
        setEmail(email);
        setProfession(profession);
    }

    public String toString(){
        // “<Nome>,<Idade>anos,sexo<Sexo>,<Profissão>,telefonen.º<Telefone>,e-mail:<Email>”
        String s = this.getName() + ", " + this.getAge() + " anos, " + this.getSex() + ", " + this.getProfession() + ", " + this.getEmail() + ", " + this.getPhoneNumber();
        return  s;
    }

    public int compareTo(Contact c){
        // ordem crescente de nomes
        return this.getName().compareTo(c.getName());
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getProfession() {
        return profession;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
