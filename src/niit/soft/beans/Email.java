package niit.soft.beans;

public class Email {
    private String mailAdd;
    private boolean email;

    public Email(String mailAdd, boolean email) {
        this.mailAdd = mailAdd;
        this.email = email;
    }

    public String getMailAdd() {
        return mailAdd;
    }

    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }

    public boolean isEmail() {
        String regex="\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        return mailAdd.matches(regex);
    }
    public void setEmail(boolean email) {
        this.email = email;
    }
}
