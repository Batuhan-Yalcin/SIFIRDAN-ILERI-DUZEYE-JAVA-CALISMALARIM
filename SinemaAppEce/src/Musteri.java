public class Musteri extends BaseEntity {
    private String email;

    public Musteri(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", Adı: " + getName() + ", Email: " + email);
    }
}
