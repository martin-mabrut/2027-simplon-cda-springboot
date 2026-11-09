package fr.simplon.domedespuys.View;

public class BrandView {

    public interface Id {}
    public interface Label {}
    public interface Logo {}
    public interface Slug {}
    public interface Products {}

    public interface BrandListView extends Label, Slug {}
    public interface BrandDetailView extends BrandListView, Logo, Products {}

}
