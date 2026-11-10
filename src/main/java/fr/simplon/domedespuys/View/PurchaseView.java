package fr.simplon.domedespuys.View;

public class PurchaseView {

    public interface Id {}
    public interface Number {}
    public interface CreatedAt {}
    public interface Status {}
    public interface User {}
    public interface Address {}
    public interface PurchasesProducts {}

    public interface PurchaseListView extends Number, CreatedAt, Status, User, Address {}
    public interface PurchaseDetailView extends PurchaseListView, PurchasesProducts {}
}
