package ListManagerP;

//Nome,Idade,Sexo,Profissão,Telefone,Email
public class Contact implements Comparable<Contact>{
    private final String name;
    private String phoneNumber, email;

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String toString(){
        // “<Nome>,<Idade>anos,sexo<Sexo>,<Profissão>,telefonen.º<Telefone>,e-mail:<Email>”
        String s = this.getName() + " " + this.getPhoneNumber() + " " + this.getEmail();
        return  s;
    }

    public int compareTo(Contact c){
        // ordem crescente de nomes
        return this.getName().compareTo(c.getName());
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
