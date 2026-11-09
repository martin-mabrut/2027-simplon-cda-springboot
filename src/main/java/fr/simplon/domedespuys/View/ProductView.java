package fr.simplon.domedespuys.View;

public class ProductView {

    public interface Id {}
    public interface Label {}
    public interface Description {}
    public interface Price {}
    public interface Slug {}
    public interface CreatedAt {}
    public interface Brand {}
    public interface Images {}

    public interface ProductListView extends Label,Price, Slug {}
    public interface ProductDetailView extends ProductListView, Description, Brand, Images {}

}
