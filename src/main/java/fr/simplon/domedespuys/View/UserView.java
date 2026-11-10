package fr.simplon.domedespuys.View;

public class UserView {
    public interface Id {}
    public interface Email {}
    public interface Password {}
    public interface Firstname {}
    public interface Lastname {}
    public interface Phone {}
    public interface Addresses {}

    public interface UserListView extends Firstname, Email {}
    public interface UserDetailView extends Email, Firstname, Lastname, Phone, Addresses {}
}
